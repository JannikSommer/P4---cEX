// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/EulerCompiler/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EulerParser}.
 */
public interface EulerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EulerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EulerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EulerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EulerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EulerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(EulerParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(EulerParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EulerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EulerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(EulerParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(EulerParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void enterElsestmts(EulerParser.ElsestmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void exitElsestmts(EulerParser.ElsestmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void enterElseifstmts(EulerParser.ElseifstmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void exitElseifstmts(EulerParser.ElseifstmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(EulerParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(EulerParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void enterStringstmt(EulerParser.StringstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void exitStringstmt(EulerParser.StringstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void enterValindex(EulerParser.ValindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void exitValindex(EulerParser.ValindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(EulerParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(EulerParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(EulerParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(EulerParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(EulerParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(EulerParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpr(EulerParser.MultiexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpr(EulerParser.MultiexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimeexpr(EulerParser.PrimeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimeexpr(EulerParser.PrimeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void enterLogstmt(EulerParser.LogstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void exitLogstmt(EulerParser.LogstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(EulerParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(EulerParser.LogopContext ctx);
}