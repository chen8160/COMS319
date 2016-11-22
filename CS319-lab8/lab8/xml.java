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
		ELEMENTTAG=1, WS=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "NUMBER", "ALPHA", "ELEMENTNAME", "ELEMENTTAG", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ELEMENTTAG", "WS"
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


	  int total = 0;


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
		case 4:
			ELEMENTTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ELEMENTTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:


			  String output = getText().substring(1, getText().length() - 1);
			  System.out.println("Starting Element Name: " + output);


			break;
		case 1:


			  output = getText().substring(2, getText().length() - 1);
			  System.out.println("Stopping Element Name: " + output);


			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("matching WS rule");skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\4_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\6\3\23\n\3\r\3\16\3"+
		"\24\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\37\n\5\3\5\3\5\3\5\7\5$\n\5\f"+
		"\5\16\5\'\13\5\5\5)\n\5\5\5+\n\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\5\5:\n\5\3\5\5\5=\n\5\3\5\3\5\3\5\7\5B\n\5\f"+
		"\5\16\5E\13\5\5\5G\n\5\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n"+
		"\6\3\6\3\6\5\6W\n\6\3\7\6\7Z\n\7\r\7\16\7[\3\7\3\7\2\2\b\3\2\5\2\7\2\t"+
		"\2\13\3\r\4\3\2\n\3\2\62;\4\2C\\c|\b\2/\60CMO\\aacmo|\4\2/\60aa\4\2ZZ"+
		"zz\b\2/\60CNP\\aacnp|\7\2CY[\\aacy{|\5\2\13\f\17\17\"\"p\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\3\17\3\2\2\2\5\22\3\2\2\2\7\26\3\2\2\2\tF\3\2\2\2\13V\3\2"+
		"\2\2\rY\3\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\23\5\3\2\2\22\21\3\2\2\2"+
		"\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\6\3\2\2\2\26\27\t\3\2\2"+
		"\27\b\3\2\2\2\30+\7z\2\2\31\32\7Z\2\2\32+\7o\2\2\33(\7O\2\2\34\37\5\3"+
		"\2\2\35\37\t\4\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37%\3\2\2\2 $\5\3\2\2!"+
		"$\t\5\2\2\"$\5\7\4\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2(\36\3\2\2\2()\3\2\2\2)+\3\2\2\2*\30"+
		"\3\2\2\2*\31\3\2\2\2*\33\3\2\2\2+G\3\2\2\2,9\t\6\2\2-\60\5\3\2\2.\60\t"+
		"\7\2\2/-\3\2\2\2/.\3\2\2\2\60\66\3\2\2\2\61\65\5\3\2\2\62\65\t\5\2\2\63"+
		"\65\5\7\4\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29/\3\2\2\29:\3\2\2\2:G\3"+
		"\2\2\2;=\t\b\2\2<;\3\2\2\2=C\3\2\2\2>B\5\3\2\2?B\t\5\2\2@B\5\7\4\2A>\3"+
		"\2\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2F*\3\2\2\2F,\3\2\2\2F<\3\2\2\2G\n\3\2\2\2HJ\7>\2\2IK\5\t\5\2JI\3"+
		"\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7@\2\2MW\b\6\2\2NO\7>\2\2OP\7\61\2\2PR\3"+
		"\2\2\2QS\5\t\5\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7@\2\2UW\b\6\3\2VH\3"+
		"\2\2\2VN\3\2\2\2W\f\3\2\2\2XZ\t\t\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\]\3\2\2\2]^\b\7\4\2^\16\3\2\2\2\25\2\24\36#%(*/\64\669<ACFJ"+
		"RV[\5\3\6\2\3\6\3\3\7\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}