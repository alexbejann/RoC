package nl.saxion.cos;

import nl.saxion.cos.model.DataType;
import nl.saxion.cos.model.Variable;
import nl.saxion.cos.model.VariableTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class CodeGenerator extends RoCBaseVisitor<Void>
{

    private JasminBytecode jasminCode;
    private HashMap<String, Variable> variables = new HashMap<>();
    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<VariableTable> scope ;

    public CodeGenerator(JasminBytecode jasminBytecode, ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<VariableTable> scope)
    {
        this.jasminCode = jasminBytecode;
        this.dataTypes = dataTypes;
        this.scope = scope;
    }

    public JasminBytecode getJasminCode()
    {
        return jasminCode;
    }

    @Override
    public Void visitProgram(RoCParser.ProgramContext ctx)
    {

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
        visit(ctx.body);
        return null;
    }



    @Override
    public Void visitStatement_body(RoCParser.Statement_bodyContext ctx)
    {
        for (ParseTree child:ctx.children)
        {
            System.out.println("child "+child);
            visit(child);
        }
        System.out.println("ctx "+ctx);
        return null;
    }

    /**
     * Process MULTIPLY, DIVIDE, MODULO
     * @param ctx context
     * @return nothing
     */
    @Override
    public Void visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx)
    {
        visit(ctx.left);
        visit(ctx.right);
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
        return null;
    }

    /**
     * Process PLUS and MINUS operations
     * @param ctx of expression
     * @return null
     */
    @Override
    public Void visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx)
    {
        visit(ctx.left);
        visit(ctx.right);
        if (ctx.PLUS() != null)
        {
            jasminCode.add("iadd");
        }
        else if (ctx.MINUS() != null)
        {
            jasminCode.add("isub");
        }
        return null;
    }

    @Override
    public Void visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        jasminCode.add("ldc "+ctx.getText());
        return null;
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
                jasminCode.add("invokevirtual java/io/PrintStream/println(Z)V");
            }
        }
        else if (ctx.IDENTIFIER() != null)
        {
            //check context
            String name = ctx.IDENTIFIER().getText();
            System.out.println("Identifier "+ctx.IDENTIFIER().getText()+" "+name);
            //todo check ctx might differ
            Variable var = scope.get(ctx).lookUp(name);
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
        }

        return null;
    }

    @Override
    public Void visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        String name = ctx.lhs.getText();
        Variable var = scope.get(ctx).lookUp(name);
        if (ctx.arithmetic_expr() != null)
            visit(ctx.arithmetic_expr());

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
        /*if (ctx.arithmetic_expr() != null)
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
        }*/
        return null;
    }

    @Override
    public Void visitType_value(RoCParser.Type_valueContext ctx)
    {
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

    private Variable loadIdentifier(TerminalNode identifier)
    {
        Variable variable = getVariable(identifier.getText());

        switch (variable.getType())
        {
            case NUMAR:
                jasminCode.add("iload " + variable.getIndex());
                break;
            case SDC:

                break;
            case BOOL:

                break;
        }

        return getVariable(identifier.getText());
    }
}
