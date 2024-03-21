@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      Double res = (Double)visit(ctx.expr());
         if(res != null)
            System.out.println("RESULT: " + res);
         return res;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double res = null;
      Double num1 = (Double)visit(ctx.expr(0));
      Double num2 = (Double)visit(ctx.expr(1));
      if(num1 != 0 && num2 != 0){
         switch (ctx.op.getText()) {
            case "+":
               res= num1 + num2;
               break;
            case "-":
               res= num1 - num2;
               break;

         }
      }
      return res;
   }

   @Override public Double visitExprMinus(CalculatorParser.ExprMinusContext ctx) {
      Double number = (Double)visit(ctx.expr());
      return number*(-1);
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   } 

   @Override public Double visitExprPlus(CalculatorParser.ExprPlusContext ctx) {
      Double number = (Double)visit(ctx.expr());
      return number;
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Double.parseDouble(ctx.Integer().getText());
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double res = null;
      Double num1 = (Double)visit(ctx.expr(0));
      Double num2 = (Double)visit(ctx.expr(1));
      if(num1 != 0 && num2 != 0){
         switch (ctx.op.getText()) {
            case "*":
               res= num1 * num2;
               break;
            case "/":
               res= num1 / num2;
               break;
            case "%":
               res= num1 % num2;
               break;
         }
      }
      return res;
   }
}
