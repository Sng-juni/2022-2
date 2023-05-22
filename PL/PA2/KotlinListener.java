// Generated from Kotlin.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KotlinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KotlinParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(KotlinParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(KotlinParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(KotlinParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(KotlinParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KotlinParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KotlinParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameters(KotlinParser.FuncParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameters(KotlinParser.FuncParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameter(KotlinParser.FuncParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameter(KotlinParser.FuncParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(KotlinParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(KotlinParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(KotlinParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(KotlinParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(KotlinParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(KotlinParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assn}.
	 * @param ctx the parse tree
	 */
	void enterAssn(KotlinParser.AssnContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assn}.
	 * @param ctx the parse tree
	 */
	void exitAssn(KotlinParser.AssnContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assnOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssnOperator(KotlinParser.AssnOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assnOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssnOperator(KotlinParser.AssnOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(KotlinParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(KotlinParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(KotlinParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(KotlinParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#strContent}.
	 * @param ctx the parse tree
	 */
	void enterStrContent(KotlinParser.StrContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#strContent}.
	 * @param ctx the parse tree
	 */
	void exitStrContent(KotlinParser.StrContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#strlength}.
	 * @param ctx the parse tree
	 */
	void enterStrlength(KotlinParser.StrlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#strlength}.
	 * @param ctx the parse tree
	 */
	void exitStrlength(KotlinParser.StrlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#dollarStr}.
	 * @param ctx the parse tree
	 */
	void enterDollarStr(KotlinParser.DollarStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#dollarStr}.
	 * @param ctx the parse tree
	 */
	void exitDollarStr(KotlinParser.DollarStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(KotlinParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(KotlinParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(KotlinParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(KotlinParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(KotlinParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(KotlinParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#parentClass}.
	 * @param ctx the parse tree
	 */
	void enterParentClass(KotlinParser.ParentClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parentClass}.
	 * @param ctx the parse tree
	 */
	void exitParentClass(KotlinParser.ParentClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(KotlinParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(KotlinParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(KotlinParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(KotlinParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(KotlinParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(KotlinParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KotlinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KotlinParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KotlinParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(KotlinParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(KotlinParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(KotlinParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(KotlinParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(KotlinParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(KotlinParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(KotlinParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(KotlinParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(KotlinParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(KotlinParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(KotlinParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(KotlinParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(KotlinParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(KotlinParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(KotlinParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(KotlinParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(KotlinParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(KotlinParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KotlinParser.TypeContext ctx);
}