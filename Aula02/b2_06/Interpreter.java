@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprExpr(CalculatorParser.ExprExprContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprAssigment(CalculatorParser.ExprAssigmentContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprMinus(CalculatorParser.ExprMinusContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprPlus(CalculatorParser.ExprPlusContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprID(CalculatorParser.ExprIDContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }
}
