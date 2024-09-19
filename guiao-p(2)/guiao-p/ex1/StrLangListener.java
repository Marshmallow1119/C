// Generated from StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termSimple}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterTermSimple(StrLangParser.TermSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termSimple}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitTermSimple(StrLangParser.TermSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermVar}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterTermVar(StrLangParser.TermVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermVar}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitTermVar(StrLangParser.TermVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermStatement}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterTermStatement(StrLangParser.TermStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermStatement}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitTermStatement(StrLangParser.TermStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PearspsText}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPearspsText(StrLangParser.PearspsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PearspsText}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPearspsText(StrLangParser.PearspsTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTextTerm(StrLangParser.TextTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTextTerm(StrLangParser.TextTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermTermExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermTermExpr(StrLangParser.TermTermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermTermExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermTermExpr(StrLangParser.TermTermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(StrLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(StrLangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermADD}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermADD(StrLangParser.TermADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermADD}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermADD(StrLangParser.TermADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(StrLangParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(StrLangParser.ParenthesesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermSUB}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermSUB(StrLangParser.TermSUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermSUB}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermSUB(StrLangParser.TermSUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimterm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTrimterm(StrLangParser.TrimtermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimterm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTrimterm(StrLangParser.TrimtermContext ctx);
}