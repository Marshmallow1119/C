// Generated from Gramtica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramticaParser}.
 */
public interface GramticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link GramticaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(GramticaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link GramticaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(GramticaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermStatement}
	 * labeled alternative in {@link GramticaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterTermStatement(GramticaParser.TermStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermStatement}
	 * labeled alternative in {@link GramticaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitTermStatement(GramticaParser.TermStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AspasTerm}
	 * labeled alternative in {@link GramticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAspasTerm(GramticaParser.AspasTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AspasTerm}
	 * labeled alternative in {@link GramticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAspasTerm(GramticaParser.AspasTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link GramticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTextTerm(GramticaParser.TextTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link GramticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTextTerm(GramticaParser.TextTermContext ctx);
}