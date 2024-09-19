@SuppressWarnings("CheckReturnValue")
public class StrLang extends StrLangBaseVisitor<String> {

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermSimple(StrLangParser.TermSimpleContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermVar(StrLangParser.TermVarContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermStatement(StrLangParser.TermStatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPearspsText(StrLangParser.PearspsTextContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTextTerm(StrLangParser.TextTermContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermTermExpr(StrLangParser.TermTermExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintStatement(StrLangParser.PrintStatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermADD(StrLangParser.TermADDContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitParenthesesExpr(StrLangParser.ParenthesesExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTermSUB(StrLangParser.TermSUBContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTrimterm(StrLangParser.TrimtermContext ctx) {
      String Term1= visit(ctx.term());
      Term1=Term1.replaceAll(" ", "");
      return Term1;
   }
}
