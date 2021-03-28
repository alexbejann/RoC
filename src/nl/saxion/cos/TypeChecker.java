package nl.saxion.cos;


import nl.saxion.cos.exceptions.CompilerException;
import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Variable;
import nl.saxion.cos.model.VariableTable;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class TypeChecker extends RoCBaseVisitor<DataType>
{
    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<VariableTable> scope;
    private VariableTable variableTable;
    private boolean failed = false;

    public TypeChecker(ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<VariableTable> scope, VariableTable variableTable)
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
    public DataType visitStatement_body(RoCParser.Statement_bodyContext ctx)
    {
        scope.put(ctx,variableTable);
        variableTable = variableTable.openScope();
        visitChildren(ctx);
        variableTable = variableTable.getParentScope();
        return null;
    }

    @Override
    public DataType visitConditions(RoCParser.ConditionsContext ctx)
    {
        visit(ctx.equality_expr());
        return null;
    }

    @Override
    public DataType visitLogicalExpression(RoCParser.LogicalExpressionContext ctx)
    {
        visitChildren(ctx);
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
        return visitChildren(ctx);
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
    public DataType visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        //visit the rhs and the lhs and
        if (ctx.arithmetic_expr() != null)
            visit(ctx.arithmetic_expr());

        String name = ctx.lhs.getText();
        if (variableTable.lookUp(name) != null)
            throw new CompilerException("Variable "+name+" already defined!");

        switch (ctx.type().getText())
        {
            case "numar":
                System.out.println("numar "+ctx.getText());
                if (ctx.NUMBER() == null && ctx.arithmetic_expr() == null)
                    throw new CompilerException("Type mismatch expected numar!");

                variableTable.add(name, DataType.NUMAR);
                break;
            case "sdc":
                if (ctx.STRING() == null)
                    throw new CompilerException("Type mismatch expected sdc!");

                variableTable.add(name, DataType.SDC);
                break;
            case "bool":
                if (ctx.BOOLEAN() == null)
                    throw new CompilerException("Type mismatch expected bool!");
                System.out.println("bool " + ctx.getText());
                variableTable.add(name, DataType.BOOL);
                break;
            case "automat":
                if (ctx.STRING() != null)
                {
                    variableTable.add(name, DataType.SDC);
                } else if (ctx.NUMBER() != null || ctx.arithmetic_expr() != null)
                {
                    variableTable.add(name, DataType.NUMAR);
                } else if (ctx.BOOLEAN() != null)
                {
                    variableTable.add(name, DataType.BOOL);
                }
                break;
        }
        dataTypes.put(ctx, variableTable.lookUp(name).getType());
        scope.put(ctx, variableTable);
        return variableTable.lookUp(name).getType();
    }

    @Override
    public DataType visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        return visit(ctx.type_value());
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
            System.out.println(ctx.getText());
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
            scope.put(ctx, variableTable);
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

        dataTypes.put(ctx, variableTable.lookUp(name).getType());
        //todo check if this can be removed
        scope.put(ctx, variableTable);
        return var.getType();
    }
}
