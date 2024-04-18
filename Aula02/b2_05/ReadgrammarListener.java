// Generated from Readgrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReadgrammarParser}.
 */
public interface ReadgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReadgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReadgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReadgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadgrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ReadgrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadgrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ReadgrammarParser.StatContext ctx);
}