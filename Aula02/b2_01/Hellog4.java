@SuppressWarnings("CheckReturnValue")
public class Hellog4 extends HelloBaseVisitor<Execute> {

   @Override public Execute visitEnd(HelloParser.EndContext ctx) {
      Execute res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Execute visitR(HelloParser.RContext ctx) {
      Execute res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Execute visitGreetings(HelloParser.GreetingsContext ctx) {
      Execute res = null;
      return visitChildren(ctx);
      //return res;
   }
}
