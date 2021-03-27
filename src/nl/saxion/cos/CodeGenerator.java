package nl.saxion.cos;

import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Variable;
import nl.saxion.cos.model.VariableTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeGenerator extends RoCBaseVisitor<List<String>>
{

    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<VariableTable> scope ;

    public CodeGenerator( ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<VariableTable> scope)
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
            System.out.println("child "+child);
            jasminCode.addAll(visit(child));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitConditions(RoCParser.ConditionsContext ctx)
    {
        visit(ctx.equality_expr());
        return null;
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
        String name = ctx.lhs.getText();
        Variable var = scope.get(ctx).lookUp(name);
        if (ctx.arithmetic_expr() != null)
            jasminCode.addAll(visit(ctx.arithmetic_expr()));

        switch (dataTypes.get(ctx))
        {
            case NUMAR:
                if (ctx.arithmetic_expr() == null)
                    jasminCode.add("ldc " + ctx.NUMBER().getText());

                jasminCode.add("istore " + var.getIndex());
                break;
            case SDC:
                jasminCode.add("ldc " + ctx.STRING().getText());
                jasminCode.add("astore " + var.getIndex());
                break;
            case BOOL:
                if (ctx.BOOLEAN().getText().equals("ADEVARAT"))
                {
                    jasminCode.add("ldc 1");
                } else
                {
                    jasminCode.add("ldc 0");
                }
                jasminCode.add("istore " + var.getIndex());
                break;
        }
        return jasminCode;
    }

    @Override
    public List<String> visitType_value(RoCParser.Type_valueContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        if (ctx.IDENTIFIER() != null)
        {
            //todo check this if can be removed or if it's a good practice
            Variable var = scope.get(ctx).lookUp(ctx.IDENTIFIER().getText());
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
}
