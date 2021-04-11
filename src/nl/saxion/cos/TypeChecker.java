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
        visitChildren(ctx.body);
        if (ctx.returnValue != null)
        {
            DataType type = visit(ctx.returnValue);
            if (!type.equals(dataTypes.get(ctx)))
                throw new CompilerException("The method should return: "+ctx.returnType.getText()+" type! Not "+type);
        }
        variableTable = variableTable.getParentScope();

        return variableTable.lookUp(name).getType();
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
    public DataType visitConditions(RoCParser.ConditionsContext ctx)
    {
        visit(ctx.logical_expr());
        return null;
    }

    @Override
    public DataType visitComparisonExpression(RoCParser.ComparisonExpressionContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public DataType visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        DataType leftHS = visit(ctx.left);
        DataType rightHS = visit(ctx.right);
        if (leftHS != rightHS)
            throw new CompilerException("You can't compare "+leftHS+" with "+rightHS);

        if (leftHS == DataType.SDC && rightHS == DataType.SDC)
        {
            dataTypes.put(ctx, DataType.SDC);
        }
        visit(ctx.comparator());

        return null;
    }

    @Override
    public DataType visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx)
    {
        visitChildren(ctx);
        return null;
    }

    @Override
    public DataType visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        visitChildren(ctx);
        return null;
    }

    @Override
    public DataType visitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx)
    {
        visit(ctx.arithmetic_expr());
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
        DataType type = visit(ctx.arithmetic_expr());
        String name = ctx.lhs.getText();
        if (variableTable.lookUpLocal(name) != null)
            throw new CompilerException("Variable "+name+" already defined!");

        switch (ctx.type().getText())
        {
            case "numar":
                if (type != DataType.NUMAR)
                    throw new CompilerException("Type mismatch expected numar!");

                variableTable.add(name, DataType.NUMAR);
                break;
            case "sdc":
                if (type != DataType.SDC)
                    throw new CompilerException("Type mismatch expected sdc!");

                variableTable.add(name, DataType.SDC);
                break;
            case "bool":
                if (type != DataType.BOOL)
                    throw new CompilerException("Type mismatch expected bool!");

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
                break;
        }
        dataTypes.put(ctx, variableTable.lookUp(name).getType());
        scope.put(ctx, variableTable.lookUp(name));
        return variableTable.lookUp(name).getType();
    }

    @Override
    public DataType visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        DataType type = visit(ctx.type_value());
        dataTypes.put(ctx, type);
        return type;
    }

    @Override
    public DataType visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx)
    {
        if (!visit(ctx.left).equals(visit(ctx.right)))
        {
            failed = true;
        }
        dataTypes.put(ctx,visit(ctx.left));
        return visit(ctx.left);
    }

    @Override
    public DataType visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx)
    {
        if (!visit(ctx.left).equals(visit(ctx.right)))
        {
            failed = true;
        }
        dataTypes.put(ctx,visit(ctx.left));
        return visit(ctx.left);
    }

    @Override
    public DataType visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        return DataType.NUMAR;
    }

    @Override
    public DataType visitBOOLEAN(RoCParser.BOOLEANContext ctx)
    {
        return DataType.BOOL;
    }

    @Override
    public DataType visitSTRING(RoCParser.STRINGContext ctx)
    {
        return DataType.SDC;
    }

    @Override
    public DataType visitType_value(RoCParser.Type_valueContext ctx)
    {
        if (ctx.STRING() != null)
        {
            dataTypes.put(ctx,DataType.SDC);
            return DataType.SDC;
        }
        else if (ctx.BOOLEAN() != null)
        {
            dataTypes.put(ctx,DataType.BOOL);
            return DataType.BOOL;
        }
        else if (ctx.NUMBER() != null)
        {
            dataTypes.put(ctx,DataType.NUMAR);
            return DataType.NUMAR;
        }
        else if (ctx.IDENTIFIER() != null)
        {
            String name = ctx.IDENTIFIER().getText();
            Variable var = variableTable.lookUp(name);
            if (var == null)
                throw new CompilerException("Variable "+name+" not defined");

            dataTypes.put(ctx, variableTable.lookUp(name).getType());
            //todo check if this can be removed
            scope.put(ctx, var);
            return var.getType();
        }

        throw new CompilerException("Unrecognized data type");
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
}
