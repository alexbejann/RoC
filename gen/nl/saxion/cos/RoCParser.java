// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year_2/Compilers_OS/retake/31/src\RoC.g4 by ANTLR 4.9.1
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
		PAREN_OPEN=1, PAREN_CLOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, COMMA=5, PLUS=6, 
		MINUS=7, MULTIPLY=8, DIVIDE=9, MODULO=10, SHORT_TYPE=11, NUMBER_TYPE=12, 
		STRING_TYPE=13, BOOLEAN_TYPE=14, AUTO_TYPE=15, SCANNER=16, While=17, If=18, 
		Else=19, Execute=20, Print=21, Return=22, Method=23, SCANNERCALL=24, BOOLEAN=25, 
		STRING=26, SHORT=27, NUMBER=28, AND=29, OR=30, GT=31, GE=32, LT=33, LE=34, 
		EQ=35, NOT=36, NOT_EQ=37, EQUALS=38, EQUALS_TO=39, COMMENT_LINE=40, IDENTIFIER=41, 
		WS=42;
	public static final int
		RULE_program = 0, RULE_method_declaration = 1, RULE_argument_list = 2, 
		RULE_expr = 3, RULE_block = 4, RULE_functionCall = 5, RULE_functionArgumentList = 6, 
		RULE_decisionStatement = 7, RULE_printStatement = 8, RULE_iterationStatement = 9, 
		RULE_variable_declaration = 10, RULE_varExpression = 11, RULE_comparator = 12, 
		RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method_declaration", "argument_list", "expr", "block", "functionCall", 
			"functionArgumentList", "decisionStatement", "printStatement", "iterationStatement", 
			"variable_declaration", "varExpression", "comparator", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'scurt'", "'numar'", "'sdc'", "'bool'", "'automat'", "'scanner'", 
			"'cat timp'", "'daca'", "'altfel daca'", "'executa'", "'printeaza'", 
			"'returneaza'", "'functia'", "'urmatorul'", null, null, null, null, "'&&'", 
			"'||'", "'>'", "'>='", "'<'", "'<='", "'='", "'!'", "'!='", "'=='", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "COMMA", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "SHORT_TYPE", "NUMBER_TYPE", 
			"STRING_TYPE", "BOOLEAN_TYPE", "AUTO_TYPE", "SCANNER", "While", "If", 
			"Else", "Execute", "Print", "Return", "Method", "SCANNERCALL", "BOOLEAN", 
			"STRING", "SHORT", "NUMBER", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", 
			"NOT", "NOT_EQ", "EQUALS", "EQUALS_TO", "COMMENT_LINE", "IDENTIFIER", 
			"WS"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method) {
				{
				{
				setState(28);
				method_declaration();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public TypeContext returnType;
		public BlockContext body;
		public ExprContext returnValue;
		public TerminalNode Method() { return getToken(RoCParser.Method, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(36);
			match(Method);
			setState(37);
			((Method_declarationContext)_localctx).methodName = match(IDENTIFIER);
			setState(38);
			match(PAREN_OPEN);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << SCANNER))) != 0)) {
				{
				setState(39);
				argument_list();
				}
			}

			setState(42);
			match(PAREN_CLOSE);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(43);
				match(Return);
				setState(44);
				((Method_declarationContext)_localctx).returnType = type();
				}
			}

			setState(47);
			match(CURLY_OPEN);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << SCANNER) | (1L << While) | (1L << If) | (1L << Execute) | (1L << Print) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(48);
				((Method_declarationContext)_localctx).body = block();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(54);
				match(Return);
				setState(55);
				((Method_declarationContext)_localctx).returnValue = expr(0);
				}
			}

			setState(58);
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
			setState(60);
			type();
			setState(61);
			match(IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				type();
				setState(64);
				match(IDENTIFIER);
				}
				}
				setState(70);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDSUBGRPContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RoCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RoCParser.MINUS, 0); }
		public ADDSUBGRPContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class NUMBERContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public NUMBERContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class ScannerCallContext extends ExprContext {
		public TerminalNode SCANNERCALL() { return getToken(RoCParser.SCANNERCALL, 0); }
		public ScannerCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterScannerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitScannerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitScannerCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENGRPContext extends ExprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public PARENGRPContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class BOOLEANContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public BOOLEANContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class SHORTContext extends ExprContext {
		public TerminalNode SHORT() { return getToken(RoCParser.SHORT, 0); }
		public SHORTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterSHORT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitSHORT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitSHORT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STRINGContext extends ExprContext {
		public TerminalNode STRING() { return getToken(RoCParser.STRING, 0); }
		public STRINGContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitSTRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends ExprContext {
		public ExprContext left;
		public ComparatorContext op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonExpressionWithOperatorContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class LogicalExpressionAndContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RoCParser.AND, 0); }
		public LogicalExpressionAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDENTIFIERContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public IDENTIFIERContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class LogicalExpressionOrContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RoCParser.OR, 0); }
		public LogicalExpressionOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULDIVMODOPGRPContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(RoCParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RoCParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(RoCParser.MODULO, 0); }
		public MULDIVMODOPGRPContext(ExprContext ctx) { copyFrom(ctx); }
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(PAREN_OPEN);
				setState(73);
				expr(0);
				setState(74);
				match(PAREN_CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new ScannerCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(SCANNERCALL);
				}
				break;
			case 4:
				{
				_localctx = new NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new SHORTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(SHORT);
				}
				break;
			case 6:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BOOLEANContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IDENTIFIERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVMODOPGRPContext(new ExprContext(_parentctx, _parentState));
						((MULDIVMODOPGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(86);
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
						setState(87);
						((MULDIVMODOPGRPContext)_localctx).right = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBGRPContext(new ExprContext(_parentctx, _parentState));
						((ADDSUBGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
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
						setState(90);
						((ADDSUBGRPContext)_localctx).right = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionWithOperatorContext(new ExprContext(_parentctx, _parentState));
						((ComparisonExpressionWithOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						((ComparisonExpressionWithOperatorContext)_localctx).op = comparator();
						setState(93);
						((ComparisonExpressionWithOperatorContext)_localctx).right = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionAndContext(new ExprContext(_parentctx, _parentState));
						((LogicalExpressionAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						((LogicalExpressionAndContext)_localctx).op = match(AND);
						setState(97);
						((LogicalExpressionAndContext)_localctx).right = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionOrContext(new ExprContext(_parentctx, _parentState));
						((LogicalExpressionOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(99);
						((LogicalExpressionOrContext)_localctx).op = match(OR);
						setState(100);
						((LogicalExpressionOrContext)_localctx).right = expr(9);
						}
						break;
					}
					} 
				}
				setState(105);
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

	public static class BlockContext extends ParserRuleContext {
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
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(106);
						decisionStatement();
						}
						break;
					case 2:
						{
						setState(107);
						iterationStatement();
						}
						break;
					case 3:
						{
						setState(108);
						functionCall();
						}
						break;
					case 4:
						{
						setState(109);
						printStatement();
						}
						break;
					case 5:
						{
						setState(110);
						varExpression();
						}
						break;
					case 6:
						{
						setState(111);
						variable_declaration();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCallContext extends FunctionCallContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public FunctionArgumentListContext functionArgumentList() {
			return getRuleContext(FunctionArgumentListContext.class,0);
		}
		public MethodCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			_localctx = new MethodCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IDENTIFIER);
			setState(117);
			match(PAREN_OPEN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << SCANNERCALL) | (1L << BOOLEAN) | (1L << STRING) | (1L << SHORT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(118);
				functionArgumentList();
				}
			}

			setState(121);
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

	public static class FunctionArgumentListContext extends ParserRuleContext {
		public FunctionArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentList; }
	 
		public FunctionArgumentListContext() { }
		public void copyFrom(FunctionArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCallArgumentListContext extends FunctionArgumentListContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoCParser.COMMA, i);
		}
		public MethodCallArgumentListContext(FunctionArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMethodCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMethodCallArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMethodCallArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentListContext functionArgumentList() throws RecognitionException {
		FunctionArgumentListContext _localctx = new FunctionArgumentListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArgumentList);
		int _la;
		try {
			_localctx = new MethodCallArgumentListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			expr(0);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				expr(0);
				}
				}
				setState(130);
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

	public static class DecisionStatementContext extends ParserRuleContext {
		public ExprContext if_lhs;
		public BlockContext if_rhs;
		public BlockContext else_lhs;
		public TerminalNode If() { return getToken(RoCParser.If, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public List<TerminalNode> CURLY_OPEN() { return getTokens(RoCParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(RoCParser.CURLY_OPEN, i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(RoCParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(RoCParser.CURLY_CLOSE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 14, RULE_decisionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(If);
			setState(132);
			match(PAREN_OPEN);
			setState(133);
			((DecisionStatementContext)_localctx).if_lhs = expr(0);
			setState(134);
			match(PAREN_CLOSE);
			setState(135);
			match(CURLY_OPEN);
			setState(136);
			((DecisionStatementContext)_localctx).if_rhs = block();
			setState(137);
			match(CURLY_CLOSE);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(138);
				match(Else);
				setState(139);
				match(CURLY_OPEN);
				setState(140);
				((DecisionStatementContext)_localctx).else_lhs = block();
				setState(141);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(Print);
			setState(146);
			match(PAREN_OPEN);
			{
			setState(147);
			expr(0);
			}
			setState(148);
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
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileLoopContext extends IterationStatementContext {
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public TerminalNode While() { return getToken(RoCParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(RoCParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public WhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iterationStatement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(While);
				setState(151);
				expr(0);
				setState(152);
				match(Execute);
				setState(153);
				match(CURLY_OPEN);
				setState(154);
				block();
				setState(155);
				match(CURLY_CLOSE);
				}
				break;
			case Execute:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(Execute);
				setState(158);
				match(CURLY_OPEN);
				setState(159);
				block();
				setState(160);
				match(CURLY_CLOSE);
				setState(161);
				match(While);
				setState(162);
				expr(0);
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
		public ExprContext rhs;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALS_TO() { return getToken(RoCParser.EQUALS_TO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 20, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			type();
			setState(167);
			((Variable_declarationContext)_localctx).lhs = match(IDENTIFIER);
			setState(168);
			match(EQUALS_TO);
			setState(169);
			((Variable_declarationContext)_localctx).rhs = expr(0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 22, RULE_varExpression);
		try {
			_localctx = new AssignmentExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDENTIFIER);
			setState(172);
			match(EQUALS_TO);
			setState(173);
			expr(0);
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
		public TerminalNode NOT_EQ() { return getToken(RoCParser.NOT_EQ, 0); }
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
		enterRule(_localctx, 24, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NOT_EQ))) != 0)) ) {
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
		public TerminalNode SHORT_TYPE() { return getToken(RoCParser.SHORT_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(RoCParser.NUMBER_TYPE, 0); }
		public TerminalNode AUTO_TYPE() { return getToken(RoCParser.AUTO_TYPE, 0); }
		public TerminalNode SCANNER() { return getToken(RoCParser.SCANNER, 0); }
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << SCANNER))) != 0)) ) {
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6s\n\6\r\6\16"+
		"\6t\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\2\3\b\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\6\3\2\n\f\3\2\b\t\4\2!%\'\'\3\2\r\22\2\u00c3\2!\3\2\2\2\4&\3\2\2\2"+
		"\6>\3\2\2\2\bU\3\2\2\2\nr\3\2\2\2\fv\3\2\2\2\16}\3\2\2\2\20\u0085\3\2"+
		"\2\2\22\u0093\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30\u00ad\3\2\2"+
		"\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&\'"+
		"\7\31\2\2\'(\7+\2\2(*\7\3\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
		",/\7\4\2\2-.\7\30\2\2.\60\5\34\17\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2"+
		"\2\61\65\7\5\2\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2"+
		"\2\65\66\3\2\2\2\66:\3\2\2\2\67\65\3\2\2\289\7\30\2\29;\5\b\5\2:8\3\2"+
		"\2\2:;\3\2\2\2;<\3\2\2\2<=\7\6\2\2=\5\3\2\2\2>?\5\34\17\2?F\7+\2\2@A\7"+
		"\7\2\2AB\5\34\17\2BC\7+\2\2CE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\b\5\1\2JK\7\3\2\2KL\5\b\5\2LM\7\4\2\2"+
		"MV\3\2\2\2NV\5\f\7\2OV\7\32\2\2PV\7\36\2\2QV\7\35\2\2RV\7\34\2\2SV\7\33"+
		"\2\2TV\7+\2\2UI\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2"+
		"\2\2US\3\2\2\2UT\3\2\2\2Vi\3\2\2\2WX\f\16\2\2XY\t\2\2\2Yh\5\b\5\17Z[\f"+
		"\r\2\2[\\\t\3\2\2\\h\5\b\5\16]^\f\f\2\2^_\5\32\16\2_`\5\b\5\r`h\3\2\2"+
		"\2ab\f\13\2\2bc\7\37\2\2ch\5\b\5\fde\f\n\2\2ef\7 \2\2fh\5\b\5\13gW\3\2"+
		"\2\2gZ\3\2\2\2g]\3\2\2\2ga\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2j\t\3\2\2\2ki\3\2\2\2ls\5\20\t\2ms\5\24\13\2ns\5\f\7\2os\5\22\n\2"+
		"ps\5\30\r\2qs\5\26\f\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vw\7+\2\2wy\7\3"+
		"\2\2xz\5\16\b\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\4\2\2|\r\3\2\2\2}\u0082"+
		"\5\b\5\2~\177\7\7\2\2\177\u0081\5\b\5\2\u0080~\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\7\24\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5\b\5\2"+
		"\u0088\u0089\7\4\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5\n\6\2\u008b\u0091"+
		"\7\6\2\2\u008c\u008d\7\25\2\2\u008d\u008e\7\5\2\2\u008e\u008f\5\n\6\2"+
		"\u008f\u0090\7\6\2\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7\27\2\2\u0094\u0095\7\3\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\7\4\2\2\u0097\23\3\2\2\2\u0098\u0099\7\23\2"+
		"\2\u0099\u009a\5\b\5\2\u009a\u009b\7\26\2\2\u009b\u009c\7\5\2\2\u009c"+
		"\u009d\5\n\6\2\u009d\u009e\7\6\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0\7\26"+
		"\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7\6\2\2\u00a3"+
		"\u00a4\7\23\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a7\3\2\2\2\u00a6\u0098\3"+
		"\2\2\2\u00a6\u009f\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\5\34\17\2\u00a9"+
		"\u00aa\7+\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\5\b\5\2\u00ac\27\3\2\2\2"+
		"\u00ad\u00ae\7+\2\2\u00ae\u00af\7)\2\2\u00af\u00b0\5\b\5\2\u00b0\31\3"+
		"\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4"+
		"\35\3\2\2\2\21!*/\65:FUgirty\u0082\u0091\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}