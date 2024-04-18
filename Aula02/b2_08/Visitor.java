@SuppressWarnings("CheckReturnValue")
public class Visitor extends CalculatorBaseVisitor<Object> {

   @Override public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      Object res= visit(ctx.expr());
      System.out.println(res);
      return null;
   }

   @Override public Object visitStatAssignment(CalculatorParser.StatAssignmentContext ctx) {
      Object res= visit(ctx.assignment());
      System.out.println(res);
      return null;
   }

   @Override public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      return ctx.ID().getText() + " = " + visit(ctx.expr());
   }

   @Override public Object visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
   }

   @Override public Object visitUnitaryPlus(CalculatorParser.UnitaryPlusContext ctx) {
      return visit(ctx.expr()) + "!-";
   }

   @Override public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return ctx.Integer().getText();
   }

   @Override public Object visitExprId(CalculatorParser.ExprIdContext ctx) {
      return ctx.ID().getText();
   }

   @Override public Object visitUnitaryMinus(CalculatorParser.UnitaryMinusContext ctx) {
      return visit(ctx.expr()) + "!+";
   }

   @Override public Object visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
   }
}
