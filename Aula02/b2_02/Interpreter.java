@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = 0.0;
      // Evaluate the expression
      if (ctx.expr() == null) return null;

      res = visit(ctx.expr());
      if (res == null) {
         System.out.println("Error: division by zero");
      } else {
         System.out.println(res);
      }
      return 0.0;
      //return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      Double res = null;
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double res = null;
      Double op1 = visit(ctx.expr(0));
      Double op2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch (op) {
         case "+":
            res = op1 + op2;
            break;
         case "-":
            res = op1 - op2;
            break;
         case "*":
            res = op1 * op2;
            break;
         case "/":
            res = op1 / op2;
            break;
      }
      return res;
   }
}
