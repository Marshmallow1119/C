

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {

   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitDisplayExpr(FracLangParser.DisplayExprContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitIDExpr(FracLangParser.IDExprContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitSimpleExpr(FracLangParser.SimpleExprContext ctx) {
      String expr1 = visit(ctx.expr());
      

   }

   @Override public Fraction visitSimpleID(FracLangParser.SimpleIDContext ctx) {
      String id= ctx.ID().getText();

      //return res;
   }

   @Override public Fraction visitFractionExpr(FracLangParser.FractionExprContext ctx) {
      Fraction res = null;
      int numerador= ctx.
      //return res;
   }

   @Override public Fraction visitAddSubIDNUMBER(FracLangParser.AddSubIDNUMBERContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitSimpleNumber(FracLangParser.SimpleNumberContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitAddSubMultSubExpr(FracLangParser.AddSubMultSubExprContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitIdOperationExpr(FracLangParser.IdOperationExprContext ctx) {
      String op= ctx.op.getText();
      Fraction expr1= visit(ctx.expr(0));
      Fraction expr2= visit(ctx.expr(1));





   }

   @Override public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      String numerador= ctx.NUMBER().getText();
      String denominador= ctx.NUMBER().getText();
      int num1= Integer.parseInt(numerador);
      int num2= Integer.parseInt(denominador);

      Fraction fr = new Fraction(num1, num2);
      return fr;
   }
}
