package nl.saxion.cos;

import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Variable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator extends RoCBaseVisitor<List<String>>
{

    private String jumpLabel;
    private String endIfLabel;
    private boolean isLogicalOR = false;
    private int labelCounter = 0;
    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<Variable> scope;

    public CodeGenerator( ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<Variable> scope)
    {
        this.dataTypes = dataTypes;
        this.scope = scope;
    }

    @Override
    public List<String> visitProgram(RoCParser.ProgramContext ctx)
    {

        ArrayList<String> data = new ArrayList<>();
        for(ParseTree child : ctx.children) {
            List<String> result = visit(child);
            if (result != null) data.addAll(visit(child));
        }
        return data;
    }

    @Override
    public List<String> visitMethod_declaration(RoCParser.Method_declarationContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        String name = ctx.methodName.getText();
        if (name.equals("main"))
        {
            jasminCode.add(".method public static main([Ljava/lang/String;)V");
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
        }
        else
        {
            //todo implement this
            System.out.println("another method called "+name);
        }
        jasminCode.addAll(visit(ctx.body));
        return jasminCode;
    }

    @Override
    public List<String> visitStatement_body(RoCParser.Statement_bodyContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        for (ParseTree child:ctx.children)
        {
            jasminCode.addAll(visit(child));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitConditions(RoCParser.ConditionsContext ctx)
    {
        return new ArrayList<>(visit(ctx.logical_expr()));
    }

    @Override
    public List<String> visitComparisonExpression(RoCParser.ComparisonExpressionContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        for (ParseTree child:ctx.children)
        {
            jasminCode.addAll(visit(child));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitComparisonExpressionParens(RoCParser.ComparisonExpressionParensContext ctx)
    {
        return new ArrayList<>(visit(ctx.comparison_expr()));
    }

    @Override
    public List<String> visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jumpLabel = "L"+ (labelCounter++);
        endIfLabel = "endif"+labelCounter;
        jasminCode.addAll(visit(ctx.left));
        jasminCode.addAll(visit(ctx.right));
        if (dataTypes.get(ctx) != null)
        {
            // call equals method
            jasminCode.add("invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z");
            if(ctx.comparator().getText().equals("="))
                jasminCode.add("ifeq "+jumpLabel);
            else if (ctx.comparator().getText().equals("!="))
                jasminCode.add("ifne "+jumpLabel);
        }
        else
        {
            jasminCode.addAll(visit(ctx.comparator()));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        //generated random label
        jumpLabel = "L"+ (labelCounter++);
        String tempLabel = jumpLabel;
        endIfLabel = "endif"+labelCounter;
        boolean isLogicalOrTemp = ctx.OR() != null;
        isLogicalOR = isLogicalOrTemp;

        jasminCode.addAll(visit(ctx.left));
        if (isLogicalOrTemp)
            jumpLabel = "L"+ (labelCounter++);

        jasminCode.addAll(visit(ctx.right));
        if (isLogicalOrTemp)
            jasminCode.add(tempLabel+":");
        return jasminCode;
    }

    @Override
    public List<String> visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        //todo add endif label counter for nested if statements

        if (ctx.if_lhs != null)
        {
            jasminCode.addAll(visit(ctx.if_lhs));
            jasminCode.addAll(visit(ctx.if_rhs));
            if (ctx.else_lhs != null || ctx.elseIF_lhs != null)
                jasminCode.add("goto "+endIfLabel);
        }
        if(ctx.elseIF_lhs != null)
        {
            jasminCode.add(jumpLabel+":");
            jumpLabel = "L"+(labelCounter++);
            jasminCode.addAll(visit(ctx.elseIF_lhs));
            jasminCode.addAll(visit(ctx.elseIF_rhs));
            if (ctx.else_lhs != null)
                jasminCode.add("goto "+endIfLabel);
        }
        if (ctx.else_lhs != null)
        {
            jasminCode.add(jumpLabel+":");
            jasminCode.addAll(visit(ctx.else_lhs));
        }
        if (ctx.else_lhs != null || ctx.elseIF_lhs != null)
        {
            jasminCode.add(endIfLabel+":");
        }
        else
        {
            jasminCode.add(jumpLabel+":");
        }
        return jasminCode;
    }

    @Override
    public List<String> visitComparator(RoCParser.ComparatorContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        if(ctx.GT() != null) // >
        {
            if (isLogicalOR)
                jasminCode.add("if_icmpgt "+ (jumpLabel));
            else
                jasminCode.add("if_icmple "+ (jumpLabel));
        }
        else if(ctx.GE() != null) //  >=
        {
            if (isLogicalOR)
                jasminCode.add("if_icmpge "+ (jumpLabel));
            else
                jasminCode.add("if_icmplt "+ (jumpLabel));
        }
        else if(ctx.LT() != null)//  <
        {
            if (isLogicalOR)
                jasminCode.add("if_icmplt "+ (jumpLabel));
            else
                jasminCode.add("if_icmpge "+ (jumpLabel));
        }
        else if(ctx.LE() != null) // <=
        {
            if (isLogicalOR)
                jasminCode.add("if_icmple "+ (jumpLabel));
            else
                jasminCode.add("if_icmpgt "+ (jumpLabel));
        }
        else if (ctx.EQ() != null)// =
        {
            if (isLogicalOR)
                jasminCode.add("if_icmpeq "+ (jumpLabel));
            else
                jasminCode.add("if_icmpne "+ (jumpLabel));
        }
        else if (ctx.NOT_EQ() != null)// !=
        {
            if (isLogicalOR)
                jasminCode.add("if_icmpne "+ (jumpLabel));
            else
                jasminCode.add("if_icmpeq "+ (jumpLabel));
        }
        isLogicalOR = false;
        return jasminCode;
    }

    /**
     * Process MULTIPLY, DIVIDE, MODULO
     * @param ctx context
     * @return nothing
     */
    @Override
    public List<String> visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.addAll(visit(ctx.left));
        jasminCode.addAll(visit(ctx.right));
        if (ctx.MULTIPLY() != null)
        {
            jasminCode.add("imul");
        }
        else if (ctx.DIVIDE() != null)
        {
            jasminCode.add("idiv");
        }
        else if (ctx.MODULO() != null)
        {
            jasminCode.add("irem");
        }
        return jasminCode;
    }

    /**
     * Process PLUS and MINUS operations
     * @param ctx of expression
     * @return null
     */
    @Override
    public List<String> visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();

        jasminCode.addAll(visit(ctx.left));
        jasminCode.addAll(visit(ctx.right));
        if (ctx.PLUS() != null)
        {
            jasminCode.add("iadd");
        }
        else if (ctx.MINUS() != null)
        {
            jasminCode.add("isub");
        }
        return jasminCode;
    }

    @Override
    public List<String> visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.add("ldc "+ctx.getText());
        return jasminCode;
    }

    @Override
    public List<String> visitSTRING(RoCParser.STRINGContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.add("ldc "+ctx.getText());
        return jasminCode;
    }

    @Override
    public List<String> visitBOOLEAN(RoCParser.BOOLEANContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();

        if (ctx.BOOLEAN().getText().equals("ADEVARAT"))
        {
            jasminCode.add("ldc 1");
        } else
        {
            jasminCode.add("ldc 0");
        }
        return jasminCode;
    }

    @Override
    public List<String> visitIDENTIFIER(RoCParser.IDENTIFIERContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        Variable variable = scope.get(ctx);
        if (variable.getType() == DataType.SDC)
            jasminCode.add("aload "+variable.getIndex());
        else
            jasminCode.add("iload "+variable.getIndex());
        return jasminCode;
    }

    /**
     * Visit printStatement
     * @param ctx of printStatement
     */
    @Override
    public List<String> visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();

        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

        jasminCode.addAll(visit(ctx.type_value()));
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
            jasminCode.add("invokevirtual java/io/PrintStream/println(Z)V");
        }

        return jasminCode;
    }

    @Override
    public List<String> visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        Variable var = scope.get(ctx);

        jasminCode.addAll(visit(ctx.arithmetic_expr()));
        switch (dataTypes.get(ctx))
        {
            case NUMAR:
            case BOOL:
                jasminCode.add("istore " + var.getIndex());
                break;
            case SDC:
                jasminCode.add("astore " + var.getIndex());
                break;
        }
        return jasminCode;
    }

    @Override
    public List<String> visitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx)
    {
        String name = ctx.IDENTIFIER().getText();
        Variable var = scope.get(ctx);

        List<String> jasminCode = new ArrayList<>(visit(ctx.arithmetic_expr()));
        jasminCode.add("istore "+var.getIndex());

        return jasminCode;
    }

    @Override
    public List<String> visitType_value(RoCParser.Type_valueContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        if (ctx.IDENTIFIER() != null)
        {
            //todo check this if can be removed or if it's a good practice
            Variable var = scope.get(ctx);
            switch (var.getType())
            {
                case NUMAR:
                    jasminCode.add("iload "+var.getIndex());
                    jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
                    break;
                case SDC:
                    jasminCode.add("aload "+var.getIndex());
                    jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                    break;
                case BOOL:
                    jasminCode.add("iload "+var.getIndex());
                    jasminCode.add("invokevirtual java/io/PrintStream/println(Z)V");
                    break;
            }
            return jasminCode;
        }

        switch (dataTypes.get(ctx))
        {
            case SDC:
                jasminCode.add("ldc " + ctx.STRING().getText());
                break;
            case BOOL:
                if (ctx.BOOLEAN().getText().equals("ADEVARAT"))
                {
                    jasminCode.add("ldc 1");
                }
                else
                {
                    jasminCode.add("ldc 0");
                }
                break;
            case NUMAR:
                jasminCode.add("ldc " + ctx.NUMBER().getText());
                break;
        }
        return jasminCode;
    }

    /**
     *
     * @param ctx WhileLoopContext
     * @return generated bytecode for while loop
     */
    @Override
    public List<String> visitWhileLoop(RoCParser.WhileLoopContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        String loopJumpLabel = "Loop"+(labelCounter++);
        jumpLabel ="endLoop"+(labelCounter++);
        System.out.println("ctx "+ctx.getText());
        jasminCode.add(loopJumpLabel+":");
        jasminCode.addAll(visit(ctx.conditions()));
        jasminCode.addAll(visit(ctx.statement_body()));
        jasminCode.add("goto "+loopJumpLabel);
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }

    /**
     *
     * @param ctx DoWhileLoopContext
     * @return generated bytecode for while loop
     */
    @Override
    public List<String> visitDoWhileLoop(RoCParser.DoWhileLoopContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();

        String loopJumpLabel = "Loop"+(labelCounter++);
        jumpLabel ="endLoop"+(labelCounter++);
        jasminCode.add(loopJumpLabel+":");
        jasminCode.addAll(visit(ctx.conditions()));
        jasminCode.addAll(visit(ctx.statement_body()));
        jasminCode.add("goto "+loopJumpLabel);
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }

    /**
     *
     * @param ctx ForLoopContext
     * @return generated bytecode for for loop
     */
    @Override
    public List<String> visitForLoop(RoCParser.ForLoopContext ctx)
    {
        //todo do we want to implement this ?
        List<String> jasminCode = new ArrayList<>();

        String loopJumpLabel = "Loop"+(labelCounter++);
        jumpLabel ="endLoop"+(labelCounter++);
        jasminCode.addAll(visit(ctx.conditions()));
        jasminCode.addAll(visit(ctx.arithmetic_expr()));
        jasminCode.add("goto "+loopJumpLabel);
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }
}
