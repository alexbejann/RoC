package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;

public class CodeGenerator extends RoCBaseVisitor<Void>
{

    private JasminBytecode jasminCode;

    public CodeGenerator(JasminBytecode jasminBytecode)
    {
        this.jasminCode = jasminBytecode;
    }

    public JasminBytecode getJasminCode()
    {
        return jasminCode;
    }

    @Override
    public Void visitProgram(RoCParser.ProgramContext ctx)
    {

        for(ParseTree parseTree: ctx.children) {
            visit(parseTree);
        }

        return null;
    }

    @Override
    public Void visitMethod_declaration(RoCParser.Method_declarationContext ctx)
    {
        return super.visitMethod_declaration(ctx);
    }

    @Override
    public Void visitStatement(RoCParser.StatementContext ctx)
    {
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitConditions(RoCParser.ConditionsContext ctx)
    {
        return super.visitConditions(ctx);
    }

    @Override
    public Void visitLogicalExpression(RoCParser.LogicalExpressionContext ctx)
    {
        return super.visitLogicalExpression(ctx);
    }

    @Override
    public Void visitEqualityEquals(RoCParser.EqualityEqualsContext ctx)
    {
        return super.visitEqualityEquals(ctx);
    }

    @Override
    public Void visitEqualityNotEquals(RoCParser.EqualityNotEqualsContext ctx)
    {
        return super.visitEqualityNotEquals(ctx);
    }

    @Override
    public Void visitComparisonExpression(RoCParser.ComparisonExpressionContext ctx)
    {
        return super.visitComparisonExpression(ctx);
    }

    @Override
    public Void visitLogicalExpressionInParen(RoCParser.LogicalExpressionInParenContext ctx)
    {
        return super.visitLogicalExpressionInParen(ctx);
    }

    @Override
    public Void visitLocalVariable(RoCParser.LocalVariableContext ctx)
    {
        return super.visitLocalVariable(ctx);
    }

    @Override
    public Void visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx)
    {
        return super.visitLogicalExpressionAndOr(ctx);
    }

    @Override
    public Void visitBOOLEAN(RoCParser.BOOLEANContext ctx)
    {
        return super.visitBOOLEAN(ctx);
    }

    @Override
    public Void visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        return super.visitComparisonExpressionWithOperator(ctx);
    }

    @Override
    public Void visitComparisonExpressionParens(RoCParser.ComparisonExpressionParensContext ctx)
    {
        return super.visitComparisonExpressionParens(ctx);
    }

    @Override
    public Void visitStatement_body(RoCParser.Statement_bodyContext ctx)
    {
        return super.visitStatement_body(ctx);
    }

    @Override
    public Void visitUMINUS(RoCParser.UMINUSContext ctx)
    {
        return super.visitUMINUS(ctx);
    }

    @Override
    public Void visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        return super.visitNUMBER(ctx);
    }

    @Override
    public Void visitPARENGRP(RoCParser.PARENGRPContext ctx)
    {
        return super.visitPARENGRP(ctx);
    }

    @Override
    public Void visitIDENTIFIER(RoCParser.IDENTIFIERContext ctx)
    {
        return super.visitIDENTIFIER(ctx);
    }

    @Override
    public Void visitMULOPGRP(RoCParser.MULOPGRPContext ctx)
    {
        return super.visitMULOPGRP(ctx);
    }

    @Override
    public Void visitADDOPGRP(RoCParser.ADDOPGRPContext ctx)
    {
        return super.visitADDOPGRP(ctx);
    }

    @Override
    public Void visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        return super.visitDecisionStatement(ctx);
    }

    @Override
    public Void visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Void visitIterationStatement(RoCParser.IterationStatementContext ctx)
    {
        return super.visitIterationStatement(ctx);
    }

    @Override
    public Void visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        return super.visitVariable_declaration(ctx);
    }

    @Override
    public Void visitComparator(RoCParser.ComparatorContext ctx)
    {
        return super.visitComparator(ctx);
    }

    @Override
    public Void visitType(RoCParser.TypeContext ctx)
    {
        return super.visitType(ctx);
    }

    @Override
    public Void visitType_value(RoCParser.Type_valueContext ctx)
    {
        return super.visitType_value(ctx);
    }
}
