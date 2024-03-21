@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitEnd(HelloParser.EndContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitR(HelloParser.RContext ctx) {
      String res = null;
      System.out.println("bye: " + ctx.getText());
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.println("Greetings: " + ctx.getText());
      return visitChildren(ctx);
      //return res;
   }
}
