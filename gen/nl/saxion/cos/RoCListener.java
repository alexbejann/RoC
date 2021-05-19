// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year_2/Compilers_OS/retake/31/src\RoC.g4 by ANTLR 4.9.1
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoCParser}.
 */
public interface RoCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RoCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RoCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(RoCParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(RoCParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(RoCParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(RoCParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(RoCParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(RoCParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(RoCParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(RoCParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionInParen(RoCParser.LogicalExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionInParen(RoCParser.LogicalExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAndOr}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAndOr}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionParens(RoCParser.ComparisonExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionParens(RoCParser.ComparisonExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RoCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RoCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(RoCParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(RoCParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallArgumentList}
	 * labeled alternative in {@link RoCParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallArgumentList(RoCParser.MethodCallArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallArgumentList}
	 * labeled alternative in {@link RoCParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallArgumentList(RoCParser.MethodCallArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUBGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterADDSUBGRP(RoCParser.ADDSUBGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUBGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(RoCParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(RoCParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(RoCParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(RoCParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENGRP(RoCParser.PARENGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENGRP(RoCParser.PARENGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIER(RoCParser.IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIER(RoCParser.IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCANNER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterSCANNER(RoCParser.SCANNERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCANNER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitSCANNER(RoCParser.SCANNERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallSCANNER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterCallSCANNER(RoCParser.CallSCANNERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallSCANNER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitCallSCANNER(RoCParser.CallSCANNERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEAN(RoCParser.BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEAN(RoCParser.BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(RoCParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(RoCParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIVMODOPGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIVMODOPGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#decisionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecisionStatement(RoCParser.DecisionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#decisionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecisionStatement(RoCParser.DecisionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(RoCParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(RoCParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(RoCParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(RoCParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(RoCParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(RoCParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(RoCParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(RoCParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#scannerCall}.
	 * @param ctx the parse tree
	 */
	void enterScannerCall(RoCParser.ScannerCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#scannerCall}.
	 * @param ctx the parse tree
	 */
	void exitScannerCall(RoCParser.ScannerCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link RoCParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(RoCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link RoCParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(RoCParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(RoCParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RoCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RoCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoCParser#type_value}.
	 * @param ctx the parse tree
	 */
	void enterType_value(RoCParser.Type_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoCParser#type_value}.
	 * @param ctx the parse tree
	 */
	void exitType_value(RoCParser.Type_valueContext ctx);
}