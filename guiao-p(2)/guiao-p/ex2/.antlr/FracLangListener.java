// Generated from /home/tomas/C/guiao-p(2)/guiao-p/ex2/FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#stats}.
	 * @param ctx the parse tree
	 */
	void enterStats(FracLangParser.StatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#stats}.
	 * @param ctx the parse tree
	 */
	void exitStats(FracLangParser.StatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDisplayTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDisplayTerm(FracLangParser.StatementDisplayTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDisplayTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDisplayTerm(FracLangParser.StatementDisplayTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTerm(FracLangParser.StatementTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTerm(FracLangParser.StatementTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermReduce}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermReduce(FracLangParser.TermReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermReduce}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermReduce(FracLangParser.TermReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermTextMulAd}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermTextMulAd(FracLangParser.TermTextMulAdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermTextMulAd}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermTextMulAd(FracLangParser.TermTextMulAdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermText}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermText(FracLangParser.TermTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermText}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermText(FracLangParser.TermTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermRead}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermRead(FracLangParser.TermReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermRead}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermRead(FracLangParser.TermReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermNumber}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermNumber(FracLangParser.TermNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermNumber}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermNumber(FracLangParser.TermNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermOp}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermOp(FracLangParser.TermOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermOp}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermOp(FracLangParser.TermOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermParenthesis}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermParenthesis(FracLangParser.TermParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermParenthesis}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermParenthesis(FracLangParser.TermParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermFRACTION}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFRACTION(FracLangParser.TermFRACTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermFRACTION}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFRACTION(FracLangParser.TermFRACTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermAtr}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermAtr(FracLangParser.TermAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermAtr}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermAtr(FracLangParser.TermAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermTextAddSub}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermTextAddSub(FracLangParser.TermTextAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermTextAddSub}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermTextAddSub(FracLangParser.TermTextAddSubContext ctx);
}