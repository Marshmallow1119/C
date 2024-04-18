@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PreffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PreffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(PreffixCalculatorParser.StatContext ctx) {
      Double res = (Double)visit(ctx.expr());
      if(res != null)
            System.out.println("RESULT: " + res);
      return res;
   }

   @Override public Double visitExprPreffix(PreffixCalculatorParser.ExprPreffixContext ctx) {
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

   @Override public Double visitExprNumber(PreffixCalculatorParser.ExprNumberContext ctx) {
      Double res = null;
      return Double.parseDouble(ctx.Number().getText());
   }
}

