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
        if (ctx.body != null)
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
            case SCURT:
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
                case SCURT:
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
        for (ParseTree c: ctx.expr())
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

    /**
     * The method is processing the if statements with operators
     * The method is also responsible of the equals function when 2 strings
     * are compared
     * @param ctx ComparisonExpressionWithOperatorContext
     * @return jasminCode
     */
    @Override
    public List<String> visitRelationalComparisonExpression(RoCParser.RelationalComparisonExpressionContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        // This optimizer should handle cases like this: 3 > 2 or 100+2 > 12*2
        // where constants are involved
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitRelationalComparisonExpression(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }
        //end optimizer

        //generate label
        if (ctx.parent instanceof RoCParser.Variable_declarationContext || jumpLabel == null)
        {
            jumpLabel = "L"+ (labelCounter++);
        }

        String localTempLabel = jumpLabel;
        jasminCode.addAll(visit(ctx.left));
        jasminCode.addAll(visit(ctx.right));
        if (dataTypes.get(ctx) != null)
        {
            // call equals method
            jasminCode.add("invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z");
            if(ctx.op.getText().equals("="))
                jasminCode.add("ifeq "+jumpLabel);
            else if (ctx.op.getText().equals("!="))
                jasminCode.add("ifne "+jumpLabel);
        }
        else
        {
            jasminCode.addAll(visit(ctx.op));
        }

        // This handles the boolean expression
        // e.g. bool a<- a*2 > 1
        if (ctx.parent instanceof RoCParser.Variable_declarationContext)
        {
            jasminCode.addAll(comparatorsBooleanExprHandler(jasminCode, localTempLabel));
        }

        return jasminCode;
    }

    private List<String> comparatorsBooleanExprHandler(List<String> jasminCode, String localTempLabel)
    {
        // for true value
        jasminCode.add("ldc 1");
        // increase counter for goto label
        jumpLabel = "L" + (labelCounter++);
        //create the goto with the new label
        String goToLabel = "goto " + jumpLabel;
        jasminCode.add(goToLabel);
        // use the local temporary label in case for a false value
        jasminCode.add(localTempLabel + ":");
        // for false value
        jasminCode.add("ldc 0");
        // add the next label for storing the variable
        jasminCode.add(jumpLabel + ":");
        return jasminCode;
    }

    /**
     * The method is processing the if statements with operators
     * The method is also responsible of the equals function when 2 strings
     * are compared
     * @param ctx ComparisonExpressionWithOperatorContext
     * @return jasminCode
     */
    @Override
    public List<String> visitEqualityComparisonExpression(RoCParser.EqualityComparisonExpressionContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        // This optimizer should handle cases like this: 3 > 2 or 100+2 > 12*2
        // where constants are involved
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitEqualityComparisonExpression(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }
        //end optimizer

        //generate label
        if (ctx.parent instanceof RoCParser.Variable_declarationContext || jumpLabel == null)
        {
            jumpLabel = "L"+ (labelCounter++);
        }

        String localTempLabel = jumpLabel;
        jasminCode.addAll(visit(ctx.left));
        jasminCode.addAll(visit(ctx.right));
        if (dataTypes.get(ctx) != null)
        {
            // call equals method
            jasminCode.add("invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z");
            if(ctx.op.getText().equals("="))
                jasminCode.add("ifeq "+jumpLabel);
            else if (ctx.op.getText().equals("!="))
                jasminCode.add("ifne "+jumpLabel);
        }
        else
        {
            jasminCode.addAll(visit(ctx.op));
        }

        // This handles the boolean expression
        // e.g. bool a<- a*2 > 1
        if (ctx.parent instanceof RoCParser.Variable_declarationContext)
        {
            // for true value
            jasminCode.addAll(comparatorsBooleanExprHandler(jasminCode, localTempLabel));
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
    public List<String> visitLogicalExpressionAnd(RoCParser.LogicalExpressionAndContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        // This optimizer is meant to handle easy operations without IDENTIFIERs
        // such as 1+23 > 2 || 32 < 233 && 2+2 > 1
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitLogicalExpressionAnd(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }
        // end optimizer

        jasminCode.addAll(visit(ctx.left));

        jasminCode.addAll(visit(ctx.right));

        // This handles the boolean expression
        // e.g. bool a<- a*2 > 1 || c > 200, bool a<- a*2 > 1 && c > 200
        if (ctx.parent instanceof RoCParser.Variable_declarationContext)
        {
            jasminCode.addAll(booleanExpressionHandling(jasminCode));
        }
        return jasminCode;
    }

    // This handles the boolean expression
    // e.g. bool a<- a*2 > 1 || c > 200, bool a<- a*2 > 1 && c > 200
    private List<String> booleanExpressionHandling(List<String> jasminCode)
    {
        // this part is to store if the expression is true
        jasminCode.add("ldc 1");
        // get a temp copy of the current jump label for later usage
        String localTempLabel = jumpLabel;
        // increase the jump label
        jumpLabel = "L" +(labelCounter++);
        // create and append the goto label with the new jump label
        String goToLabel = "goto " + jumpLabel;
        jasminCode.add(goToLabel);
        // use the local temporary label to store the false values of the expression
        jasminCode.add(localTempLabel+":");
        jasminCode.add("ldc 0");
        // append the new jump label to point where the istore of the boolean would come
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }

    /**
     * This method handles the process of the if
     * statements that contains '&&' and/or '||'
     * @param ctx LogicalExpressionAndOrContext
     * @return jasminCode with the if statement generated
     */
    @Override
    public List<String> visitLogicalExpressionOr(RoCParser.LogicalExpressionOrContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        // This optimizer is meant to handle easy operations without IDENTIFIERs
        // such as 1+23 > 2 || 32 < 233 && 2+2 > 1
        Optimizer optimizer = new Optimizer();
        Object calc = optimizer.visitLogicalExpressionOr(ctx);
        if (calc != null)
        {
            jasminCode.add("ldc "+calc);
            return jasminCode;
        }
        // end optimizer
        String tempLabel = jumpLabel;
        boolean isLogicalOrTemp = ctx.OR() != null;
        isLogicalOR = isLogicalOrTemp;

        jasminCode.addAll(visit(ctx.left));
        if (isLogicalOrTemp)
            jumpLabel = "L"+ (labelCounter++);

        jasminCode.addAll(visit(ctx.right));
        if (isLogicalOrTemp)
            jasminCode.add(tempLabel+":");

        // This handles the boolean expression
        // e.g. bool a<- a*2 > 1 || c > 200, bool a<- a*2 > 1 && c > 200
        if (ctx.parent instanceof RoCParser.Variable_declarationContext)
        {
            jasminCode.addAll(booleanExpressionHandling(jasminCode));
        }
        return jasminCode;
    }

    @Override
    public List<String> visitDecisionStatement(RoCParser.DecisionStatementContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        if (jumpLabel == null || (ctx.parent.parent instanceof RoCParser.DecisionStatementContext && ctx.else_lhs != null))
        {
            jumpLabel = "L"+ (labelCounter++);
        }
        String tempLocalLabel = jumpLabel;

        if (ctx.if_lhs != null)
        {
            jasminCode.addAll(visit(ctx.if_lhs));
            jasminCode.addAll(visit(ctx.if_rhs));
            // needed for nested ones
            if (ctx.else_lhs != null && ctx.parent.parent instanceof RoCParser.DecisionStatementContext)
            {
                jumpLabel = "L"+ (labelCounter++);
                jasminCode.add("goto "+jumpLabel);
            }
        }
        if (ctx.else_lhs != null)
        {
            // Check if the last item in the list is the goto from the if statement
            // if there is no goto, increase the jump label and add it.
            if (!jasminCode.get(jasminCode.size()-1).startsWith("goto"))
            {
                jumpLabel = "L"+ (labelCounter++);
                jasminCode.add("goto "+jumpLabel);
            }
            // add the temporary label
            jasminCode.add(tempLocalLabel+":");
            jasminCode.addAll(visit(ctx.else_lhs));
            if (ctx.parent.parent instanceof RoCParser.DecisionStatementContext)
            {
                jasminCode.add("goto "+jumpLabel);
                //jumpLabel = "L" + (labelCounter++);
            }
        }
        if (ctx.else_lhs != null && !(ctx.parent.parent instanceof RoCParser.DecisionStatementContext))
        {
            jasminCode.add(jumpLabel+":");
            //jumpLabel = "L" + (labelCounter++);
        }
        else if (ctx.else_lhs == null && !(ctx.parent.parent instanceof RoCParser.DecisionStatementContext))
        {
            jasminCode.add(jumpLabel+":");
            jumpLabel = "L" + (labelCounter++);
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
    public List<String> visitRelationalComparators(RoCParser.RelationalComparatorsContext ctx)
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
        isLogicalOR = false;
        return jasminCode;
    }

    @Override
    public List<String> visitEqualityOperators(RoCParser.EqualityOperatorsContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        if (ctx.EQ() != null)// =
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
        return visit(ctx.expr());
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
     * Adds the short to the jasmin code
     * e.g. ldc 2
     * SHORT doesn't support negative numbers
     * Because we don't like negative numbers :D
     * @param ctx SHORTContext
     * @return jasminCode for the short
     */
    @Override
    public List<String> visitSHORT(RoCParser.SHORTContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        String number = ctx.getText();
        // check if number contains $2
        if (number.contains("$"))
        {
            // replace $ with - sign e.g. -2
            number = number.replace("$","-");
        }
        // add bytecode
        jasminCode.add("ldc "+number);
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
        String number = ctx.getText();
        // check if number contains $2
        if (number.contains("$"))
        {
            // replace $ with - sign e.g. -2
            number = number.replace("$","-");
        }
        // add bytecode
        jasminCode.add("ldc "+number);
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
     * Visit printStatement
     * @param ctx of printStatement
     */
    @Override
    public List<String> visitPrintStatement(RoCParser.PrintStatementContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();

        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

        jasminCode.addAll(visit(ctx.expr()));

        switch (dataTypes.get(ctx))
        {
            case SCURT:
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
        jasminCode.addAll(visit(ctx.rhs));
        switch (dataTypes.get(ctx))
        {
            case SCURT:
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

    /**
     *
     * @param ctx ScannerCallContext
     * @return loaded scanner object and invoked method
     */
    @Override
    public List<String> visitScannerCall(RoCParser.ScannerCallContext ctx)
    {
        List<String> jasminCode = new ArrayList<>();
        // This represent the Scanner object
        // in normal java code this would look like this
        // (new Scanner(System.in)).nextInt() for Integer
        // or
        //(new Scanner(System.in)).nextLine() for String
        jasminCode.add("new java/util/Scanner");
        jasminCode.add("dup");
        jasminCode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminCode.add("invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V");
        // end Scanner Object instantiation
        if (isString)
        {
            // (new Scanner(System.in)).nextLine()
            jasminCode.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
        }
        else
        {
            //(new Scanner(System.in)).nextInt();
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

        List<String> jasminCode = new ArrayList<>(visit(ctx.expr()));
        jasminCode.add("istore "+var.getIndex());

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
        jasminCode.addAll(visit(ctx.expr()));
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
        jasminCode.addAll(visit(ctx.expr()));
        jasminCode.addAll(visit(ctx.block()));
        jasminCode.add("goto "+loopJumpLabel);
        jasminCode.add(jumpLabel+":");
        return jasminCode;
    }
}
