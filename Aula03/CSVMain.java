import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CSVMain {
   public static void main(String[] args) {
      try {
         String csvFilePath = "/home/tomas/C/Aula03/result.csv";
         // Corrigindo a linha para usar fromFileName em vez de fromStream
         CharStream input = CharStreams.fromFileName(csvFilePath);
         // create a lexer that feeds off of input CharStream:
         CSVLexer lexer = new CSVLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         CSVParser parser = new CSVParser(tokens);
         // begin parsing at file rule:
         ParseTree tree = parser.file();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // Implementação do visitor
            Visitor.startTable();
            Visitor visitor0 = new Visitor();
            visitor0.visit(tree);
            Visitor.endTable();
            System.out.println(Visitor.getHtml()); // Corrigindo para chamar getHtml() no objeto visitor0
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
   }
}
