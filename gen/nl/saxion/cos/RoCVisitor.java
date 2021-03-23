// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year 2/Compilers_OS/31/src\RoC.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link RoCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RoCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(RoCParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link RoCParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(RoCParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityEquals}
	 * labeled alternative in {@link RoCParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityEquals(RoCParser.EqualityEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityNotEquals}
	 * labeled alternative in {@link RoCParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityNotEquals(RoCParser.EqualityNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(RoCParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionInParen(RoCParser.LogicalExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVariable}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariable(RoCParser.LocalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAndOr}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link RoCParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEAN(RoCParser.BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RoCParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionParens(RoCParser.ComparisonExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(RoCParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UMINUS}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUMINUS(RoCParser.UMINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(RoCParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENGRP(RoCParser.PARENGRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER(RoCParser.IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULOPGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULOPGRP(RoCParser.MULOPGRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDOPGRP}
	 * labeled alternative in {@link RoCParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDOPGRP(RoCParser.ADDOPGRPContext ctx);
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
	 * Visit a parse tree produced by {@link RoCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(RoCParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoCParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(RoCParser.Variable_declarationContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link RoCParser#type_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_value(RoCParser.Type_valueContext ctx);
}