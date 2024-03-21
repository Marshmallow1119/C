import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReadgrammarMain {
   public static void main(String[] args) {
      try {

         Scanner sc = new Scanner(System.in);
         System.out.println("File:");
         String filetext = sc.nextLine();
         File file = new File(filetext);
         InputStream targetStream = new FileInputStream(file);

         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(targetStream);
         // create a lexer that feeds off of input CharStream:
         ReadgrammarLexer lexer = new ReadgrammarLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         ReadgrammarParser parser = new ReadgrammarParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            Interpreter listener0 = new Interpreter();
            walker.walk(listener0, tree);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }

      Scanner sc2 = new Scanner(System.in);
      System.out.println("Phrase to translate:");
      String phrase= sc2.nextLine();
      sc2.close();
      Map<String, Integer> map= Interpreter.getTranslator();
      
      phrase = phrase.replace("-"," ");
      StringBuilder sb = new StringBuilder();
      for(String s : phrase.split("\\s+")){
         for(String translation : map.keySet()){
            if(s.equals(translation)){
               sb.append(map.get(translation) + " ");
               break;
            }
         }
      }
      System.out.println(sb.toString());
   }
}
