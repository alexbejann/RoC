// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year 2/Compilers_OS/31/src\RoC.g4 by ANTLR 4.9.1
package nl.saxion.cos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAREN_OPEN=1, PAREN_CLOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, STR_OPEN=5, 
		STR_CLOSE=6, SEMICOLON=7, COLON=8, DOT=9, COMMA=10, QUOTES=11, PLUS=12, 
		MINUS=13, MULTIPLY=14, DIVIDE=15, MODULO=16, NUMBER_TYPE=17, STRING_TYPE=18, 
		BOOLEAN_TYPE=19, AUTO_TYPE=20, SCANNER=21, While=22, If=23, Else=24, Else_If=25, 
		Execute=26, For=27, Print=28, Return=29, Method=30, SCANNERCALL=31, BOOLEAN=32, 
		STRING=33, NUMBER=34, AND=35, OR=36, GT=37, GE=38, LT=39, LE=40, EQ=41, 
		NOT=42, NOT_EQ=43, EQUALS=44, INPUT=45, EQUALS_TO=46, COMMENT_LINE=47, 
		IDENTIFIER=48, WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "STR_OPEN", 
			"STR_CLOSE", "SEMICOLON", "COLON", "DOT", "COMMA", "QUOTES", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "AUTO_TYPE", "SCANNER", "While", "If", "Else", "Else_If", 
			"Execute", "For", "Print", "Return", "Method", "SCANNERCALL", "BOOLEAN", 
			"STRING", "NUMBER", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "NOT", 
			"NOT_EQ", "EQUALS", "INPUT", "EQUALS_TO", "COMMENT_LINE", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "'.'", 
			"','", "'\"'", "'+'", "'-'", "'*'", "'/'", "'%'", "'numar'", "'sdc'", 
			"'bool'", "'automat'", "'scanner'", "'cat timp'", "'daca'", "'altfel daca'", 
			"'daca nu'", "'executa'", "'pentru'", "'printeaza'", "'returneaza'", 
			"'functia'", "'urmatorul'", null, null, null, "'&&'", "'||'", "'>'", 
			"'>='", "'<'", "'<='", "'='", "'!'", "'!='", "'=='", "'<<'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "STR_OPEN", 
			"STR_CLOSE", "SEMICOLON", "COLON", "DOT", "COMMA", "QUOTES", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "AUTO_TYPE", "SCANNER", "While", "If", "Else", "Else_If", 
			"Execute", "For", "Print", "Return", "Method", "SCANNERCALL", "BOOLEAN", 
			"STRING", "NUMBER", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "NOT", 
			"NOT_EQ", "EQUALS", "INPUT", "EQUALS_TO", "COMMENT_LINE", "IDENTIFIER", 
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


	public RoCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RoC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0109\n!\3\"\3\"\7\"\u010d\n"+
		"\"\f\"\16\"\u0110\13\"\3\"\3\"\3#\3#\3#\5#\u0117\n#\3#\3#\7#\u011b\n#"+
		"\f#\16#\u011e\13#\3#\3#\7#\u0122\n#\f#\16#\u0125\13#\5#\u0127\n#\5#\u0129"+
		"\n#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0151"+
		"\n\60\f\60\16\60\u0154\13\60\3\60\3\60\3\61\3\61\7\61\u015a\n\61\f\61"+
		"\16\61\u015d\13\61\3\62\6\62\u0160\n\62\r\62\16\62\u0161\3\62\3\62\2\2"+
		"\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\t\5\2\f\f\17"+
		"\17$$\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk"+
		"\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25"+
		"w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081"+
		"\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u008b\3\2\2\2\'\u008f\3\2\2\2"+
		")\u0094\3\2\2\2+\u009c\3\2\2\2-\u00a4\3\2\2\2/\u00ad\3\2\2\2\61\u00b2"+
		"\3\2\2\2\63\u00be\3\2\2\2\65\u00c6\3\2\2\2\67\u00ce\3\2\2\29\u00d5\3\2"+
		"\2\2;\u00df\3\2\2\2=\u00ea\3\2\2\2?\u00f2\3\2\2\2A\u0108\3\2\2\2C\u010a"+
		"\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I\u012d\3\2\2\2K\u0130\3\2\2\2M"+
		"\u0132\3\2\2\2O\u0135\3\2\2\2Q\u0137\3\2\2\2S\u013a\3\2\2\2U\u013c\3\2"+
		"\2\2W\u013e\3\2\2\2Y\u0141\3\2\2\2[\u0144\3\2\2\2]\u0147\3\2\2\2_\u014a"+
		"\3\2\2\2a\u0157\3\2\2\2c\u015f\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6"+
		"\3\2\2\2ij\7}\2\2j\b\3\2\2\2kl\7\177\2\2l\n\3\2\2\2mn\7]\2\2n\f\3\2\2"+
		"\2op\7_\2\2p\16\3\2\2\2qr\7=\2\2r\20\3\2\2\2st\7<\2\2t\22\3\2\2\2uv\7"+
		"\60\2\2v\24\3\2\2\2wx\7.\2\2x\26\3\2\2\2yz\7$\2\2z\30\3\2\2\2{|\7-\2\2"+
		"|\32\3\2\2\2}~\7/\2\2~\34\3\2\2\2\177\u0080\7,\2\2\u0080\36\3\2\2\2\u0081"+
		"\u0082\7\61\2\2\u0082 \3\2\2\2\u0083\u0084\7\'\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7w\2\2\u0087\u0088\7o\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7t\2\2\u008a$\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7f\2"+
		"\2\u008d\u008e\7e\2\2\u008e&\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7"+
		"q\2\2\u0091\u0092\7q\2\2\u0092\u0093\7n\2\2\u0093(\3\2\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7w\2\2\u0096\u0097\7v\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7o\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b*\3\2\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7p\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3,\3\2\2"+
		"\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8"+
		"\7\"\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7o\2\2\u00ab"+
		"\u00ac\7r\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\7c\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\u00b8\7n\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7c\2\2\u00bd\62\3\2\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7\"\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7w\2\2\u00c5\64\3\2\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7\u00c8\7z\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7e\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\66\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d48\3\2\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7|\2\2\u00dd\u00de\7c\2\2\u00de:\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7|\2\2"+
		"\u00e8\u00e9\7c\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7w\2"+
		"\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7c\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7n\2\2"+
		"\u00fb@\3\2\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7F\2\2\u00fe\u00ff\7G\2"+
		"\2\u00ff\u0100\7X\2\2\u0100\u0101\7C\2\2\u0101\u0102\7T\2\2\u0102\u0103"+
		"\7C\2\2\u0103\u0109\7V\2\2\u0104\u0105\7H\2\2\u0105\u0106\7C\2\2\u0106"+
		"\u0107\7N\2\2\u0107\u0109\7U\2\2\u0108\u00fc\3\2\2\2\u0108\u0104\3\2\2"+
		"\2\u0109B\3\2\2\2\u010a\u010e\7$\2\2\u010b\u010d\n\2\2\2\u010c\u010b\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7$\2\2\u0112D\3\2\2\2\u0113"+
		"\u0129\7\62\2\2\u0114\u0115\7/\2\2\u0115\u0117\7\"\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\t\3\2\2\u0119"+
		"\u011b\t\4\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0123\7\60\2\2\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0113\3\2\2\2\u0128\u0116\3\2\2\2\u0129F\3\2\2\2\u012a\u012b"+
		"\7(\2\2\u012b\u012c\7(\2\2\u012cH\3\2\2\2\u012d\u012e\7~\2\2\u012e\u012f"+
		"\7~\2\2\u012fJ\3\2\2\2\u0130\u0131\7@\2\2\u0131L\3\2\2\2\u0132\u0133\7"+
		"@\2\2\u0133\u0134\7?\2\2\u0134N\3\2\2\2\u0135\u0136\7>\2\2\u0136P\3\2"+
		"\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139R\3\2\2\2\u013a\u013b"+
		"\7?\2\2\u013bT\3\2\2\2\u013c\u013d\7#\2\2\u013dV\3\2\2\2\u013e\u013f\7"+
		"#\2\2\u013f\u0140\7?\2\2\u0140X\3\2\2\2\u0141\u0142\7?\2\2\u0142\u0143"+
		"\7?\2\2\u0143Z\3\2\2\2\u0144\u0145\7>\2\2\u0145\u0146\7>\2\2\u0146\\\3"+
		"\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7/\2\2\u0149^\3\2\2\2\u014a\u014b"+
		"\7%\2\2\u014b\u014c\7T\2\2\u014c\u014d\7q\2\2\u014d\u014e\7E\2\2\u014e"+
		"\u0152\3\2\2\2\u014f\u0151\n\5\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\b\60\2\2\u0156`\3\2\2\2\u0157\u015b\t\6\2\2"+
		"\u0158\u015a\t\7\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015cb\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0160\t\b\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\62\2\2\u0164"+
		"d\3\2\2\2\r\2\u0108\u010e\u0116\u011c\u0123\u0126\u0128\u0152\u015b\u0161"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}