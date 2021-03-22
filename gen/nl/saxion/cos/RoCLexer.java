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
		BOOLEAN_TYPE=19, AUTO_TYPE=20, While=21, If=22, Else=23, Else_If=24, Execute=25, 
		For=26, Print=27, Return=28, Method=29, BOOLEAN=30, STRING=31, NUMBER=32, 
		AND=33, OR=34, GT=35, GE=36, LT=37, LE=38, EQ=39, NOT=40, NOT_EQ=41, EQUALS=42, 
		EQUALS_TO=43, COMMENT_LINE=44, IDENTIFIER=45, WS=46;
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
			"BOOLEAN_TYPE", "AUTO_TYPE", "While", "If", "Else", "Else_If", "Execute", 
			"For", "Print", "Return", "Method", "BOOLEAN", "STRING", "NUMBER", "AND", 
			"OR", "GT", "GE", "LT", "LE", "EQ", "NOT", "NOT_EQ", "EQUALS", "EQUALS_TO", 
			"COMMENT_LINE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f1\n\37\3 \3 \7 \u00f5\n \f \16"+
		" \u00f8\13 \3 \3 \3!\5!\u00fd\n!\3!\6!\u0100\n!\r!\16!\u0101\3!\5!\u0105"+
		"\n!\3!\6!\u0108\n!\r!\16!\u0109\5!\u010c\n!\3\"\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\7-\u0131\n-\f-\16-\u0134\13-\3-\3-\3.\3.\7.\u013a\n."+
		"\f.\16.\u013d\13.\3/\6/\u0140\n/\r/\16/\u0141\3/\3/\2\2\60\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\b\5\2\f\f\17\17$$\3\2\62;\4\2\f\f\17\17"+
		"\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u014e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2"+
		"\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2"+
		"\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2"+
		"\2!}\3\2\2\2#\177\3\2\2\2%\u0085\3\2\2\2\'\u0089\3\2\2\2)\u008e\3\2\2"+
		"\2+\u0096\3\2\2\2-\u009f\3\2\2\2/\u00a4\3\2\2\2\61\u00b0\3\2\2\2\63\u00b8"+
		"\3\2\2\2\65\u00c0\3\2\2\2\67\u00c7\3\2\2\29\u00d1\3\2\2\2;\u00dc\3\2\2"+
		"\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00fc\3\2\2\2C\u010d\3\2\2\2E\u0110"+
		"\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2\2\2O"+
		"\u011d\3\2\2\2Q\u011f\3\2\2\2S\u0121\3\2\2\2U\u0124\3\2\2\2W\u0127\3\2"+
		"\2\2Y\u012a\3\2\2\2[\u0137\3\2\2\2]\u013f\3\2\2\2_`\7*\2\2`\4\3\2\2\2"+
		"ab\7+\2\2b\6\3\2\2\2cd\7}\2\2d\b\3\2\2\2ef\7\177\2\2f\n\3\2\2\2gh\7]\2"+
		"\2h\f\3\2\2\2ij\7_\2\2j\16\3\2\2\2kl\7=\2\2l\20\3\2\2\2mn\7<\2\2n\22\3"+
		"\2\2\2op\7\60\2\2p\24\3\2\2\2qr\7.\2\2r\26\3\2\2\2st\7$\2\2t\30\3\2\2"+
		"\2uv\7-\2\2v\32\3\2\2\2wx\7/\2\2x\34\3\2\2\2yz\7,\2\2z\36\3\2\2\2{|\7"+
		"\61\2\2| \3\2\2\2}~\7\'\2\2~\"\3\2\2\2\177\u0080\7p\2\2\u0080\u0081\7"+
		"w\2\2\u0081\u0082\7o\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084$"+
		"\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7f\2\2\u0087\u0088\7e\2\2\u0088"+
		"&\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7n\2\2\u008d(\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0095\7v\2\2\u0095*\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7c\2"+
		"\2\u0098\u0099\7v\2\2\u0099\u009a\7\"\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7o\2\2\u009d\u009e\7r\2\2\u009e,\3\2\2\2\u009f\u00a0"+
		"\7f\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		".\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7\"\2"+
		"\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7z\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7c\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7|\2\2\u00cf\u00d0\7c\2\2\u00d08\3\2\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7w\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7c\2\2\u00d9\u00da\7|\2\2\u00da\u00db\7c\2\2\u00db:\3\2\2\2\u00dc\u00dd"+
		"\7h\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7e\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7c\2\2\u00e3<\3\2\2\2\u00e4"+
		"\u00e5\7C\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7X\2\2"+
		"\u00e8\u00e9\7C\2\2\u00e9\u00ea\7T\2\2\u00ea\u00eb\7C\2\2\u00eb\u00f1"+
		"\7V\2\2\u00ec\u00ed\7H\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef\7N\2\2\u00ef"+
		"\u00f1\7U\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1>\3\2\2\2\u00f2"+
		"\u00f6\7$\2\2\u00f3\u00f5\n\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7$\2\2\u00fa@\3\2\2\2\u00fb\u00fd\7/\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\t\3"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u010b\3\2\2\2\u0103\u0105\7\60\2\2\u0104\u0103\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\t\3\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"B\3\2\2\2\u010d\u010e\7(\2\2\u010e\u010f\7(\2\2\u010fD\3\2\2\2\u0110\u0111"+
		"\7~\2\2\u0111\u0112\7~\2\2\u0112F\3\2\2\2\u0113\u0114\7@\2\2\u0114H\3"+
		"\2\2\2\u0115\u0116\7@\2\2\u0116\u0117\7?\2\2\u0117J\3\2\2\2\u0118\u0119"+
		"\7>\2\2\u0119L\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7?\2\2\u011cN\3"+
		"\2\2\2\u011d\u011e\7?\2\2\u011eP\3\2\2\2\u011f\u0120\7#\2\2\u0120R\3\2"+
		"\2\2\u0121\u0122\7#\2\2\u0122\u0123\7?\2\2\u0123T\3\2\2\2\u0124\u0125"+
		"\7?\2\2\u0125\u0126\7?\2\2\u0126V\3\2\2\2\u0127\u0128\7>\2\2\u0128\u0129"+
		"\7/\2\2\u0129X\3\2\2\2\u012a\u012b\7%\2\2\u012b\u012c\7T\2\2\u012c\u012d"+
		"\7q\2\2\u012d\u012e\7E\2\2\u012e\u0132\3\2\2\2\u012f\u0131\n\4\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b-\2\2\u0136"+
		"Z\3\2\2\2\u0137\u013b\t\5\2\2\u0138\u013a\t\6\2\2\u0139\u0138\3\2\2\2"+
		"\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\\\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\t\7\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\b/\2\2\u0144^\3\2\2\2\r\2\u00f0\u00f6\u00fc\u0101\u0104"+
		"\u0109\u010b\u0132\u013b\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}