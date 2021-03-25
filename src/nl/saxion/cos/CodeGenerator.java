package nl.saxion.cos;

import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Operator;
import nl.saxion.cos.model.Variable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;

public class CodeGenerator extends RoCBaseVisitor<Void>
{

    private JasminBytecode jasminCode;
    private HashMap<String, Variable> variables = new HashMap<>();

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
        jasminCode.add(".method public static main([Ljava/lang/String;)V");
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");
        jasminCode.add("");

        for(ParseTree parseTree: ctx.children)
        {
            visit(parseTree);
        }

        jasminCode.add("return");
        jasminCode.add(".end method");
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

    /**
     * Process MULTIPLY, DIVIDE, MODULO
     * @param ctx context
     * @return nothing
     */
    @Override
    public Void visitMULOPGRP(RoCParser.MULOPGRPContext ctx)
    {
        if (ctx.MULTIPLY() != null)
        {
            System.out.println("plus op "+ Operator.valueOf(ctx.MULTIPLY().getText()));
        }
        else if (ctx.DIVIDE() != null)
        {
            System.out.println("plus op "+ctx.DIVIDE().getText());
        }
        else if (ctx.MODULO() != null)
        {
            System.out.println("plus op "+ctx.MODULO().getText());
        }
        return null;
    }

    /**
     * Process PLUS and MINUS operations
     * @param ctx of expression
     * @return null
     */
    @Override
    public Void visitADDOPGRP(RoCParser.ADDOPGRPContext ctx)
    {
        if (ctx.PLUS() != null)
        {
            System.out.println("plus op "+ctx.PLUS().getText()+" ");
        }
        else if (ctx.MINUS() != null)
        {
            System.out.println("plus op "+ctx.PLUS().getText());
        }
        return null;
    }

    @Override
    public Void visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        return super.visitDecisionStatement(ctx);
    }

    /**
     * Visit printStatement
     * @param ctx of printStatement
     */
    @Override
    public Void visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

        if (ctx.type_value() != null)
        {
            visit(ctx.type_value());
            if (ctx.type_value().NUMBER() != null)
            {
                jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
            }
            else if (ctx.type_value().STRING() != null)
            {
                jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            }
            else if (ctx.type_value().BOOLEAN() != null)
            {
                //todo add boolean here
            }
        }
        else if (ctx.IDENTIFIER() != null)
        {
            Variable variable = getVariable(ctx.IDENTIFIER().getText());

            if (variable.getType() == DataType.NUMAR)
            {
                jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
            }
            else if (variable.getType() == DataType.SDC)
            {
                jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            }
            else if (variable.getType() == DataType.AUTOMAT)
            {
                //todo check type
            }
        }

        return null;
    }

    @Override
    public Void visitIterationStatement(RoCParser.IterationStatementContext ctx)
    {
        return super.visitIterationStatement(ctx);
    }

    @Override
    public Void visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        if (ctx.arithmetic_expr() != null)
        {
            System.out.println("expression"+ctx.getText());
            visit(ctx.arithmetic_expr());
        }
        if (ctx.type().NUMBER_TYPE() != null)
        {
            System.out.println("number "+ctx.NUMBER()+" "+ctx.getText()+" "+ctx.IDENTIFIER(0).getText());
            addVariable(ctx.IDENTIFIER(0).getText(),DataType.NUMAR);
        }
        else if (ctx.type().STRING_TYPE() != null)
        {
            System.out.println("number "+ctx.STRING()+" "+ctx.getText());
        }
        else if (ctx.type().BOOLEAN_TYPE() != null)
        {
            System.out.println("number "+ctx.BOOLEAN()+" "+ctx.getText());
        }
        else if (ctx.type().AUTO_TYPE() != null)
        {
            System.out.println("number "+ctx.getText());
        }
        return null;
    }

    @Override
    public Void visitComparator(RoCParser.ComparatorContext ctx)
    {

        return null;
    }

    @Override
    public Void visitType(RoCParser.TypeContext ctx)
    {
        return null;
    }

    @Override
    public Void visitType_value(RoCParser.Type_valueContext ctx)
    {
        if (ctx.STRING() != null)
        {
            System.out.println(ctx.getText());
            jasminCode.add("ldc " + ctx.STRING().getText());
        }
        else if (ctx.BOOLEAN() != null)
        {
            System.out.println(ctx.getText());
            jasminCode.add("ldc " + ctx.BOOLEAN().getText());
        }
        else if (ctx.NUMBER() != null)
        {
            System.out.println(ctx.getText());
            jasminCode.add("ldc " + ctx.NUMBER().getText());
        }
        return null;
    }

    private Variable addVariable(String name, DataType type)
    {
        int position = variables.size() + 1;

        if(variables.containsKey(name))
        {
            name += position;
        }

        Variable var = new Variable(name, type, position);

        variables.put(name, var);

        return var;
    }

    private Variable getVariable(String name)
    {
        return variables.get(name);
    }
}
