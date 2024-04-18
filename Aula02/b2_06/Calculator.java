import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Calculator extends CalculatorBaseVisitor<Integer> {
   private HashMap<String, Integer> variables;

   public Calculator(){
      variables = new HashMap<String, Integer>();
   }

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStatExpr(CalculatorParser.StatExprContext ctx) {
      if (ctx.expr() == null) return null;
      Integer res = visit(ctx.expr());
      if (res == null){
         System.out.println("Variable does not exist");
      }
      else {
         System.out.println(">> " + res);
      }

      return null;
      //return res;
   }

   @Override public Integer visitStatAssignment(CalculatorParser.StatAssignmentContext ctx) {
      if (ctx.assignment() == null) return null;
      Integer res = visit(ctx.assignment());
      if (res == null){
         System.out.println("Variable does not exist");
      }
      else {
         System.out.println(">> " + res);
      }

      return null;
      //return res;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      Integer res = null;
      String ID = ctx.ID().getText();
      Integer value = visit(ctx.expr());
      variables.put(ID, value);
      return value;
      //return res;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;
      Integer n1 = visit(ctx.expr(0));
      Integer n2 = visit(ctx.expr(1));
      if (n1 == null || n2 == null) return null;
      String op = ctx.op.getText();
      if (op.equals("+")) return n1 + n2;
      return n1 - n2;
      //return res;
   }

   @Override public Integer visitUnitaryPlus(CalculatorParser.UnitaryPlusContext ctx) {
      Integer res = visit(ctx.expr());
      return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer res = visit(ctx.expr());
      return res;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = null;
      return Integer.parseInt(ctx.Integer().getText());
      //return res;
   }

   @Override public Integer visitExprId(CalculatorParser.ExprIdContext ctx) {
      Integer res = variables.get(ctx.ID().getText());
      return res;
      //return res;
   }

   @Override public Integer visitUnitaryMinus(CalculatorParser.UnitaryMinusContext ctx) {
      Integer res = -visit(ctx.expr());
      return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer res = null;
      Integer n1 = visit(ctx.expr(0));
      Integer n2 = visit(ctx.expr(1));
      if (n1==null || n2==null) return null;
      String op = ctx.op.getText();
      if (op.equals("*")) return n1 * n2;
      else if (op.equals("/")) return n1 / n2;
      else return n1 % n2;
      //return res;
   }
}