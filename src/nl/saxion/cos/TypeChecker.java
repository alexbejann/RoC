package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;
import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Variable;
import nl.saxion.cos.model.VariableTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class TypeChecker extends RoCBaseVisitor<DataType>
{
    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<Variable> scope;
    private VariableTable variableTable;
    private boolean failed = false;

    public TypeChecker(ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<Variable> scope, VariableTable variableTable)
    {

        this.dataTypes = dataTypes;
        this.scope = scope;
        this.variableTable = variableTable;
    }

    public boolean isFailed()
    {
        return failed;
    }

    @Override
    public DataType visitMethod_declaration(RoCParser.Method_declarationContext ctx)
    {
        //TODO in here open new scope and reset the counter of the VariableTable to 0
        if (ctx.returnType == null && ctx.returnValue != null)
        {
            throw new CompilerException("You can't return in a void method!");
        }
        else if (ctx.returnType != null && ctx.returnValue == null)
        {
            throw new CompilerException("The method should return: "+ctx.returnType.getText()+" type!");
        }

        String name = ctx.methodName.getText();

        name += "@";

        if (ctx.argument_list() != null)
        {
            visit(ctx.argument_list());
            for (ParseTree c :ctx.argument_list().children)
            {
                if (!(",".equals(c.getText()) || c instanceof TerminalNodeImpl))
                    name += variableTable.getTypeLetter(c.getChild(0).getText());
            }
        }
        if (ctx.returnType == null)
        {
            variableTable.add(name, null);
        }
        else
        {
            DataType returnType = visit(ctx.returnType);
            dataTypes.put(ctx, returnType);
            variableTable.add(name, returnType);
        }
        scope.put(ctx, variableTable.lookUp(name));

        variableTable = variableTable.openMethodScope();
        if (ctx.body != null)
            visitChildren(ctx.body);
        if (ctx.returnValue != null)
        {
            DataType type = visit(ctx.returnValue);// SCURT
            DataType returnType = dataTypes.get(ctx); // NUMAR
            if (!(returnType == DataType.NUMAR && type == DataType.SCURT))
            {
                if (!type.equals(returnType))
                    throw new CompilerException("The method should return: "+ctx.returnType.getText()+" type! Not "+type);
            }
        }
        variableTable = variableTable.getParentScope();

        return null;
    }

    @Override
    public DataType visitMethodCall(RoCParser.MethodCallContext ctx)
    {
        //todo check if the method already exists if so,
        // throw exception
        String identifier = ctx.IDENTIFIER().getText();

        String name = identifier.concat("@");

        if (ctx.functionArgumentList() != null)
        {
            visitChildren(ctx.functionArgumentList());

            for (ParseTree c : ctx.functionArgumentList().children)
            {
                if (!(",".equals(c.getText()) || c instanceof TerminalNodeImpl))
                {
                    name += variableTable.getTypeLetter(dataTypes.get(c).toString());
                }
            }
        }

        Variable var = variableTable.lookUp(name);
        if (var == null)
        {
            throw new CompilerException("Method was not defined, or the parameters don't match!");
        }

        scope.put(ctx, var);
        dataTypes.put(ctx, var.getType());
        return var.getType();
    }

    @Override
    public DataType visitArgument_list(RoCParser.Argument_listContext ctx)
    {
        for (int i = 0; i < ctx.type().size(); i++)
        {
            DataType type = visit(ctx.type(i));
            String name = ctx.IDENTIFIER(i).getText();
            if (type != null && name != null)
            {
                variableTable.add(name, type);
            }
        }
        return null;
    }

    @Override
    public DataType visitType(RoCParser.TypeContext ctx)
    {
        if (ctx.STRING_TYPE() != null)
        {
            dataTypes.put(ctx,DataType.SDC);
            return DataType.SDC;
        }
        else if (ctx.BOOLEAN_TYPE() != null)
        {
            dataTypes.put(ctx,DataType.BOOL);
            return DataType.BOOL;
        }
        else if (ctx.SHORT_TYPE() != null)
        {
            dataTypes.put(ctx,DataType.SCURT);
            return DataType.SCURT;
        }
        else if (ctx.NUMBER_TYPE() != null)
        {
            dataTypes.put(ctx,DataType.NUMAR);
            return DataType.NUMAR;
        }
        else if (ctx.getText().equals("automat"))
        {
            throw new CompilerException("automat data type can't be used as an argument list: "+ctx.getText());
        }
        throw new CompilerException("Unrecognized data type: "+ctx.getText());
    }

    @Override
    public DataType visitBlock(RoCParser.BlockContext ctx)
    {
        variableTable = variableTable.openScope();
        visitChildren(ctx);
        variableTable = variableTable.getParentScope();
        return null;
    }

    @Override
    public DataType visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        DataType leftHS = visit(ctx.left);
        DataType rightHS = visit(ctx.right);
        if (leftHS != rightHS && !(rightHS == DataType.SCURT || leftHS == DataType.SCURT) )
            throw new CompilerException("You can't compare "+leftHS+" with "+rightHS);

        if (leftHS == DataType.SDC && rightHS == DataType.SDC)
        {
            dataTypes.put(ctx, DataType.SDC);
        }
        visit(ctx.comparator());

        return leftHS;
    }

    @Override
    public DataType visitLogicalExpressionAnd(RoCParser.LogicalExpressionAndContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public DataType visitLogicalExpressionOr(RoCParser.LogicalExpressionOrContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public DataType visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public DataType visitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx)
    {
        visit(ctx.expr());
        String name = ctx.IDENTIFIER().getText();
        Variable var = variableTable.lookUp(name);
        if (var == null)
            throw new CompilerException("Variable "+name+" not defined");

        scope.put(ctx, var);
        return var.getType();
    }

    @Override
    public DataType visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        //visit the rhs and the lhs and
        DataType type = visit(ctx.rhs);
        String name = ctx.lhs.getText();
        if (variableTable.lookUpLocal(name) != null)
            throw new CompilerException("Variable "+name+" already defined!");

        switch (ctx.type().getText())
        {
            case "scurt":
                if (type != DataType.SCURT)
                    throw new CompilerException("Type mismatch expected short! scurt can hold numbers from 0 to 9, negatives as well.");

                variableTable.add(name, DataType.SCURT);
                break;
            case "numar":
                if (type != DataType.NUMAR && type != DataType.SCANNER && type != DataType.SCURT)
                    throw new CompilerException("Type mismatch expected numar!");

                variableTable.add(name, DataType.NUMAR);
                break;
            case "sdc":
                if (type != DataType.SDC && type != DataType.SCANNER)
                    throw new CompilerException("Type mismatch expected sdc!");

                variableTable.add(name, DataType.SDC);
                break;
            case "bool":
                if (!(ctx.rhs instanceof RoCParser.ComparisonExpressionWithOperatorContext) &&
                        !(ctx.rhs instanceof RoCParser.LogicalExpressionAndContext) &&
                        !(ctx.rhs instanceof RoCParser.LogicalExpressionOrContext))
                {
                    if (type != DataType.BOOL )
                        throw new CompilerException("Type mismatch expected bool!");
                }

                System.out.println("bool " + ctx.getText());
                variableTable.add(name, DataType.BOOL);
                break;
            case "automat":
                if (type == DataType.SDC)
                {
                    variableTable.add(name, DataType.SDC);
                } else if (type == DataType.NUMAR)
                {
                    variableTable.add(name, DataType.NUMAR);
                } else if (type == DataType.BOOL)
                {
                    variableTable.add(name, DataType.BOOL);
                }
                else if (type == DataType.SCURT)
                {
                    variableTable.add(name, DataType.SCURT);
                }
                break;
            default:
                throw new CompilerException("Unrecognized data type: "+ctx.type().getText());
        }
        dataTypes.put(ctx, variableTable.lookUp(name).getType());
        scope.put(ctx, variableTable.lookUp(name));
        return variableTable.lookUp(name).getType();
    }

    @Override
    public DataType visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        DataType type = visit(ctx.expr());
        dataTypes.put(ctx, type);
        return type;
    }

    @Override
    public DataType visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);
        if (!(left == DataType.NUMAR && right == DataType.SCURT  || left == DataType.SCURT && right == DataType.NUMAR))
        {
            if (!left.equals(right))
            {
                throw new CompilerException("Unsupported operation: "+ctx.getText());
            }
        }
        dataTypes.put(ctx,visit(ctx.left));
        return visit(ctx.left);
    }

    @Override
    public DataType visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);
        if (!(left == DataType.NUMAR && right == DataType.SCURT  || left == DataType.SCURT && right == DataType.NUMAR))
        {
            if (!left.equals(right))
            {
                throw new CompilerException("Unsupported operation: "+ctx.getText());
            }
        }
        dataTypes.put(ctx,visit(ctx.left));
        return visit(ctx.left);
    }

    @Override
    public DataType visitPARENGRP(RoCParser.PARENGRPContext ctx)
    {
        return visit(ctx.expr());
    }

    @Override
    public DataType visitSHORT(RoCParser.SHORTContext ctx)
    {
        dataTypes.put(ctx, DataType.SCURT);//Needed for argument list context
        return DataType.SCURT;
    }

    @Override
    public DataType visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        dataTypes.put(ctx, DataType.NUMAR);//Needed for argument list context
        return DataType.NUMAR;
    }

    @Override
    public DataType visitBOOLEAN(RoCParser.BOOLEANContext ctx)
    {
        dataTypes.put(ctx, DataType.BOOL);//Needed for argument list context
        return DataType.BOOL;
    }

    @Override
    public DataType visitSTRING(RoCParser.STRINGContext ctx)
    {
        dataTypes.put(ctx, DataType.SDC);//Needed for argument list context
        return DataType.SDC;
    }

    @Override
    public DataType visitIDENTIFIER(RoCParser.IDENTIFIERContext ctx)
    {
        String name = ctx.IDENTIFIER().getText();
        Variable var = variableTable.lookUp(name);
        if (var == null)
            throw new CompilerException("Variable "+name+" not defined");

        //todo check if this can be removed
        scope.put(ctx, var);
        return var.getType();
    }

    @Override
    public DataType visitScannerCall(RoCParser.ScannerCallContext ctx)
    {
        return DataType.SCANNER;
    }
}
