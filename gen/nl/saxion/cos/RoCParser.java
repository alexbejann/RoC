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
		RULE_varExpression = 13, RULE_comparator = 14, RULE_type = 15, RULE_type_value = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method_declaration", "argument_list", "conditions", "equality_expr", 
			"logical_expr", "comparison_expr", "statement_body", "arithmetic_expr", 
			"decisionStatement", "printStatement", "iterationStatement", "variable_declaration", 
			"varExpression", "comparator", "type", "type_value"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method) {
				{
				{
				setState(34);
				method_declaration();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(42);
			match(Method);
			setState(43);
			((Method_declarationContext)_localctx).methodName = match(IDENTIFIER);
			setState(44);
			match(PAREN_OPEN);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE))) != 0)) {
				{
				setState(45);
				argument_list();
				}
			}

			setState(48);
			match(PAREN_CLOSE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(49);
				match(Return);
				setState(50);
				type();
				}
			}

			setState(53);
			match(CURLY_OPEN);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				((Method_declarationContext)_localctx).body = statement_body();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << While) | (1L << If) | (1L << Execute) | (1L << For) | (1L << Print) | (1L << IDENTIFIER))) != 0) );
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(59);
				match(Return);
				setState(60);
				match(IDENTIFIER);
				}
			}

			setState(63);
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
			setState(65);
			type();
			setState(66);
			match(IDENTIFIER);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				type();
				setState(69);
				match(IDENTIFIER);
				}
				}
				setState(75);
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
			setState(76);
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
	public static class EqualityEqualsNotEqualsContext extends Equality_exprContext {
		public Equality_exprContext left;
		public Logical_exprContext right;
		public Equality_exprContext equality_expr() {
			return getRuleContext(Equality_exprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(RoCParser.EQUALS, 0); }
		public TerminalNode NOT_EQ() { return getToken(RoCParser.NOT_EQ, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public EqualityEqualsNotEqualsContext(Equality_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterEqualityEqualsNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitEqualityEqualsNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitEqualityEqualsNotEquals(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(79);
			logical_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityEqualsNotEqualsContext(new Equality_exprContext(_parentctx, _parentState));
					((EqualityEqualsNotEqualsContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expr);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					_la = _input.LA(1);
					if ( !(_la==NOT_EQ || _la==EQUALS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(83);
					((EqualityEqualsNotEqualsContext)_localctx).right = logical_expr(0);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Logical_exprContext left;
		public Logical_exprContext right;
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				comparison_expr();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(PAREN_OPEN);
				setState(92);
				logical_expr(0);
				setState(93);
				match(PAREN_CLOSE);
				}
				break;
			case 3:
				{
				_localctx = new BOOLEANContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new LocalVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionAndOrContext(new Logical_exprContext(_parentctx, _parentState));
					((LogicalExpressionAndOrContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(99);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(100);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(101);
					((LogicalExpressionAndOrContext)_localctx).right = logical_expr(6);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public Arithmetic_exprContext left;
		public Arithmetic_exprContext right;
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((ComparisonExpressionWithOperatorContext)_localctx).left = arithmetic_expr(0);
				setState(108);
				comparator();
				setState(109);
				((ComparisonExpressionWithOperatorContext)_localctx).right = arithmetic_expr(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(PAREN_OPEN);
				setState(112);
				comparison_expr();
				setState(113);
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
		public List<VarExpressionContext> varExpression() {
			return getRuleContexts(VarExpressionContext.class);
		}
		public VarExpressionContext varExpression(int i) {
			return getRuleContext(VarExpressionContext.class,i);
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
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case If:
						{
						setState(117);
						decisionStatement();
						}
						break;
					case While:
					case Execute:
					case For:
						{
						setState(118);
						iterationStatement();
						}
						break;
					case Print:
						{
						setState(119);
						printStatement();
						}
						break;
					case IDENTIFIER:
						{
						setState(120);
						varExpression();
						}
						break;
					case NUMBER_TYPE:
					case STRING_TYPE:
					case BOOLEAN_TYPE:
					case AUTO_TYPE:
						{
						setState(121);
						variable_declaration();
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(122);
							match(SEMICOLON);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UMINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				match(MINUS);
				setState(131);
				arithmetic_expr(6);
				}
				break;
			case PAREN_OPEN:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(PAREN_OPEN);
				setState(133);
				arithmetic_expr(0);
				setState(134);
				match(PAREN_CLOSE);
				}
				break;
			case NUMBER:
				{
				_localctx = new NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IDENTIFIERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVMODOPGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((MULDIVMODOPGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
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
						setState(142);
						((MULDIVMODOPGRPContext)_localctx).right = arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ADDSUBGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
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
						setState(145);
						((ADDSUBGRPContext)_localctx).right = arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public ConditionsContext if_lhs;
		public Statement_bodyContext if_rhs;
		public ConditionsContext elseIF_lhs;
		public Statement_bodyContext elseIF_rhs;
		public Statement_bodyContext else_lhs;
		public TerminalNode If() { return getToken(RoCParser.If, 0); }
		public List<TerminalNode> PAREN_OPEN() { return getTokens(RoCParser.PAREN_OPEN); }
		public TerminalNode PAREN_OPEN(int i) {
			return getToken(RoCParser.PAREN_OPEN, i);
		}
		public List<TerminalNode> PAREN_CLOSE() { return getTokens(RoCParser.PAREN_CLOSE); }
		public TerminalNode PAREN_CLOSE(int i) {
			return getToken(RoCParser.PAREN_CLOSE, i);
		}
		public List<TerminalNode> CURLY_OPEN() { return getTokens(RoCParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(RoCParser.CURLY_OPEN, i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(RoCParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(RoCParser.CURLY_CLOSE, i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
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
			setState(151);
			match(If);
			setState(152);
			match(PAREN_OPEN);
			setState(153);
			((DecisionStatementContext)_localctx).if_lhs = conditions();
			setState(154);
			match(PAREN_CLOSE);
			setState(155);
			match(CURLY_OPEN);
			setState(156);
			((DecisionStatementContext)_localctx).if_rhs = statement_body();
			setState(157);
			match(CURLY_CLOSE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else_If) {
				{
				{
				setState(158);
				match(Else_If);
				setState(159);
				match(PAREN_OPEN);
				setState(160);
				((DecisionStatementContext)_localctx).elseIF_lhs = conditions();
				setState(161);
				match(PAREN_CLOSE);
				setState(162);
				match(CURLY_OPEN);
				setState(163);
				((DecisionStatementContext)_localctx).elseIF_rhs = statement_body();
				setState(164);
				match(CURLY_CLOSE);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(171);
				match(Else);
				setState(172);
				match(CURLY_OPEN);
				setState(173);
				((DecisionStatementContext)_localctx).else_lhs = statement_body();
				setState(174);
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
			setState(178);
			match(Print);
			setState(179);
			match(PAREN_OPEN);
			{
			setState(180);
			type_value();
			}
			setState(181);
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(While);
				setState(184);
				conditions();
				setState(185);
				match(Execute);
				setState(186);
				match(CURLY_OPEN);
				setState(187);
				statement_body();
				setState(188);
				match(CURLY_CLOSE);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(For);
				{
				setState(191);
				match(NUMBER_TYPE);
				setState(192);
				match(IDENTIFIER);
				setState(193);
				match(EQUALS_TO);
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(194);
					((IterationStatementContext)_localctx).left_num = match(NUMBER);
					}
					break;
				case IDENTIFIER:
					{
					setState(195);
					((IterationStatementContext)_localctx).left_id = match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198);
				match(COLON);
				setState(199);
				conditions();
				setState(200);
				match(COLON);
				{
				setState(201);
				match(IDENTIFIER);
				setState(202);
				match(EQUALS_TO);
				setState(203);
				arithmetic_expr(0);
				}
				setState(205);
				match(Execute);
				setState(206);
				match(CURLY_OPEN);
				setState(207);
				statement_body();
				setState(208);
				match(CURLY_CLOSE);
				}
				break;
			case Execute:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(Execute);
				setState(211);
				match(CURLY_OPEN);
				setState(212);
				statement_body();
				setState(213);
				match(CURLY_CLOSE);
				setState(214);
				match(While);
				setState(215);
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
			setState(219);
			type();
			setState(220);
			((Variable_declarationContext)_localctx).lhs = match(IDENTIFIER);
			setState(221);
			match(EQUALS_TO);
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(223);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(224);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(225);
				((Variable_declarationContext)_localctx).rhs = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(226);
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

	public static class VarExpressionContext extends ParserRuleContext {
		public VarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpression; }
	 
		public VarExpressionContext() { }
		public void copyFrom(VarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpressionContext extends VarExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(RoCParser.EQUALS_TO, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public AssignmentExpressionContext(VarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExpressionContext varExpression() throws RecognitionException {
		VarExpressionContext _localctx = new VarExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varExpression);
		try {
			_localctx = new AssignmentExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFIER);
			setState(230);
			match(EQUALS_TO);
			setState(231);
			arithmetic_expr(0);
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
		enterRule(_localctx, 28, RULE_comparator);
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
		enterRule(_localctx, 30, RULE_type);
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
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 32, RULE_type_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
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
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\5\3@\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"d\n\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\6\t\u0080\n\t\r\t\16\t"+
		"\u0081\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13"+
		"\16\13\u00ac\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c7"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00e6\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\5"+
		"\n\f\22\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\t\3\2+,\3\2#$\3"+
		"\2\20\22\3\2\16\17\3\2%)\3\2\23\26\4\2 \"//\2\u0100\2\'\3\2\2\2\4,\3\2"+
		"\2\2\6C\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fc\3\2\2\2\16u\3\2\2\2\20\177\3"+
		"\2\2\2\22\u008c\3\2\2\2\24\u0099\3\2\2\2\26\u00b4\3\2\2\2\30\u00db\3\2"+
		"\2\2\32\u00dd\3\2\2\2\34\u00e7\3\2\2\2\36\u00eb\3\2\2\2 \u00ed\3\2\2\2"+
		"\"\u00ef\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2("+
		"*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\7\37\2\2-.\7/\2\2.\60\7\3"+
		"\2\2/\61\5\6\4\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\65\7\4\2\2"+
		"\63\64\7\36\2\2\64\66\5 \21\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2"+
		"\2\679\7\5\2\28:\5\20\t\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3"+
		"\2\2\2=>\7\36\2\2>@\7/\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\6\2\2B\5"+
		"\3\2\2\2CD\5 \21\2DK\7/\2\2EF\7\f\2\2FG\5 \21\2GH\7/\2\2HJ\3\2\2\2IE\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MK\3\2\2\2NO\5\n\6\2O\t"+
		"\3\2\2\2PQ\b\6\1\2QR\5\f\7\2RX\3\2\2\2ST\f\3\2\2TU\t\2\2\2UW\5\f\7\2V"+
		"S\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\b\7\1"+
		"\2\\d\5\16\b\2]^\7\3\2\2^_\5\f\7\2_`\7\4\2\2`d\3\2\2\2ad\7 \2\2bd\7/\2"+
		"\2c[\3\2\2\2c]\3\2\2\2ca\3\2\2\2cb\3\2\2\2dj\3\2\2\2ef\f\7\2\2fg\t\3\2"+
		"\2gi\5\f\7\bhe\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2"+
		"\2\2mn\5\22\n\2no\5\36\20\2op\5\22\n\2pv\3\2\2\2qr\7\3\2\2rs\5\16\b\2"+
		"st\7\4\2\2tv\3\2\2\2um\3\2\2\2uq\3\2\2\2v\17\3\2\2\2w\u0080\5\24\13\2"+
		"x\u0080\5\30\r\2y\u0080\5\26\f\2z\u0080\5\34\17\2{}\5\32\16\2|~\7\t\2"+
		"\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177w\3\2\2\2\177x\3\2\2\2\177y\3"+
		"\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\b\n\1\2\u0084\u0085"+
		"\7\17\2\2\u0085\u008d\5\22\n\b\u0086\u0087\7\3\2\2\u0087\u0088\5\22\n"+
		"\2\u0088\u0089\7\4\2\2\u0089\u008d\3\2\2\2\u008a\u008d\7\"\2\2\u008b\u008d"+
		"\7/\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008f\f\7\2\2\u008f\u0090\t\4"+
		"\2\2\u0090\u0095\5\22\n\b\u0091\u0092\f\6\2\2\u0092\u0093\t\5\2\2\u0093"+
		"\u0095\5\22\n\7\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\30\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5"+
		"\b\5\2\u009c\u009d\7\4\2\2\u009d\u009e\7\5\2\2\u009e\u009f\5\20\t\2\u009f"+
		"\u00aa\7\6\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\5"+
		"\b\5\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5\20\t\2\u00a6"+
		"\u00a7\7\6\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5"+
		"\20\t\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\3\2"+
		"\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\7\4\2\2\u00b8\27\3\2\2\2\u00b9\u00ba"+
		"\7\27\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7\5\2\2"+
		"\u00bd\u00be\5\20\t\2\u00be\u00bf\7\6\2\2\u00bf\u00dc\3\2\2\2\u00c0\u00c1"+
		"\7\34\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c6\7-\2\2\u00c4"+
		"\u00c7\7\"\2\2\u00c5\u00c7\7/\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\5\b\5\2\u00ca"+
		"\u00cb\7\n\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7-\2\2\u00cd\u00ce\5\22"+
		"\n\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1\7\5\2\2\u00d1"+
		"\u00d2\5\20\t\2\u00d2\u00d3\7\6\2\2\u00d3\u00dc\3\2\2\2\u00d4\u00d5\7"+
		"\33\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5\20\t\2\u00d7\u00d8\7\6\2\2\u00d8"+
		"\u00d9\7\27\2\2\u00d9\u00da\5\b\5\2\u00da\u00dc\3\2\2\2\u00db\u00b9\3"+
		"\2\2\2\u00db\u00c0\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc\31\3\2\2\2\u00dd"+
		"\u00de\5 \21\2\u00de\u00df\7/\2\2\u00df\u00e5\7-\2\2\u00e0\u00e6\7 \2"+
		"\2\u00e1\u00e6\7!\2\2\u00e2\u00e6\7\"\2\2\u00e3\u00e6\7/\2\2\u00e4\u00e6"+
		"\5\22\n\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\5\22\n\2\u00ea\35\3\2\2\2\u00eb"+
		"\u00ec\t\6\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\t\7\2\2\u00ee!\3\2\2\2\u00ef"+
		"\u00f0\t\b\2\2\u00f0#\3\2\2\2\27\'\60\65;?KXcju}\177\u0081\u008c\u0094"+
		"\u0096\u00aa\u00b2\u00c6\u00db\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}