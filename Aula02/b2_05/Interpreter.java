import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class Interpreter extends ReadgrammarBaseListener {
   static Map<String, Integer> translator;

   public Interpreter(){
      translator = new HashMap<>();
   }

   @Override public void exitStat(ReadgrammarParser.StatContext ctx) {
      translator.put(ctx.Letras().getText(), Integer.parseInt(ctx.Number().getText()));
      //System.out.println(ctx.Letras().getText() + "->" +  Integer.parseInt(ctx.Number().getText()));
   }

   public static Map<String, Integer> getTranslator(){
      return translator;
   }

}
