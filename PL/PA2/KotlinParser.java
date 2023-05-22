// Generated from Kotlin.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, LCOMMENT=36, DCOMMENT=37, COMMA=38, 
		LPAREN=39, RPAREN=40, LCURL=41, RCURL=42, COLON=43, EQ=44, EQEQ=45, EQEQEQ=46, 
		DOLLAR=47, QM=48, PACKAGE=49, IMPORT=50, CLASS=51, FUN=52, OBJ=53, VAL=54, 
		VAR=55, NULL=56, IF=57, ELSE=58, FOR=59, WHILE=60, RETURN=61, IN=62, NOT_IN=63, 
		IS=64, NEWLINE=65, INT=66, REAL=67, STRING=68, PACKAGENAME=69, IMPORTNAME=70, 
		ID=71, WS=72;
	public static final int
		RULE_prog = 0, RULE_package = 1, RULE_imports = 2, RULE_declaration = 3, 
		RULE_function = 4, RULE_funcParameters = 5, RULE_funcParameter = 6, RULE_funcBody = 7, 
		RULE_variable = 8, RULE_varType = 9, RULE_assn = 10, RULE_assnOperator = 11, 
		RULE_num = 12, RULE_string = 13, RULE_strContent = 14, RULE_strlength = 15, 
		RULE_dollarStr = 16, RULE_class = 17, RULE_classParameters = 18, RULE_classParameter = 19, 
		RULE_parentClass = 20, RULE_classBody = 21, RULE_comment = 22, RULE_statements = 23, 
		RULE_statement = 24, RULE_expr = 25, RULE_if = 26, RULE_else = 27, RULE_ifBody = 28, 
		RULE_loop = 29, RULE_forloop = 30, RULE_list = 31, RULE_range = 32, RULE_whileloop = 33, 
		RULE_return = 34, RULE_type = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "package", "imports", "declaration", "function", "funcParameters", 
			"funcParameter", "funcBody", "variable", "varType", "assn", "assnOperator", 
			"num", "string", "strContent", "strlength", "dollarStr", "class", "classParameters", 
			"classParameter", "parentClass", "classBody", "comment", "statements", 
			"statement", "expr", "if", "else", "ifBody", "loop", "forloop", "list", 
			"range", "whileloop", "return", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'*='", "'/='", "'%='", "'\"'", "'.length'", "'()'", 
			"'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'!'", "'&&'", "'||'", "'++'", 
			"'--'", "'..'", "'listOf'", "'['", "']'", "'up'", "'down'", "'step'", 
			"'Double'", "'Float'", "'Long'", "'Int'", "'Short'", "'Byte'", "'Any'", 
			"'String'", "'list'", null, null, "','", "'('", "')'", "'{'", "'}'", 
			"':'", "'='", "'=='", "'==='", "'$'", "'?'", "'package'", "'import'", 
			"'class'", "'fun'", "'object'", "'val'", "'var'", "'null'", "'if'", "'else'", 
			"'for'", "'while'", "'return'", "'in'", "'!in'", "'is'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LCOMMENT", "DCOMMENT", "COMMA", "LPAREN", "RPAREN", "LCURL", "RCURL", 
			"COLON", "EQ", "EQEQ", "EQEQEQ", "DOLLAR", "QM", "PACKAGE", "IMPORT", 
			"CLASS", "FUN", "OBJ", "VAL", "VAR", "NULL", "IF", "ELSE", "FOR", "WHILE", 
			"RETURN", "IN", "NOT_IN", "IS", "NEWLINE", "INT", "REAL", "STRING", "PACKAGENAME", 
			"IMPORTNAME", "ID", "WS"
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
	public String getGrammarFileName() { return "Kotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(72);
				package_();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(75);
				imports();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (LCOMMENT - 36)) | (1L << (DCOMMENT - 36)) | (1L << (CLASS - 36)) | (1L << (FUN - 36)) | (1L << (VAL - 36)) | (1L << (VAR - 36)) | (1L << (IF - 36)) | (1L << (ID - 36)))) != 0)) {
				{
				{
				setState(81);
				declaration();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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

	public static class PackageContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public TerminalNode PACKAGENAME() { return getToken(KotlinParser.PACKAGENAME, 0); }
		public TerminalNode NEWLINE() { return getToken(KotlinParser.NEWLINE, 0); }
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPackage(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(PACKAGE);
			setState(90);
			match(PACKAGENAME);
			setState(91);
			match(NEWLINE);
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode NEWLINE() { return getToken(KotlinParser.NEWLINE, 0); }
		public List<TerminalNode> IMPORTNAME() { return getTokens(KotlinParser.IMPORTNAME); }
		public TerminalNode IMPORTNAME(int i) {
			return getToken(KotlinParser.IMPORTNAME, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IMPORT);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORTNAME) {
				{
				{
				setState(94);
				match(IMPORTNAME);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(NEWLINE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				function();
				}
				break;
			case VAL:
			case VAR:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				variable();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				class_();
				}
				break;
			case LCOMMENT:
			case DCOMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				comment();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QM() { return getToken(KotlinParser.QM, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FUN);
			setState(109);
			match(ID);
			setState(110);
			funcParameters();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(111);
				match(COLON);
				setState(112);
				type();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(113);
					match(QM);
					}
				}

				}
			}

			setState(118);
			funcBody();
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

	public static class FuncParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<FuncParameterContext> funcParameter() {
			return getRuleContexts(FuncParameterContext.class);
		}
		public FuncParameterContext funcParameter(int i) {
			return getRuleContext(FuncParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFuncParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFuncParameters(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LPAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(121);
				funcParameter();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					funcParameter();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			match(RPAREN);
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

	public static class FuncParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFuncParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFuncParameter(this);
		}
	}

	public final FuncParameterContext funcParameter() throws RecognitionException {
		FuncParameterContext _localctx = new FuncParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(COLON);
			setState(135);
			type();
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

	public static class FuncBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFuncBody(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcBody);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LCURL);
				setState(138);
				statements();
				setState(139);
				match(RCURL);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(EQ);
				setState(142);
				statements();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssnContext assn() {
			return getRuleContext(AssnContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL || _la==VAR) {
					{
					setState(145);
					varType();
					}
				}

				setState(148);
				match(ID);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(149);
					match(COLON);
					setState(150);
					type();
					}
				}

				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << EQ))) != 0)) {
					{
					setState(153);
					assn();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL || _la==VAR) {
					{
					setState(156);
					varType();
					}
				}

				setState(159);
				if_();
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
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

	public static class AssnContext extends ParserRuleContext {
		public AssnOperatorContext assnOperator() {
			return getRuleContext(AssnOperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAssn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAssn(this);
		}
	}

	public final AssnContext assn() throws RecognitionException {
		AssnContext _localctx = new AssnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			assnOperator();
			setState(165);
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

	public static class AssnOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public AssnOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assnOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAssnOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAssnOperator(this);
		}
	}

	public final AssnOperatorContext assnOperator() throws RecognitionException {
		AssnOperatorContext _localctx = new AssnOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assnOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << EQ))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode REAL() { return getToken(KotlinParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT - 66)) | (1L << (REAL - 66)) | (1L << (STRING - 66)))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public List<StrContentContext> strContent() {
			return getRuleContexts(StrContentContext.class);
		}
		public StrContentContext strContent(int i) {
			return getRuleContext(StrContentContext.class,i);
		}
		public List<DollarStrContext> dollarStr() {
			return getRuleContexts(DollarStrContext.class);
		}
		public DollarStrContext dollarStr(int i) {
			return getRuleContext(DollarStrContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__5);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (DOLLAR - 47)) | (1L << (INT - 47)) | (1L << (REAL - 47)) | (1L << (STRING - 47)))) != 0)) {
				{
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(172);
					strContent();
					}
					break;
				case 2:
					{
					setState(173);
					dollarStr();
					}
					break;
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__5);
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

	public static class StrContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(KotlinParser.DOLLAR, 0); }
		public StrContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStrContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStrContent(this);
		}
	}

	public final StrContentContext strContent() throws RecognitionException {
		StrContentContext _localctx = new StrContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strContent);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(DOLLAR);
				setState(184);
				match(STRING);
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

	public static class StrlengthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public StrlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStrlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStrlength(this);
		}
	}

	public final StrlengthContext strlength() throws RecognitionException {
		StrlengthContext _localctx = new StrlengthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_strlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(STRING);
			setState(188);
			match(T__6);
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

	public static class DollarStrContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(KotlinParser.DOLLAR, 0); }
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StrContentContext strContent() {
			return getRuleContext(StrContentContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public DollarStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollarStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDollarStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDollarStr(this);
		}
	}

	public final DollarStrContext dollarStr() throws RecognitionException {
		DollarStrContext _localctx = new DollarStrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dollarStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(DOLLAR);
			setState(191);
			match(LCURL);
			setState(192);
			strContent();
			setState(193);
			match(RCURL);
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ClassParametersContext classParameters() {
			return getRuleContext(ClassParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public ParentClassContext parentClass() {
			return getRuleContext(ParentClassContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CLASS);
			setState(196);
			match(ID);
			setState(197);
			classParameters();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(198);
				match(COLON);
				setState(199);
				parentClass();
				}
			}

			setState(202);
			classBody();
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

	public static class ClassParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ClassParameterContext> classParameter() {
			return getRuleContexts(ClassParameterContext.class);
		}
		public ClassParameterContext classParameter(int i) {
			return getRuleContext(ClassParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClassParameters(this);
		}
	}

	public final ClassParametersContext classParameters() throws RecognitionException {
		ClassParametersContext _localctx = new ClassParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LPAREN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(205);
				classParameter();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					classParameter();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(215);
			match(RPAREN);
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

	public static class ClassParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public ClassParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClassParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClassParameter(this);
		}
	}

	public final ClassParameterContext classParameter() throws RecognitionException {
		ClassParameterContext _localctx = new ClassParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(ID);
			setState(219);
			match(COLON);
			setState(220);
			type();
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

	public static class ParentClassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ParentClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterParentClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitParentClass(this);
		}
	}

	public final ParentClassContext parentClass() throws RecognitionException {
		ParentClassContext _localctx = new ParentClassContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parentClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(T__7);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LCURL);
			setState(226);
			statements();
			setState(227);
			match(RCURL);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LCOMMENT() { return getToken(KotlinParser.LCOMMENT, 0); }
		public TerminalNode DCOMMENT() { return getToken(KotlinParser.DCOMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==LCOMMENT || _la==DCOMMENT) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(KotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KotlinParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(NEWLINE);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(237);
				statement();
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						match(NEWLINE);
						setState(239);
						statement();
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(NEWLINE);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				return_();
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

	public static class ExprContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public StrlengthContext strlength() {
			return getRuleContext(StrlengthContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(KotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KotlinParser.COLON, i);
		}
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode IS() { return getToken(KotlinParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpr(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(262);
				num();
				}
				break;
			case 2:
				{
				setState(263);
				match(ID);
				}
				break;
			case 3:
				{
				setState(264);
				list();
				}
				break;
			case 4:
				{
				setState(265);
				range();
				}
				break;
			case 5:
				{
				setState(266);
				strlength();
				}
				break;
			case 6:
				{
				setState(267);
				match(LPAREN);
				setState(268);
				expr(0);
				setState(269);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(274);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLON) {
							{
							{
							setState(275);
							match(COLON);
							}
							}
							setState(280);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(281);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(283);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLON) {
							{
							{
							setState(284);
							match(COLON);
							}
							}
							setState(289);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(290);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(292);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLON) {
							{
							{
							setState(293);
							match(COLON);
							}
							}
							setState(298);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(299);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(301);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(304);
						match(IN);
						setState(305);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(307);
						match(T__19);
						setState(308);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(312);
						match(IS);
						setState(313);
						type();
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IF);
			setState(320);
			match(LPAREN);
			setState(321);
			expr(0);
			setState(322);
			match(RPAREN);
			setState(323);
			ifBody();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(324);
				else_();
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(ELSE);
				setState(328);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(ELSE);
				setState(330);
				ifBody();
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

	public static class IfBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LCURL);
			setState(334);
			statements();
			setState(335);
			match(RCURL);
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

	public static class LoopContext extends ParserRuleContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loop);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				forloop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				whileloop();
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(FOR);
			setState(342);
			match(LPAREN);
			setState(343);
			expr(0);
			setState(344);
			match(RPAREN);
			setState(345);
			statements();
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

	public static class ListContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__20);
			setState(348);
			match(T__21);
			setState(349);
			string();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				string();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(T__22);
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

	public static class RangeContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_range);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				num();
				setState(360);
				match(T__19);
				setState(361);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				num();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23 || _la==T__24) {
					{
					setState(364);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(367);
				num();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(368);
					match(T__25);
					}
				}

				setState(371);
				num();
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(WHILE);
			setState(376);
			match(LPAREN);
			setState(377);
			expr(0);
			setState(378);
			match(RPAREN);
			setState(379);
			statements();
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

	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KotlinParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode NULL() { return getToken(KotlinParser.NULL, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_return);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(RETURN);
				setState(382);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(RETURN);
				setState(384);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(RETURN);
				setState(386);
				num();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(RETURN);
				setState(388);
				match(NULL);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u018a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0003\u0000J\b\u0000\u0001\u0000\u0005\u0000M\b\u0000"+
		"\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000"+
		"V\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002"+
		"c\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004s\b\u0004\u0003\u0004"+
		"u\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0003"+
		"\u0005\u0082\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0090\b\u0007\u0001\b\u0003\b\u0093\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\b\u0003\b\u009b\b\b\u0001"+
		"\b\u0003\b\u009e\b\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00af\b\r\n\r\f\r\u00b2\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00c9\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00d1\b\u0012\n\u0012\f\u0012\u00d4"+
		"\t\u0012\u0003\u0012\u00d6\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0005\u0017\u00e9\b\u0017\n\u0017\f\u0017\u00ec"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00f1\b\u0017"+
		"\n\u0017\f\u0017\u00f4\t\u0017\u0003\u0017\u00f6\b\u0017\u0001\u0017\u0005"+
		"\u0017\u00f9\b\u0017\n\u0017\f\u0017\u00fc\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0104\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0110\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0115\b\u0019\n\u0019"+
		"\f\u0019\u0118\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u011e\b\u0019\n\u0019\f\u0019\u0121\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0127\b\u0019\n\u0019\f\u0019"+
		"\u012a\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u013b\b\u0019"+
		"\n\u0019\f\u0019\u013e\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0146\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u014c\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0154"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0161\b\u001f\n\u001f\f\u001f\u0164\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u016e\b \u0001 \u0001"+
		" \u0003 \u0172\b \u0001 \u0001 \u0003 \u0176\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0186\b\"\u0001#\u0001#\u0001#\u0000\u00012$\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDF\u0000\u000b\u0001\u000067\u0002\u0000\u0001"+
		"\u0005,,\u0001\u0000BD\u0001\u0000$%\u0001\u0000\t\n\u0001\u0000\u000b"+
		"\f\u0002\u0000\r\u000f,,\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013"+
		"\u0001\u0000\u0018\u0019\u0001\u0000\u001b#\u01a0\u0000I\u0001\u0000\u0000"+
		"\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006"+
		"j\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000"+
		"\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000"+
		"\u0010\u00a0\u0001\u0000\u0000\u0000\u0012\u00a2\u0001\u0000\u0000\u0000"+
		"\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000"+
		"\u0018\u00a9\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000"+
		"\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000"+
		" \u00be\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00cc"+
		"\u0001\u0000\u0000\u0000&\u00d9\u0001\u0000\u0000\u0000(\u00de\u0001\u0000"+
		"\u0000\u0000*\u00e1\u0001\u0000\u0000\u0000,\u00e5\u0001\u0000\u0000\u0000"+
		".\u00ea\u0001\u0000\u0000\u00000\u0103\u0001\u0000\u0000\u00002\u010f"+
		"\u0001\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u00006\u014b\u0001\u0000"+
		"\u0000\u00008\u014d\u0001\u0000\u0000\u0000:\u0153\u0001\u0000\u0000\u0000"+
		"<\u0155\u0001\u0000\u0000\u0000>\u015b\u0001\u0000\u0000\u0000@\u0175"+
		"\u0001\u0000\u0000\u0000B\u0177\u0001\u0000\u0000\u0000D\u0185\u0001\u0000"+
		"\u0000\u0000F\u0187\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000"+
		"IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000"+
		"\u0000KM\u0003\u0004\u0002\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OT\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0003\u0006\u0003\u0000"+
		"RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0000\u0000\u0001X\u0001\u0001\u0000\u0000\u0000"+
		"YZ\u00051\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005A\u0000\u0000\\\u0003"+
		"\u0001\u0000\u0000\u0000]a\u00052\u0000\u0000^`\u0005F\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000de\u0005A\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fk\u0003\b\u0004"+
		"\u0000gk\u0003\u0010\b\u0000hk\u0003\"\u0011\u0000ik\u0003,\u0016\u0000"+
		"jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005"+
		"4\u0000\u0000mn\u0005G\u0000\u0000nt\u0003\n\u0005\u0000op\u0005+\u0000"+
		"\u0000pr\u0003F#\u0000qs\u00050\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000to\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0003\u000e"+
		"\u0007\u0000w\t\u0001\u0000\u0000\u0000x\u0081\u0005\'\u0000\u0000y~\u0003"+
		"\f\u0006\u0000z{\u0005&\u0000\u0000{}\u0003\f\u0006\u0000|z\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"(\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u0005G\u0000"+
		"\u0000\u0086\u0087\u0005+\u0000\u0000\u0087\u0088\u0003F#\u0000\u0088"+
		"\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000\u0000\u008a\u008b"+
		"\u0003.\u0017\u0000\u008b\u008c\u0005*\u0000\u0000\u008c\u0090\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005,\u0000\u0000\u008e\u0090\u0003.\u0017\u0000"+
		"\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0093\u0003\u0012\t\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0005G\u0000\u0000\u0095\u0096"+
		"\u0005+\u0000\u0000\u0096\u0098\u0003F#\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a1\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0003\u0012\t\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u00034\u001a\u0000\u00a0\u0092\u0001\u0000\u0000\u0000\u00a0"+
		"\u009d\u0001\u0000\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0007\u0000\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6\u00032\u0019\u0000\u00a6\u0015"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0001\u0000\u0000\u00a8\u0017"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000\u00aa\u0019"+
		"\u0001\u0000\u0000\u0000\u00ab\u00b0\u0005\u0006\u0000\u0000\u00ac\u00af"+
		"\u0003\u001c\u000e\u0000\u00ad\u00af\u0003 \u0010\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u001b\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ba\u0005D\u0000\u0000\u00b6\u00ba\u0003\u0018"+
		"\f\u0000\u00b7\u00b8\u0005/\u0000\u0000\u00b8\u00ba\u0005D\u0000\u0000"+
		"\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005D\u0000\u0000\u00bc\u00bd\u0005\u0007\u0000\u0000\u00bd"+
		"\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005/\u0000\u0000\u00bf\u00c0"+
		"\u0005)\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c2\u0005"+
		"*\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c4\u00053\u0000"+
		"\u0000\u00c4\u00c5\u0005G\u0000\u0000\u00c5\u00c8\u0003$\u0012\u0000\u00c6"+
		"\u00c7\u0005+\u0000\u0000\u00c7\u00c9\u0003(\u0014\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb#\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d5\u0005\'\u0000\u0000\u00cd\u00d2\u0003&\u0013\u0000"+
		"\u00ce\u00cf\u0005&\u0000\u0000\u00cf\u00d1\u0003&\u0013\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005(\u0000\u0000\u00d8%\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0007\u0000\u0000\u0000\u00da\u00db\u0005G\u0000"+
		"\u0000\u00db\u00dc\u0005+\u0000\u0000\u00dc\u00dd\u0003F#\u0000\u00dd"+
		"\'\u0001\u0000\u0000\u0000\u00de\u00df\u0005G\u0000\u0000\u00df\u00e0"+
		"\u0005\b\u0000\u0000\u00e0)\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		")\u0000\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00e4\u0005*\u0000"+
		"\u0000\u00e4+\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000\u0000"+
		"\u00e6-\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005A\u0000\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f5"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f2"+
		"\u00030\u0018\u0000\u00ee\u00ef\u0005A\u0000\u0000\u00ef\u00f1\u00030"+
		"\u0018\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00fa\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005A\u0000"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb/\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u0104\u0003\b\u0004\u0000\u00fe\u0104\u0003\u0010\b\u0000\u00ff"+
		"\u0104\u00032\u0019\u0000\u0100\u0104\u00034\u001a\u0000\u0101\u0104\u0003"+
		":\u001d\u0000\u0102\u0104\u0003D\"\u0000\u0103\u00fd\u0001\u0000\u0000"+
		"\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u01041\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0006\u0019\uffff\uffff\u0000\u0106\u0110\u0003\u0018\f\u0000"+
		"\u0107\u0110\u0005G\u0000\u0000\u0108\u0110\u0003>\u001f\u0000\u0109\u0110"+
		"\u0003@ \u0000\u010a\u0110\u0003\u001e\u000f\u0000\u010b\u010c\u0005\'"+
		"\u0000\u0000\u010c\u010d\u00032\u0019\u0000\u010d\u010e\u0005(\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0105\u0001\u0000\u0000\u0000"+
		"\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u0108\u0001\u0000\u0000\u0000"+
		"\u010f\u0109\u0001\u0000\u0000\u0000\u010f\u010a\u0001\u0000\u0000\u0000"+
		"\u010f\u010b\u0001\u0000\u0000\u0000\u0110\u013c\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\n\u000e\u0000\u0000\u0112\u0116\u0007\u0004\u0000\u0000\u0113"+
		"\u0115\u0005+\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u013b\u00032\u0019\u000f\u011a\u011b\n"+
		"\r\u0000\u0000\u011b\u011f\u0007\u0005\u0000\u0000\u011c\u011e\u0005+"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u013b\u00032\u0019\u000e\u0123\u0124\n\f\u0000\u0000"+
		"\u0124\u0128\u0007\u0006\u0000\u0000\u0125\u0127\u0005+\u0000\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u013b\u00032\u0019\r\u012c\u012d\n\u000b\u0000\u0000\u012d\u012e\u0007"+
		"\u0007\u0000\u0000\u012e\u013b\u00032\u0019\f\u012f\u0130\n\t\u0000\u0000"+
		"\u0130\u0131\u0005>\u0000\u0000\u0131\u013b\u00032\u0019\n\u0132\u0133"+
		"\n\b\u0000\u0000\u0133\u0134\u0005\u0014\u0000\u0000\u0134\u013b\u0003"+
		"2\u0019\t\u0135\u0136\n\n\u0000\u0000\u0136\u013b\u0007\b\u0000\u0000"+
		"\u0137\u0138\n\u0007\u0000\u0000\u0138\u0139\u0005@\u0000\u0000\u0139"+
		"\u013b\u0003F#\u0000\u013a\u0111\u0001\u0000\u0000\u0000\u013a\u011a\u0001"+
		"\u0000\u0000\u0000\u013a\u0123\u0001\u0000\u0000\u0000\u013a\u012c\u0001"+
		"\u0000\u0000\u0000\u013a\u012f\u0001\u0000\u0000\u0000\u013a\u0132\u0001"+
		"\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u0137\u0001"+
		"\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d3\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u00059\u0000"+
		"\u0000\u0140\u0141\u0005\'\u0000\u0000\u0141\u0142\u00032\u0019\u0000"+
		"\u0142\u0143\u0005(\u0000\u0000\u0143\u0145\u00038\u001c\u0000\u0144\u0146"+
		"\u00036\u001b\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u01465\u0001\u0000\u0000\u0000\u0147\u0148\u0005:\u0000"+
		"\u0000\u0148\u014c\u00034\u001a\u0000\u0149\u014a\u0005:\u0000\u0000\u014a"+
		"\u014c\u00038\u001c\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014c7\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		")\u0000\u0000\u014e\u014f\u0003.\u0017\u0000\u014f\u0150\u0005*\u0000"+
		"\u0000\u01509\u0001\u0000\u0000\u0000\u0151\u0154\u0003<\u001e\u0000\u0152"+
		"\u0154\u0003B!\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001"+
		"\u0000\u0000\u0000\u0154;\u0001\u0000\u0000\u0000\u0155\u0156\u0005;\u0000"+
		"\u0000\u0156\u0157\u0005\'\u0000\u0000\u0157\u0158\u00032\u0019\u0000"+
		"\u0158\u0159\u0005(\u0000\u0000\u0159\u015a\u0003.\u0017\u0000\u015a="+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0015\u0000\u0000\u015c\u015d"+
		"\u0005\u0016\u0000\u0000\u015d\u0162\u0003\u001a\r\u0000\u015e\u015f\u0005"+
		"&\u0000\u0000\u015f\u0161\u0003\u001a\r\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0017"+
		"\u0000\u0000\u0166?\u0001\u0000\u0000\u0000\u0167\u0168\u0003\u0018\f"+
		"\u0000\u0168\u0169\u0005\u0014\u0000\u0000\u0169\u016a\u0003\u0018\f\u0000"+
		"\u016a\u0176\u0001\u0000\u0000\u0000\u016b\u016d\u0003\u0018\f\u0000\u016c"+
		"\u016e\u0007\t\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171"+
		"\u0003\u0018\f\u0000\u0170\u0172\u0005\u001a\u0000\u0000\u0171\u0170\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0003\u0018\f\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u0167\u0001\u0000\u0000\u0000\u0175\u016b\u0001\u0000"+
		"\u0000\u0000\u0176A\u0001\u0000\u0000\u0000\u0177\u0178\u0005<\u0000\u0000"+
		"\u0178\u0179\u0005\'\u0000\u0000\u0179\u017a\u00032\u0019\u0000\u017a"+
		"\u017b\u0005(\u0000\u0000\u017b\u017c\u0003.\u0017\u0000\u017cC\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0005=\u0000\u0000\u017e\u0186\u0005G\u0000"+
		"\u0000\u017f\u0180\u0005=\u0000\u0000\u0180\u0186\u00032\u0019\u0000\u0181"+
		"\u0182\u0005=\u0000\u0000\u0182\u0186\u0003\u0018\f\u0000\u0183\u0184"+
		"\u0005=\u0000\u0000\u0184\u0186\u00058\u0000\u0000\u0185\u017d\u0001\u0000"+
		"\u0000\u0000\u0185\u017f\u0001\u0000\u0000\u0000\u0185\u0181\u0001\u0000"+
		"\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186E\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0007\n\u0000\u0000\u0188G\u0001\u0000\u0000\u0000"+
		"(INTajrt~\u0081\u008f\u0092\u0097\u009a\u009d\u00a0\u00ae\u00b0\u00b9"+
		"\u00c8\u00d2\u00d5\u00ea\u00f2\u00f5\u00fa\u0103\u010f\u0116\u011f\u0128"+
		"\u013a\u013c\u0145\u014b\u0153\u0162\u016d\u0171\u0175\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}