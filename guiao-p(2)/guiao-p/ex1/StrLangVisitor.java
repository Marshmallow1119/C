// Generated from StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termSimple}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSimple(StrLangParser.TermSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermVar}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermVar(StrLangParser.TermVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermStatement}
	 * labeled alternative in {@link StrLangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermStatement(StrLangParser.TermStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PearspsText}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPearspsText(StrLangParser.PearspsTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTerm(StrLangParser.TextTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermTermExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermTermExpr(StrLangParser.TermTermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(StrLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermADD}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermADD(StrLangParser.TermADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpr(StrLangParser.ParenthesesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermSUB}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSUB(StrLangParser.TermSUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimterm}
	 * labeled alternative in {@link StrLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimterm(StrLangParser.TrimtermContext ctx);
}