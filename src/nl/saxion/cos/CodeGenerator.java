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
    private boolean isString = false;
    private int labelCounter = 0;
    private final ParseTreeProperty<DataType> dataTypes;
    private final ParseTreeProperty<Variable> scope;
    private final String className;

    public CodeGenerator( ParseTreeProperty<DataType> dataTypes, ParseTreeProperty<Variable> scope, String className)
    {
        this.dataTypes = dataTypes;
        this.scope = scope;
        this.className = className;
    }

    /**
     * This method visits all the children from root 'program' in antlr
     * The method is supposed to visit every node of the generated tree
     * @param ctx ProgramContext
     * @return jasminCode
     */
    @Override
    public List<String> visitProgram(RoCParser.ProgramContext ctx)
    {

        List<String> data = new ArrayList<>();
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
        DataType returnDataType = dataTypes.get(ctx);
        if (name.equals("main"))
        {
            jasminCode.add(".method public static main([Ljava/lang/String;)V");
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
        }
        else
        {
            //Use StringBuilder to avoid having parameters on separate lines
            StringBuilder argumentList = new StringBuilder();
            StringBuilder returnType = new StringBuilder();
            if (ctx.argument_list() != null)
            {
                for (String s : visit(ctx.argument_list()))
                {
                    argumentList.append(s);
                }
            }

            if (ctx.returnType != null)
            {
                for (String s: visit(ctx.type()))
                {
                    returnType.append(s);
                }
            }

            String methodDeclaration = "";
            methodDeclaration+= ".method public static ";
            methodDeclaration+= name;
            methodDeclaration+= "(";
            methodDeclaration+= argumentList.toString();
            //check if there is a return type
            if (dataTypes.get(ctx) == null)
            {
                methodDeclaration+= ")V";//TODO specificy the return type here now it returns oid everytime
            }
            else
            {
                methodDeclaration += ")";
                methodDeclaration += returnDataType.getByteType();
            }

            jasminCode.add(methodDeclaration);
            jasminCode.add(".limit stack 10");
            jasminCode.add(".limit locals 10");
        }
        jasminCode.addAll(visit(ctx.body));
        //check if there is a return type
        if (returnDataType != null)
        {
            jasminCode.addAll(visit(ctx.returnValue));

            //load the return type
            if (returnDataType.equals(DataType.NUMAR) || returnDataType.equals(DataType.BOOL))
            {
                jasminCode.add("ireturn");
            }
            else
            {
                jasminCode.add("areturn");
            }
        }
        else
        {
            jasminCode.add("return");
        }
        jasminCode.add(".end method");
        return jasminCode;
    }

    @Override
    public List<String> visitType(RoCParser.TypeContext ctx) {
        //todo replace this to get the right type from the variable table
        // instead of having this switch implementation
        List<String> jasminCode = new ArrayList<>();
        switch (dataTypes.get(ctx))
        {
            case SDC:
                jasminCode.add("Ljava/lang/String;");
                break;
            case NUMAR:
                jasminCode.add("I");
                break;
            case BOOL:
                jasminCode.add("Z");
                break;
            default:
                jasminCode.add("V");
        }
        return jasminCode;
    }

    @Override
    public List<String> visitArgument_list(RoCParser.Argument_listContext ctx) {
        List<String> jasminCode = new ArrayList<>();
        for (ParseTree child : ctx.children)
        {
            if (child instanceof RoCParser.TypeContext)
            {
                jasminCode.addAll(visit(child));
            }
        }
        return jasminCode;
    }

    @Override
    public List<String> visitMethodCall(RoCParser.MethodCallContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        String methodName = ctx.IDENTIFIER().getText();
        Variable var = scope.get(ctx);
        //todo please refine this hardcoded return value void, also the return type should be
        // after the argumentslist is returned
        String parameters = "()";
        String returnType = "V";
        //check return type
        if (dataTypes.get(ctx) != null)
        {
            switch (dataTypes.get(ctx))
            {
                case SDC:
                    returnType = "Ljava/lang/String;";
                    break;
                case NUMAR:
                    returnType = "I";
                    break;
                case BOOL:
                    returnType = "Z";
                    break;
            }
        }
        // if arguments list is null means, no parameters
        if (ctx.functionArgumentList() != null)//todo load parameters
        {
            //load arguments
            jasminCode.addAll(visit(ctx.functionArgumentList()));
            //add parameters types to function call
            parameters =  "("+var.getName().split("@", 2)[1] +")";
        }

        parameters += returnType;
        String methodInvoke = "invokestatic "+ className +"/"+ methodName;
        methodInvoke += parameters;
        jasminCode.add(methodInvoke);//todo arguments should be added between the curly brackets and

        return jasminCode;
    }

    @Override
    public List<String> visitMethodCallArgumentList(RoCParser.MethodCallArgumentListContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        //todo implement the arguments for this
        for (ParseTree c: ctx.type_value())
        {
            jasminCode.addAll(visit(c));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitBlock(RoCParser.BlockContext ctx)
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
        //generated random label
        jumpLabel = "L"+ (labelCounter++);
        endIfLabel = "endif";
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

    /**
     * The method is processing the if statements with operators
     * The method is also responsible of the equals function when 2 strings
     * are compared
     * @param ctx ComparisonExpressionWithOperatorContext
     * @return jasminCode
     */
    @Override
    public List<String> visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
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

    /**
     * This method handles the process of the if
     * statements that contains '&&' and/or '||'
     * @param ctx LogicalExpressionAndOrContext
     * @return jasminCode with the if statement generated
     */
    @Override
    public List<String> visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        String tempLabel = jumpLabel;
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
            else
                jasminCode.add(jumpLabel+":");
        }
        if(ctx.elseIF_lhs != null)
        {
            jasminCode.add(jumpLabel+":");
            jasminCode.addAll(visit(ctx.elseIF_lhs));
            jasminCode.addAll(visit(ctx.elseIF_rhs));
            if (ctx.else_lhs != null)
                jasminCode.add("goto "+endIfLabel);
            if (ctx.else_lhs == null)
                jumpLabel = "L"+(labelCounter++);
        }
        if (ctx.else_lhs != null)
        {
            jasminCode.add(jumpLabel+":");
            jasminCode.addAll(visit(ctx.else_lhs));
            jumpLabel = "L" + (labelCounter++);
        }
        if (ctx.else_lhs != null || ctx.elseIF_lhs != null)
        {
            jasminCode.add(endIfLabel+":");
        }

        return jasminCode;
    }

    /**
     * This method adds the comparator for the previous declare values
     * e.g.
     *  ldc 2
     *  ldc 5
     *  if_icmgt {@link CodeGenerator#jumpLabel}
     * @param ctx ComparatorContext
     * @return jasminCode that includes the comparator
     */
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
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitMULDIVMODOPGRP(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }

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

    @Override
    public List<String> visitPARENGRP(RoCParser.PARENGRPContext ctx)
    {
        return visit(ctx.arithmetic_expr());
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
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitADDSUBGRP(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }

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

    /**
     * Adds the number to the jasmin code
     * e.g. ldc 2
     * @param ctx NUMBERContext
     * @return jasminCode for the number
     */
    @Override
    public List<String> visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.add("ldc "+ctx.getText());
        return jasminCode;
    }

    /**
     * Adds the number to the jasmin code
     * e.g. ldc "Some string here"
     * @param ctx STRINGContext
     * @return jasminCode for the number
     */
    @Override
    public List<String> visitSTRING(RoCParser.STRINGContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.add("ldc "+ctx.getText());
        return jasminCode;
    }

    /**
     * Adds the proper boolean value to jasminCode
     * e.g.
     * bool a<- ADEVARAT
     * jasmin: ldc 1
     * @param ctx BOOLEANContext
     * @return jasminCode with proper boolean value
     */
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

    /**
     * Loads the proper variable from the stack
     * @param ctx IDENTIFIERContext
     * @return jasminCode with proper variable load from the stack
     */
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
     * Loads the proper variable from the stack
     * @param ctx SCANNERContext
     * @return jasminCode with proper variable load from the stack
     */
    @Override
    public List<String> visitSCANNER(RoCParser.SCANNERContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        jasminCode.add("new java/util/Scanner");
        jasminCode.add("dup");
        jasminCode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminCode.add("invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V");
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

        switch (dataTypes.get(ctx))
        {
            case NUMAR:
                jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
                break;
            case SDC:
                jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                break;
            case BOOL:
                jasminCode.add("invokevirtual java/io/PrintStream/println(Z)V");
                break;
        }

        return jasminCode;
    }

    /**
     * This method is handling the variables declaration
     * e.g.
     * sdc a<- "some string here"
     * @param ctx Variable_declarationContext
     * @return jasminCode to store the proper variable on the stack
     */
    @Override
    public List<String> visitVariable_declaration(RoCParser.Variable_declarationContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        Variable var = scope.get(ctx);
        if (var.getType().equals(DataType.SDC))
            isString = true;
        jasminCode.addAll(visit(ctx.arithmetic_expr()));
        switch (dataTypes.get(ctx))
        {
            case NUMAR:
            case BOOL:
                jasminCode.add("istore " + var.getIndex());
                break;
            case SCANNER:
            case SDC:
                jasminCode.add("astore " + var.getIndex());
                break;
        }
        return jasminCode;
    }

    /**
     *
     * @param ctx ScannerCallContext
     * @return loaded scanner object and invoked method
     */
    @Override
    public List<String> visitScannerCall(RoCParser.ScannerCallContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        Variable variable = scope.get(ctx);
        jasminCode.add("aload "+variable.getIndex());
        if (isString)
        {
            jasminCode.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
        }
        else
        {
            jasminCode.add("invokevirtual java/util/Scanner/nextInt()I");
        }
        isString = false;
        return jasminCode;
    }

    /**
     * The method is storing a value for a particular variable
     * e.g.
     * numar a <- 10
     * a <- 11, the value 10 is replaced with 11
     * @param ctx AssignmentExpression
     * @return jasminCode with the proper variable stored on the stack
     */
    @Override
    public List<String> visitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx)
    {
        Variable var = scope.get(ctx);

        List<String> jasminCode = new ArrayList<>(visit(ctx.arithmetic_expr()));
        jasminCode.add("istore "+var.getIndex());

        return jasminCode;
    }

    /**
     * Adds the variable from the stack and print parameter
     * @param ctx Type_valueContext
     * @return jasminCode with proper variable loaded from the stack and PrintStream parameter
     */
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
                case BOOL:
                    jasminCode.add("iload "+var.getIndex());
                    break;
                case SDC:
                    jasminCode.add("aload "+var.getIndex());
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
        jasminCode.addAll(visit(ctx.block()));
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
        jasminCode.addAll(visit(ctx.block()));
        jasminCode.add("goto "+loopJumpLabel);
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }
}
