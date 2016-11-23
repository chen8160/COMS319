// Generated from xml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xml extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EMAIL=1, DATETEST=2, PHONE=3, CREDITCARD=4, OTHER=5, WS=6;
	public static final int INSIDE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "ALPHA", "SPECIALCHAR", "ELEMENTNAME", "LOCAL", "DOMAIN", "DATE", 
		"MONTH", "YEAR", "THREEDIGIT", "FOURDIGIT", "VISA", "MASTER", "AMERICANEXP", 
		"DINERSCLUB", "DISCOVER", "JCB", "ELEMENTTAG", "EMAIL", "DATETEST", "PHONE", 
		"CREDITCARD", "OTHER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EMAIL", "DATETEST", "PHONE", "CREDITCARD", "OTHER", "WS"
	};
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


	  boolean tag = false;
	  boolean closeTag = false;
	  String tagName = "";


	public xml(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			ELEMENTTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			DATETEST_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			PHONE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			CREDITCARD_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ELEMENTTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			  tag = false;
			  String output = getText().substring(1, getText().length() - 1);
			  tagName = output;
			  System.out.println("Starting Element Name: " + output);

			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			  System.out.println("Email: " + getText());

			break;
		}
	}
	private void DATETEST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			  System.out.println("Date: " + getText());

			break;
		}
	}
	private void PHONE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			  System.out.println("Phone: " + getText());

			break;
		}
	}
	private void CREDITCARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			  System.out.println("Credit Card: " + getText());

			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Other: " + "TAG: " + tagName + " " + getText());
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("matching WS rule");skip();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return EMAIL_sempred((RuleContext)_localctx, predIndex);
		case 19:
			return DATETEST_sempred((RuleContext)_localctx, predIndex);
		case 20:
			return PHONE_sempred((RuleContext)_localctx, predIndex);
		case 21:
			return CREDITCARD_sempred((RuleContext)_localctx, predIndex);
		case 22:
			return OTHER_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EMAIL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !tag && tagName.matches("(?i)email");
		}
		return true;
	}
	private boolean DATETEST_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !tag && tagName.matches("(?i)date");
		}
		return true;
	}
	private boolean PHONE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !tag && tagName.matches("(?i)phone");
		}
		return true;
	}
	private boolean CREDITCARD_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !tag && tagName.matches("(?i)creditcard");
		}
		return true;
	}
	private boolean OTHER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !tag && !tagName.matches("(?i)email") && !tagName.matches("(?i)date") && !tagName.matches("(?i)phone") && !tagName.matches("(?i)creditcard");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\u0175\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5"+
		"\3\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\5\5M\n\5\3\5\3\5\3\5\5\5R\n\5\3"+
		"\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\5\5\\\n\5\3\5\5\5_\n\5\3\5\3\5\3\5"+
		"\7\5d\n\5\f\5\16\5g\13\5\5\5i\n\5\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\5\6"+
		"s\n\6\3\6\3\6\3\6\3\6\5\6y\n\6\7\6{\n\6\f\6\16\6~\13\6\3\7\6\7\u0081\n"+
		"\7\r\7\16\7\u0082\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\5\b\u008d\n\b"+
		"\3\t\3\t\3\t\5\t\u0092\n\t\3\t\5\t\u0095\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d6"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dd\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00f1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u010c\n\22\3\23\3\23\3\23\3\23\7\23\u0112\n\23\f\23\16\23\u0115"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u014d\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u015a\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30\u0165\n"+
		"\30\r\30\16\30\u0166\3\30\3\30\3\30\3\30\3\31\6\31\u016e\n\31\r\31\16"+
		"\31\u016f\3\31\3\31\3\31\3\31\3\u0113\2\32\4\2\6\2\b\2\n\2\f\2\16\2\20"+
		"\2\22\2\24\2\26\2\30\2\32\2\34\2\36\2 \2\"\2$\2&\2(\3*\4,\5.\6\60\7\62"+
		"\b\4\2\3\25\3\2\62;\4\2C\\c|\t\2##&&(/<=??aa\u0080\u0080\b\2/\60CMO\\"+
		"aacmo|\4\2/\60aa\4\2ZZzz\b\2/\60CNP\\aacnp|\7\2CY[\\aacy{|\6\2/\60\62"+
		";C\\c|\3\2\65\65\3\2\62\63\3\2\63\64\3\2\63;\3\2\63\63\3\2\62\64\3\2\63"+
		"\67\4\2\66\6699\3\2\62\67\5\2\13\f\17\17\"\"\u0196\2&\3\2\2\2\3(\3\2\2"+
		"\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\4\64\3\2"+
		"\2\2\6\66\3\2\2\2\b8\3\2\2\2\nh\3\2\2\2\fm\3\2\2\2\16\u0080\3\2\2\2\20"+
		"\u008c\3\2\2\2\22\u0094\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00a5"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00b7\3\2\2\2\36\u00bf\3\2\2\2 \u00dc\3\2"+
		"\2\2\"\u00f0\3\2\2\2$\u010b\3\2\2\2&\u010d\3\2\2\2(\u0120\3\2\2\2*\u0128"+
		"\3\2\2\2,\u0132\3\2\2\2.\u0152\3\2\2\2\60\u015f\3\2\2\2\62\u016d\3\2\2"+
		"\2\64\65\t\2\2\2\65\5\3\2\2\2\66\67\t\3\2\2\67\7\3\2\2\289\t\4\2\29\t"+
		"\3\2\2\2:M\7z\2\2;<\7Z\2\2<M\7o\2\2=J\7O\2\2>A\5\4\2\2?A\t\5\2\2@>\3\2"+
		"\2\2@?\3\2\2\2AG\3\2\2\2BF\5\4\2\2CF\t\6\2\2DF\5\6\3\2EB\3\2\2\2EC\3\2"+
		"\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J@\3\2"+
		"\2\2JK\3\2\2\2KM\3\2\2\2L:\3\2\2\2L;\3\2\2\2L=\3\2\2\2Mi\3\2\2\2N[\t\7"+
		"\2\2OR\5\4\2\2PR\t\b\2\2QO\3\2\2\2QP\3\2\2\2RX\3\2\2\2SW\5\4\2\2TW\t\6"+
		"\2\2UW\5\6\3\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2[Q\3\2\2\2[\\\3\2\2\2\\i\3\2\2\2]_\t\t\2\2^]"+
		"\3\2\2\2_e\3\2\2\2`d\5\4\2\2ad\t\6\2\2bd\5\6\3\2c`\3\2\2\2ca\3\2\2\2c"+
		"b\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hL\3\2\2\2"+
		"hN\3\2\2\2h^\3\2\2\2i\13\3\2\2\2jn\5\4\2\2kn\5\6\3\2ln\5\b\4\2mj\3\2\2"+
		"\2mk\3\2\2\2ml\3\2\2\2n|\3\2\2\2os\5\4\2\2ps\5\6\3\2qs\5\b\4\2ro\3\2\2"+
		"\2rp\3\2\2\2rq\3\2\2\2s{\3\2\2\2tx\7\60\2\2uy\5\4\2\2vy\5\6\3\2wy\5\b"+
		"\4\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y{\3\2\2\2zr\3\2\2\2zt\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2\177\u0081\t\n\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\17\3\2\2\2\u0084\u0085\t\13\2\2\u0085\u008d\t\f\2\2\u0086\u0087"+
		"\t\r\2\2\u0087\u008d\t\2\2\2\u0088\u008a\7\62\2\2\u0089\u0088\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\t\16\2\2\u008c\u0084"+
		"\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u008f\t\17\2\2\u008f\u0095\t\20\2\2\u0090\u0092\7\62\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\t\16\2\2"+
		"\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097"+
		"\7\64\2\2\u0097\u0098\7\62\2\2\u0098\u0099\3\2\2\2\u0099\u009a\t\2\2\2"+
		"\u009a\u00a0\t\2\2\2\u009b\u009c\7\64\2\2\u009c\u009d\7\63\2\2\u009d\u009e"+
		"\7\62\2\2\u009e\u00a0\7\62\2\2\u009f\u0096\3\2\2\2\u009f\u009b\3\2\2\2"+
		"\u00a0\25\3\2\2\2\u00a1\u00a2\5\4\2\2\u00a2\u00a3\5\4\2\2\u00a3\u00a4"+
		"\5\4\2\2\u00a4\27\3\2\2\2\u00a5\u00a6\5\4\2\2\u00a6\u00a7\5\4\2\2\u00a7"+
		"\u00a8\5\4\2\2\u00a8\u00a9\5\4\2\2\u00a9\31\3\2\2\2\u00aa\u00b5\7\66\2"+
		"\2\u00ab\u00ac\5\30\f\2\u00ac\u00ad\5\30\f\2\u00ad\u00ae\5\30\f\2\u00ae"+
		"\u00af\5\26\13\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\5\26\13\2\u00b1\u00b2"+
		"\5\26\13\2\u00b2\u00b3\5\26\13\2\u00b3\u00b4\5\26\13\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8"+
		"\7\67\2\2\u00b8\u00b9\t\21\2\2\u00b9\u00ba\5\30\f\2\u00ba\u00bb\5\30\f"+
		"\2\u00bb\u00bc\5\30\f\2\u00bc\u00bd\5\4\2\2\u00bd\u00be\5\4\2\2\u00be"+
		"\35\3\2\2\2\u00bf\u00c0\7\65\2\2\u00c0\u00c1\t\22\2\2\u00c1\u00c2\5\30"+
		"\f\2\u00c2\u00c3\5\30\f\2\u00c3\u00c4\5\30\f\2\u00c4\u00c5\5\4\2\2\u00c5"+
		"\37\3\2\2\2\u00c6\u00c7\7\65\2\2\u00c7\u00c8\7\62\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\t\23\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\26\13\2\u00cc"+
		"\u00cd\5\26\13\2\u00cd\u00ce\5\26\13\2\u00ce\u00cf\5\4\2\2\u00cf\u00d0"+
		"\5\4\2\2\u00d0\u00dd\3\2\2\2\u00d1\u00d2\7\65\2\2\u00d2\u00d6\78\2\2\u00d3"+
		"\u00d4\7\65\2\2\u00d4\u00d6\7:\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\26\13\2\u00d8\u00d9\5\26\13\2\u00d9"+
		"\u00da\5\26\13\2\u00da\u00db\5\26\13\2\u00db\u00dd\3\2\2\2\u00dc\u00c6"+
		"\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\78\2\2\u00df\u00e0"+
		"\7\62\2\2\u00e0\u00e1\7\63\2\2\u00e1\u00e2\7\63\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3\u00e4\5\30\f\2\u00e4\u00e5\5\30\f\2\u00e5\u00e6\5\30\f\2\u00e6"+
		"\u00f1\3\2\2\2\u00e7\u00e8\78\2\2\u00e8\u00e9\7\67\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\5\30\f\2\u00eb\u00ec\5\30\f\2\u00ec\u00ed\5\30\f\2\u00ed"+
		"\u00ee\5\4\2\2\u00ee\u00ef\5\4\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00de\3\2"+
		"\2\2\u00f0\u00e7\3\2\2\2\u00f1#\3\2\2\2\u00f2\u00f3\7\64\2\2\u00f3\u00f4"+
		"\7\63\2\2\u00f4\u00f5\7\65\2\2\u00f5\u00fb\7\63\2\2\u00f6\u00f7\7\63\2"+
		"\2\u00f7\u00f8\7:\2\2\u00f8\u00f9\7\62\2\2\u00f9\u00fb\7\62\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5\26"+
		"\13\2\u00fd\u00fe\5\26\13\2\u00fe\u00ff\5\26\13\2\u00ff\u0100\5\4\2\2"+
		"\u0100\u0101\5\4\2\2\u0101\u010c\3\2\2\2\u0102\u0103\7\65\2\2\u0103\u0104"+
		"\7\67\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5\26\13\2\u0106\u0107\5\26\13"+
		"\2\u0107\u0108\5\26\13\2\u0108\u0109\5\30\f\2\u0109\u010a\5\4\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u0102\3\2\2\2\u010c%\3\2\2\2"+
		"\u010d\u010e\7>\2\2\u010e\u010f\5\n\5\2\u010f\u0113\7@\2\2\u0110\u0112"+
		"\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117"+
		"\7>\2\2\u0117\u0118\7\61\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5\n\5\2\u011a"+
		"\u011b\7@\2\2\u011b\u011c\b\23\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\23"+
		"\3\2\u011e\u011f\b\23\4\2\u011f\'\3\2\2\2\u0120\u0121\6\24\2\2\u0121\u0122"+
		"\5\f\6\2\u0122\u0123\7B\2\2\u0123\u0124\5\16\7\2\u0124\u0125\b\24\5\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0127\b\24\6\2\u0127)\3\2\2\2\u0128\u0129\6"+
		"\25\3\2\u0129\u012a\5\20\b\2\u012a\u012b\7\61\2\2\u012b\u012c\5\22\t\2"+
		"\u012c\u012d\7\61\2\2\u012d\u012e\5\24\n\2\u012e\u012f\b\25\7\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\b\25\6\2\u0131+\3\2\2\2\u0132\u014c\6\26\4"+
		"\2\u0133\u0134\5\26\13\2\u0134\u0135\7/\2\2\u0135\u0136\5\26\13\2\u0136"+
		"\u0137\7/\2\2\u0137\u0138\5\30\f\2\u0138\u014d\3\2\2\2\u0139\u013a\7*"+
		"\2\2\u013a\u013b\5\26\13\2\u013b\u013c\7+\2\2\u013c\u013d\5\26\13\2\u013d"+
		"\u013e\7/\2\2\u013e\u013f\5\30\f\2\u013f\u014d\3\2\2\2\u0140\u0141\5\26"+
		"\13\2\u0141\u0142\7\"\2\2\u0142\u0143\5\26\13\2\u0143\u0144\7\"\2\2\u0144"+
		"\u0145\5\30\f\2\u0145\u014d\3\2\2\2\u0146\u0147\5\26\13\2\u0147\u0148"+
		"\7\60\2\2\u0148\u0149\5\26\13\2\u0149\u014a\7\60\2\2\u014a\u014b\5\30"+
		"\f\2\u014b\u014d\3\2\2\2\u014c\u0133\3\2\2\2\u014c\u0139\3\2\2\2\u014c"+
		"\u0140\3\2\2\2\u014c\u0146\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b\26"+
		"\b\2\u014f\u0150\3\2\2\2\u0150\u0151\b\26\6\2\u0151-\3\2\2\2\u0152\u0159"+
		"\6\27\5\2\u0153\u015a\5\32\r\2\u0154\u015a\5\34\16\2\u0155\u015a\5\36"+
		"\17\2\u0156\u015a\5 \20\2\u0157\u015a\5\"\21\2\u0158\u015a\5$\22\2\u0159"+
		"\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\27\t\2\u015c\u015d\3\2\2\2\u015d\u015e\b\27\6\2\u015e/\3\2\2"+
		"\2\u015f\u0164\6\30\6\2\u0160\u0165\5\4\2\2\u0161\u0165\5\6\3\2\u0162"+
		"\u0165\5\b\4\2\u0163\u0165\7\"\2\2\u0164\u0160\3\2\2\2\u0164\u0161\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\30"+
		"\n\2\u0169\u016a\3\2\2\2\u016a\u016b\b\30\6\2\u016b\61\3\2\2\2\u016c\u016e"+
		"\t\24\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b\31\13\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\b\31\6\2\u0174\63\3\2\2\2(\2\3@EGJLQVX[^cehmrxz|"+
		"\u0082\u0089\u008c\u0091\u0094\u009f\u00b5\u00d5\u00dc\u00f0\u00fa\u010b"+
		"\u0113\u014c\u0159\u0164\u0166\u016f\f\3\23\2\5\2\2\7\3\2\3\24\3\6\2\2"+
		"\3\25\4\3\26\5\3\27\6\3\30\7\3\31\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}