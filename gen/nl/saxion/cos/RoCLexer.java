// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year_2/Compilers_OS/retake/31/src\RoC.g4 by ANTLR 4.9.1
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
		PAREN_OPEN=1, PAREN_CLOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, COMMA=5, PLUS=6, 
		MINUS=7, MULTIPLY=8, DIVIDE=9, MODULO=10, SHORT_TYPE=11, NUMBER_TYPE=12, 
		STRING_TYPE=13, BOOLEAN_TYPE=14, AUTO_TYPE=15, SCANNER=16, While=17, If=18, 
		Else=19, Execute=20, Print=21, Return=22, Method=23, SCANNERCALL=24, BOOLEAN=25, 
		STRING=26, SHORT=27, NUMBER=28, AND=29, OR=30, GT=31, GE=32, LT=33, LE=34, 
		EQ=35, NOT=36, NOT_EQ=37, EQUALS=38, EQUALS_TO=39, COMMENT_LINE=40, IDENTIFIER=41, 
		WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "COMMA", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "SHORT_TYPE", "NUMBER_TYPE", 
			"STRING_TYPE", "BOOLEAN_TYPE", "AUTO_TYPE", "SCANNER", "While", "If", 
			"Else", "Execute", "Print", "Return", "Method", "SCANNERCALL", "BOOLEAN", 
			"STRING", "SHORT", "NUMBER", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", 
			"NOT", "NOT_EQ", "EQUALS", "EQUALS_TO", "COMMENT_LINE", "IDENTIFIER", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u013a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e6\n\32\3\33"+
		"\3\33\7\33\u00ea\n\33\f\33\16\33\u00ed\13\33\3\33\3\33\3\34\5\34\u00f2"+
		"\n\34\3\34\3\34\3\35\3\35\5\35\u00f8\n\35\3\35\3\35\7\35\u00fc\n\35\f"+
		"\35\16\35\u00ff\13\35\5\35\u0101\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\7)\u0126\n)\f)\16)\u0129\13)\3)\3)\3*\3*\7*\u012f"+
		"\n*\f*\16*\u0132\13*\3+\6+\u0135\n+\r+\16+\u0136\3+\3+\2\2,\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,\3\2\t\5\2\f\f\17\17$$\3\2\62;\3\2\63;\4\2\f\f\17"+
		"\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0142\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3"+
		"\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2"+
		"\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31q\3\2\2\2\33w\3"+
		"\2\2\2\35{\3\2\2\2\37\u0080\3\2\2\2!\u0088\3\2\2\2#\u0090\3\2\2\2%\u0099"+
		"\3\2\2\2\'\u009e\3\2\2\2)\u00aa\3\2\2\2+\u00b2\3\2\2\2-\u00bc\3\2\2\2"+
		"/\u00c7\3\2\2\2\61\u00cf\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67"+
		"\u00f1\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u0108\3\2"+
		"\2\2A\u010a\3\2\2\2C\u010d\3\2\2\2E\u010f\3\2\2\2G\u0112\3\2\2\2I\u0114"+
		"\3\2\2\2K\u0116\3\2\2\2M\u0119\3\2\2\2O\u011c\3\2\2\2Q\u011f\3\2\2\2S"+
		"\u012c\3\2\2\2U\u0134\3\2\2\2WX\7*\2\2X\4\3\2\2\2YZ\7+\2\2Z\6\3\2\2\2"+
		"[\\\7}\2\2\\\b\3\2\2\2]^\7\177\2\2^\n\3\2\2\2_`\7.\2\2`\f\3\2\2\2ab\7"+
		"-\2\2b\16\3\2\2\2cd\7/\2\2d\20\3\2\2\2ef\7,\2\2f\22\3\2\2\2gh\7\61\2\2"+
		"h\24\3\2\2\2ij\7\'\2\2j\26\3\2\2\2kl\7u\2\2lm\7e\2\2mn\7w\2\2no\7t\2\2"+
		"op\7v\2\2p\30\3\2\2\2qr\7p\2\2rs\7w\2\2st\7o\2\2tu\7c\2\2uv\7t\2\2v\32"+
		"\3\2\2\2wx\7u\2\2xy\7f\2\2yz\7e\2\2z\34\3\2\2\2{|\7d\2\2|}\7q\2\2}~\7"+
		"q\2\2~\177\7n\2\2\177\36\3\2\2\2\u0080\u0081\7c\2\2\u0081\u0082\7w\2\2"+
		"\u0082\u0083\7v\2\2\u0083\u0084\7q\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7v\2\2\u0087 \3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
		"\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7p\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\"\3\2\2\2\u0090\u0091\7e\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7v\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7v\2"+
		"\2\u0095\u0096\7k\2\2\u0096\u0097\7o\2\2\u0097\u0098\7r\2\2\u0098$\3\2"+
		"\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2\u009b\u009c\7e\2\2\u009c\u009d"+
		"\7c\2\2\u009d&\3\2\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7\"\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7e\2"+
		"\2\u00a8\u00a9\7c\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7"+
		"z\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7c\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7|\2\2\u00ba\u00bb\7c\2\2"+
		"\u00bb,\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2"+
		"\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7|\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		".\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7e\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7c\2\2"+
		"\u00ce\60\3\2\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7"+
		"o\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7n\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7C\2\2\u00da\u00db\7F\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7X\2\2\u00dd"+
		"\u00de\7C\2\2\u00de\u00df\7T\2\2\u00df\u00e0\7C\2\2\u00e0\u00e6\7V\2\2"+
		"\u00e1\u00e2\7H\2\2\u00e2\u00e3\7C\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e6"+
		"\7U\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\64\3\2\2\2\u00e7"+
		"\u00eb\7$\2\2\u00e8\u00ea\n\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7$\2\2\u00ef\66\3\2\2\2\u00f0\u00f2\7&\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\t\3\2\2\u00f48\3\2\2\2\u00f5\u0101\7\62\2\2\u00f6\u00f8\7&\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\t\4"+
		"\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u00f5\3\2\2\2\u0100\u00f7\3\2\2\2\u0101:\3\2\2\2\u0102\u0103"+
		"\7(\2\2\u0103\u0104\7(\2\2\u0104<\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107"+
		"\7~\2\2\u0107>\3\2\2\2\u0108\u0109\7@\2\2\u0109@\3\2\2\2\u010a\u010b\7"+
		"@\2\2\u010b\u010c\7?\2\2\u010cB\3\2\2\2\u010d\u010e\7>\2\2\u010eD\3\2"+
		"\2\2\u010f\u0110\7>\2\2\u0110\u0111\7?\2\2\u0111F\3\2\2\2\u0112\u0113"+
		"\7?\2\2\u0113H\3\2\2\2\u0114\u0115\7#\2\2\u0115J\3\2\2\2\u0116\u0117\7"+
		"#\2\2\u0117\u0118\7?\2\2\u0118L\3\2\2\2\u0119\u011a\7?\2\2\u011a\u011b"+
		"\7?\2\2\u011bN\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e\7/\2\2\u011eP\3"+
		"\2\2\2\u011f\u0120\7%\2\2\u0120\u0121\7T\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7E\2\2\u0123\u0127\3\2\2\2\u0124\u0126\n\5\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\b)\2\2\u012bR\3\2\2\2\u012c"+
		"\u0130\t\6\2\2\u012d\u012f\t\7\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131T\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0133\u0135\t\b\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b+"+
		"\2\2\u0139V\3\2\2\2\f\2\u00e5\u00eb\u00f1\u00f7\u00fd\u0100\u0127\u0130"+
		"\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}