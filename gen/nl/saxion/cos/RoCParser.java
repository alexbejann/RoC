// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year 2/Compilers_OS/31/src\RoC.g4 by ANTLR 4.9.1
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAREN_OPEN=1, PAREN_CLOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, STR_OPEN=5, 
		STR_CLOSE=6, SEMICOLON=7, COLON=8, DOT=9, COMMA=10, QUOTES=11, PLUS=12, 
		MINUS=13, MULTIPLY=14, DIVIDE=15, MODULO=16, NUMBER_TYPE=17, STRING_TYPE=18, 
		BOOLEAN_TYPE=19, AUTO_TYPE=20, While=21, If=22, Else=23, Else_If=24, Execute=25, 
		For=26, Print=27, Return=28, Method=29, BOOLEAN=30, STRING=31, NUMBER=32, 
		AND=33, OR=34, GT=35, GE=36, LT=37, LE=38, EQ=39, NOT=40, NOT_EQ=41, EQUALS=42, 
		EQUALS_TO=43, COMMENT_LINE=44, IDENTIFIER=45, WS=46;
	public static final int
		RULE_program = 0, RULE_method_declaration = 1, RULE_argument_list = 2, 
		RULE_conditions = 3, RULE_equality_expr = 4, RULE_logical_expr = 5, RULE_comparison_expr = 6, 
		RULE_statement_body = 7, RULE_arithmetic_expr = 8, RULE_decisionStatement = 9, 
		RULE_printStatement = 10, RULE_iterationStatement = 11, RULE_variable_declaration = 12, 
		RULE_comparator = 13, RULE_type = 14, RULE_type_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method_declaration", "argument_list", "conditions", "equality_expr", 
			"logical_expr", "comparison_expr", "statement_body", "arithmetic_expr", 
			"decisionStatement", "printStatement", "iterationStatement", "variable_declaration", 
			"comparator", "type", "type_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "'.'", 
			"','", "'\"'", "'+'", "'-'", "'*'", "'/'", "'%'", "'numar'", "'sdc'", 
			"'bool'", "'automat'", "'cat timp'", "'daca'", "'altfel daca'", "'daca nu'", 
			"'executa'", "'pentru'", "'printeaza'", "'returneaza'", "'functia'", 
			null, null, null, "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'='", 
			"'!'", "'!='", "'=='", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "STR_OPEN", 
			"STR_CLOSE", "SEMICOLON", "COLON", "DOT", "COMMA", "QUOTES", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "AUTO_TYPE", "While", "If", "Else", "Else_If", "Execute", 
			"For", "Print", "Return", "Method", "BOOLEAN", "STRING", "NUMBER", "AND", 
			"OR", "GT", "GE", "LT", "LE", "EQ", "NOT", "NOT_EQ", "EQUALS", "EQUALS_TO", 
			"COMMENT_LINE", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RoC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RoCParser.EOF, 0); }
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method) {
				{
				{
				setState(32);
				method_declaration();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Token methodName;
		public Statement_bodyContext body;
		public TerminalNode Method() { return getToken(RoCParser.Method, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> Return() { return getTokens(RoCParser.Return); }
		public TerminalNode Return(int i) {
			return getToken(RoCParser.Return, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(Method);
			setState(41);
			((Method_declarationContext)_localctx).methodName = match(IDENTIFIER);
			setState(42);
			match(PAREN_OPEN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE))) != 0)) {
				{
				setState(43);
				argument_list();
				}
			}

			setState(46);
			match(PAREN_CLOSE);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(47);
				match(Return);
				setState(48);
				type();
				}
			}

			setState(51);
			match(CURLY_OPEN);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				((Method_declarationContext)_localctx).body = statement_body();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << While) | (1L << If) | (1L << Execute) | (1L << For) | (1L << Print))) != 0) );
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(57);
				match(Return);
				setState(58);
				match(IDENTIFIER);
				}
			}

			setState(61);
			match(CURLY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoCParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			type();
			setState(64);
			match(IDENTIFIER);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(65);
				match(COMMA);
				setState(66);
				type();
				setState(67);
				match(IDENTIFIER);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			equality_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_exprContext extends ParserRuleContext {
		public Equality_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expr; }
	 
		public Equality_exprContext() { }
		public void copyFrom(Equality_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExpressionContext extends Equality_exprContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public LogicalExpressionContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityEqualsContext extends Equality_exprContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(RoCParser.EQUALS, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public EqualityEqualsContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterEqualityEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitEqualityEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitEqualityEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityNotEqualsContext extends Equality_exprContext {
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public TerminalNode NOT_EQ() { return getToken(RoCParser.NOT_EQ, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public EqualityNotEqualsContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterEqualityNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitEqualityNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitEqualityNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_exprContext equality_expr() throws RecognitionException {
		return equality_expr(0);
	}

	private Equality_exprContext equality_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_exprContext _localctx = new Equality_exprContext(_ctx, _parentState);
		Equality_exprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_equality_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(77);
			logical_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityEqualsContext(new Equality_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						match(EQUALS);
						setState(81);
						logical_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityNotEqualsContext(new Equality_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
						setState(82);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(83);
						match(NOT_EQ);
						setState(84);
						logical_expr(0);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionContext extends Logical_exprContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public ComparisonExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionInParenContext extends Logical_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public LogicalExpressionInParenContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionInParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionInParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVariableContext extends Logical_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public LocalVariableContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLocalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLocalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLocalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndOrContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RoCParser.AND, 0); }
		public TerminalNode OR() { return getToken(RoCParser.OR, 0); }
		public LogicalExpressionAndOrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BOOLEANContext extends Logical_exprContext {
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public BOOLEANContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_logical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				comparison_expr();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(PAREN_OPEN);
				setState(93);
				logical_expr(0);
				setState(94);
				match(PAREN_CLOSE);
				}
				break;
			case 3:
				{
				_localctx = new BOOLEANContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new LocalVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionAndOrContext(new Logical_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(100);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					logical_expr(6);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_exprContext extends ParserRuleContext {
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
	 
		public Comparison_exprContext() { }
		public void copyFrom(Comparison_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionParensContext extends Comparison_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public ComparisonExpressionParensContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends Comparison_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonExpressionWithOperatorContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpressionWithOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpressionWithOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison_expr);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				arithmetic_expr(0);
				setState(109);
				comparator();
				setState(110);
				arithmetic_expr(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(PAREN_OPEN);
				setState(113);
				comparison_expr();
				setState(114);
				match(PAREN_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_bodyContext extends ParserRuleContext {
		public List<DecisionStatementContext> decisionStatement() {
			return getRuleContexts(DecisionStatementContext.class);
		}
		public DecisionStatementContext decisionStatement(int i) {
			return getRuleContext(DecisionStatementContext.class,i);
		}
		public List<IterationStatementContext> iterationStatement() {
			return getRuleContexts(IterationStatementContext.class);
		}
		public IterationStatementContext iterationStatement(int i) {
			return getRuleContext(IterationStatementContext.class,i);
		}
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RoCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RoCParser.SEMICOLON, i);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitStatement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(118);
						decisionStatement();
						}
						break;
					case 2:
						{
						setState(119);
						iterationStatement();
						}
						break;
					case 3:
						{
						setState(120);
						printStatement();
						}
						break;
					case 4:
						{
						setState(121);
						variable_declaration();
						}
						break;
					case 5:
						{
						setState(122);
						variable_declaration();
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(123);
							match(SEMICOLON);
							}
						}

						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UMINUSContext extends Arithmetic_exprContext {
		public TerminalNode MINUS() { return getToken(RoCParser.MINUS, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public UMINUSContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterUMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitUMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitUMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDSUBGRPContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Token op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RoCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RoCParser.MINUS, 0); }
		public ADDSUBGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterADDSUBGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitADDSUBGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitADDSUBGRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NUMBERContext extends Arithmetic_exprContext {
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public NUMBERContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterNUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitNUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitNUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENGRPContext extends Arithmetic_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public PARENGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterPARENGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitPARENGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitPARENGRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDENTIFIERContext extends Arithmetic_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public IDENTIFIERContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULDIVMODOPGRPContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Token op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(RoCParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RoCParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(RoCParser.MODULO, 0); }
		public MULDIVMODOPGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMULDIVMODOPGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMULDIVMODOPGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMULDIVMODOPGRP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmetic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UMINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				match(MINUS);
				setState(132);
				arithmetic_expr(6);
				}
				break;
			case PAREN_OPEN:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(PAREN_OPEN);
				setState(134);
				arithmetic_expr(0);
				setState(135);
				match(PAREN_CLOSE);
				}
				break;
			case NUMBER:
				{
				_localctx = new NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IDENTIFIERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVMODOPGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((MULDIVMODOPGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						((MULDIVMODOPGRPContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
							((MULDIVMODOPGRPContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						((MULDIVMODOPGRPContext)_localctx).right = arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ADDSUBGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						((ADDSUBGRPContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ADDSUBGRPContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						((ADDSUBGRPContext)_localctx).right = arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DecisionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(RoCParser.If, 0); }
		public List<TerminalNode> PAREN_OPEN() { return getTokens(RoCParser.PAREN_OPEN); }
		public TerminalNode PAREN_OPEN(int i) {
			return getToken(RoCParser.PAREN_OPEN, i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<TerminalNode> PAREN_CLOSE() { return getTokens(RoCParser.PAREN_CLOSE); }
		public TerminalNode PAREN_CLOSE(int i) {
			return getToken(RoCParser.PAREN_CLOSE, i);
		}
		public List<TerminalNode> CURLY_OPEN() { return getTokens(RoCParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(RoCParser.CURLY_OPEN, i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(RoCParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(RoCParser.CURLY_CLOSE, i);
		}
		public List<TerminalNode> Else_If() { return getTokens(RoCParser.Else_If); }
		public TerminalNode Else_If(int i) {
			return getToken(RoCParser.Else_If, i);
		}
		public TerminalNode Else() { return getToken(RoCParser.Else, 0); }
		public DecisionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterDecisionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitDecisionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitDecisionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionStatementContext decisionStatement() throws RecognitionException {
		DecisionStatementContext _localctx = new DecisionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decisionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(If);
			setState(153);
			match(PAREN_OPEN);
			setState(154);
			conditions();
			setState(155);
			match(PAREN_CLOSE);
			setState(156);
			match(CURLY_OPEN);
			setState(157);
			statement_body();
			setState(158);
			match(CURLY_CLOSE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else_If) {
				{
				{
				setState(159);
				match(Else_If);
				setState(160);
				match(PAREN_OPEN);
				setState(161);
				conditions();
				setState(162);
				match(PAREN_CLOSE);
				setState(163);
				match(CURLY_OPEN);
				setState(164);
				statement_body();
				setState(165);
				match(CURLY_CLOSE);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(172);
				match(Else);
				setState(173);
				match(CURLY_OPEN);
				setState(174);
				statement_body();
				setState(175);
				match(CURLY_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(RoCParser.Print, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public Type_valueContext type_value() {
			return getRuleContext(Type_valueContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Print);
			setState(180);
			match(PAREN_OPEN);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case STRING:
			case NUMBER:
				{
				setState(182);
				type_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			match(PAREN_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public Token left_num;
		public Token left_id;
		public TerminalNode While() { return getToken(RoCParser.While, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public TerminalNode For() { return getToken(RoCParser.For, 0); }
		public List<TerminalNode> COLON() { return getTokens(RoCParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RoCParser.COLON, i);
		}
		public TerminalNode NUMBER_TYPE() { return getToken(RoCParser.NUMBER_TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS_TO() { return getTokens(RoCParser.EQUALS_TO); }
		public TerminalNode EQUALS_TO(int i) {
			return getToken(RoCParser.EQUALS_TO, i);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_iterationStatement);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(While);
				setState(188);
				conditions();
				setState(189);
				match(Execute);
				setState(190);
				match(CURLY_OPEN);
				setState(191);
				statement_body();
				setState(192);
				match(CURLY_CLOSE);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(For);
				{
				setState(195);
				match(NUMBER_TYPE);
				setState(196);
				match(IDENTIFIER);
				setState(197);
				match(EQUALS_TO);
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(198);
					((IterationStatementContext)_localctx).left_num = match(NUMBER);
					}
					break;
				case IDENTIFIER:
					{
					setState(199);
					((IterationStatementContext)_localctx).left_id = match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				match(COLON);
				setState(203);
				conditions();
				setState(204);
				match(COLON);
				{
				setState(205);
				match(IDENTIFIER);
				setState(206);
				match(EQUALS_TO);
				setState(207);
				arithmetic_expr(0);
				}
				setState(209);
				match(Execute);
				setState(210);
				match(CURLY_OPEN);
				setState(211);
				statement_body();
				setState(212);
				match(CURLY_CLOSE);
				}
				break;
			case Execute:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(Execute);
				setState(215);
				match(CURLY_OPEN);
				setState(216);
				statement_body();
				setState(217);
				match(CURLY_CLOSE);
				setState(218);
				match(While);
				setState(219);
				conditions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Token lhs;
		public Token rhs;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALS_TO() { return getToken(RoCParser.EQUALS_TO, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(RoCParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			type();
			setState(224);
			((Variable_declarationContext)_localctx).lhs = match(IDENTIFIER);
			setState(225);
			match(EQUALS_TO);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(226);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(227);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(228);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(229);
				((Variable_declarationContext)_localctx).rhs = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(230);
				arithmetic_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(RoCParser.GT, 0); }
		public TerminalNode GE() { return getToken(RoCParser.GE, 0); }
		public TerminalNode LT() { return getToken(RoCParser.LT, 0); }
		public TerminalNode LE() { return getToken(RoCParser.LE, 0); }
		public TerminalNode EQ() { return getToken(RoCParser.EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(RoCParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(RoCParser.BOOLEAN_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(RoCParser.NUMBER_TYPE, 0); }
		public TerminalNode AUTO_TYPE() { return getToken(RoCParser.AUTO_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_valueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(RoCParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public Type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterType_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitType_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitType_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_valueContext type_value() throws RecognitionException {
		Type_valueContext _localctx = new Type_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return equality_expr_sempred((Equality_exprContext)_localctx, predIndex);
		case 5:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 8:
			return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equality_expr_sempred(Equality_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\5\3>\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7e\n\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\6\t\u0081\n\t\r\t"+
		"\16\t\u0082\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00aa\n\13"+
		"\f\13\16\13\u00ad\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3"+
		"\f\3\f\3\f\5\f\u00ba\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e0\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\2\5\n\f\22\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\b\3\2#$\3\2\20"+
		"\22\3\2\16\17\3\2%)\3\2\23\26\3\2 \"\2\u0103\2%\3\2\2\2\4*\3\2\2\2\6A"+
		"\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fd\3\2\2\2\16v\3\2\2\2\20\u0080\3\2\2\2"+
		"\22\u008d\3\2\2\2\24\u009a\3\2\2\2\26\u00b5\3\2\2\2\30\u00df\3\2\2\2\32"+
		"\u00e1\3\2\2\2\34\u00eb\3\2\2\2\36\u00ed\3\2\2\2 \u00ef\3\2\2\2\"$\5\4"+
		"\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()"+
		"\7\2\2\3)\3\3\2\2\2*+\7\37\2\2+,\7/\2\2,.\7\3\2\2-/\5\6\4\2.-\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\63\7\4\2\2\61\62\7\36\2\2\62\64\5\36\20\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\5\2\2\668\5\20\t\2\67"+
		"\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;<\7\36\2\2<>\7/"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\6\2\2@\5\3\2\2\2AB\5\36\20\2BI"+
		"\7/\2\2CD\7\f\2\2DE\5\36\20\2EF\7/\2\2FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\5\n\6\2M\t\3\2\2\2NO\b\6\1"+
		"\2OP\5\f\7\2PY\3\2\2\2QR\f\4\2\2RS\7,\2\2SX\5\f\7\2TU\f\3\2\2UV\7+\2\2"+
		"VX\5\f\7\2WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2"+
		"\2[Y\3\2\2\2\\]\b\7\1\2]e\5\16\b\2^_\7\3\2\2_`\5\f\7\2`a\7\4\2\2ae\3\2"+
		"\2\2be\7 \2\2ce\7/\2\2d\\\3\2\2\2d^\3\2\2\2db\3\2\2\2dc\3\2\2\2ek\3\2"+
		"\2\2fg\f\7\2\2gh\t\2\2\2hj\5\f\7\bif\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2l\r\3\2\2\2mk\3\2\2\2no\5\22\n\2op\5\34\17\2pq\5\22\n\2qw\3\2\2\2"+
		"rs\7\3\2\2st\5\16\b\2tu\7\4\2\2uw\3\2\2\2vn\3\2\2\2vr\3\2\2\2w\17\3\2"+
		"\2\2x\u0081\5\24\13\2y\u0081\5\30\r\2z\u0081\5\26\f\2{\u0081\5\32\16\2"+
		"|~\5\32\16\2}\177\7\t\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\21"+
		"\3\2\2\2\u0084\u0085\b\n\1\2\u0085\u0086\7\17\2\2\u0086\u008e\5\22\n\b"+
		"\u0087\u0088\7\3\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\4\2\2\u008a\u008e"+
		"\3\2\2\2\u008b\u008e\7\"\2\2\u008c\u008e\7/\2\2\u008d\u0084\3\2\2\2\u008d"+
		"\u0087\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0097\3\2"+
		"\2\2\u008f\u0090\f\7\2\2\u0090\u0091\t\3\2\2\u0091\u0096\5\22\n\b\u0092"+
		"\u0093\f\6\2\2\u0093\u0094\t\4\2\2\u0094\u0096\5\22\n\7\u0095\u008f\3"+
		"\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\30\2"+
		"\2\u009b\u009c\7\3\2\2\u009c\u009d\5\b\5\2\u009d\u009e\7\4\2\2\u009e\u009f"+
		"\7\5\2\2\u009f\u00a0\5\20\t\2\u00a0\u00ab\7\6\2\2\u00a1\u00a2\7\32\2\2"+
		"\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6"+
		"\7\5\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\6\2\2\u00a8\u00aa\3\2\2\2"+
		"\u00a9\u00a1\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\31\2\2"+
		"\u00af\u00b0\7\5\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\6\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5"+
		"\u00b6\7\35\2\2\u00b6\u00b9\7\3\2\2\u00b7\u00ba\7/\2\2\u00b8\u00ba\5 "+
		"\21\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\4\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\27\2\2\u00be\u00bf\5\b\5"+
		"\2\u00bf\u00c0\7\33\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\20\t\2\u00c2"+
		"\u00c3\7\6\2\2\u00c3\u00e0\3\2\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\7"+
		"\23\2\2\u00c6\u00c7\7/\2\2\u00c7\u00ca\7-\2\2\u00c8\u00cb\7\"\2\2\u00c9"+
		"\u00cb\7/\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\5\b\5\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\u00d0\7/\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2\5\22\n\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d6\5\20\t\2\u00d6"+
		"\u00d7\7\6\2\2\u00d7\u00e0\3\2\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\7"+
		"\5\2\2\u00da\u00db\5\20\t\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\7\27\2\2\u00dd"+
		"\u00de\5\b\5\2\u00de\u00e0\3\2\2\2\u00df\u00bd\3\2\2\2\u00df\u00c4\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e2\5\36\20\2\u00e2"+
		"\u00e3\7/\2\2\u00e3\u00e9\7-\2\2\u00e4\u00ea\7 \2\2\u00e5\u00ea\7!\2\2"+
		"\u00e6\u00ea\7\"\2\2\u00e7\u00ea\7/\2\2\u00e8\u00ea\5\22\n\2\u00e9\u00e4"+
		"\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\t\5\2\2\u00ec\35\3\2\2\2\u00ed"+
		"\u00ee\t\6\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\t\7\2\2\u00f0!\3\2\2\2\31"+
		"%.\639=IWYdkv~\u0080\u0082\u008d\u0095\u0097\u00ab\u00b3\u00b9\u00ca\u00df"+
		"\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}