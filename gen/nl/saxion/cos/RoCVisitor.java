// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year_2/Compilers_OS/retake/31/src\RoC.g4 by ANTLR 4.9.1
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RoCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RoCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RoCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RoCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(RoCParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(RoCParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDSUBGRP}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(RoCParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scannerCall}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerCall(RoCParser.ScannerCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING(RoCParser.STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAndOr}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENGRP(RoCParser.PARENGRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER(RoCParser.IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEAN(RoCParser.BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(RoCParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULDIVMODOPGRP}
	 * labeled alternative in {@link RoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RoCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(RoCParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallArgumentList}
	 * labeled alternative in {@link RoCParser#functionArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallArgumentList(RoCParser.MethodCallArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#decisionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecisionStatement(RoCParser.DecisionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(RoCParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(RoCParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(RoCParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(RoCParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link RoCParser#varExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(RoCParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(RoCParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RoCParser.TypeContext ctx);
}