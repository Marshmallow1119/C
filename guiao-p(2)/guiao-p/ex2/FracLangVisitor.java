// Generated from FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FracLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FracLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FracLangParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(FracLangParser.StatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDisplayTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDisplayTerm(FracLangParser.StatementDisplayTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementTerm}
	 * labeled alternative in {@link FracLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTerm(FracLangParser.StatementTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermReduce}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermReduce(FracLangParser.TermReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermTextMulAd}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermTextMulAd(FracLangParser.TermTextMulAdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermText}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermText(FracLangParser.TermTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermRead}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermRead(FracLangParser.TermReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermNumber}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermNumber(FracLangParser.TermNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermOp}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermOp(FracLangParser.TermOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermParenthesis}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermParenthesis(FracLangParser.TermParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermFRACTION}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFRACTION(FracLangParser.TermFRACTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermAtr}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtr(FracLangParser.TermAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermTextAddSub}
	 * labeled alternative in {@link FracLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermTextAddSub(FracLangParser.TermTextAddSubContext ctx);
}