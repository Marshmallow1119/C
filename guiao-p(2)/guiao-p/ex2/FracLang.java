
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class FracLang extends FracLangBaseVisitor<Fraction> {

   HashMap<String, Fraction> arrayText = new HashMap();

   @Override public Fraction visitStats(FracLangParser.StatsContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStatementDisplayTerm(FracLangParser.StatementDisplayTermContext ctx) {
      Fraction Term1= visit(ctx.term());
      System.out.println(Term1.toString());
      return Term1;
   }

   @Override public Fraction visitStatementTerm(FracLangParser.StatementTermContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitTermTextMulAd(FracLangParser.TermTextMulAdContext ctx) {
      String operador= ctx.op.getText();
      Fraction Term1= visit(ctx.term(0));
      Fraction Term2= visit(ctx.term(1));
      Fraction result= new Fraction();
      switch (operador) {
         case "*" -> {
             result= Term1.multiFraction(Term2);
             return result;
           }
         case ":" -> {
             result= Term1.DivFraction(Term2);
             return result;
           }
          default -> {
           }
      }
      return result;
   }

   @Override public Fraction visitTermText(FracLangParser.TermTextContext ctx) {
      String Text = ctx.TEXT().getText();
      Fraction f= null;
      if(arrayText.keySet().contains(Text)){
         f= arrayText.get(Text);
         return f;
      }
      return f;
   }

   @Override public Fraction visitTermNumber(FracLangParser.TermNumberContext ctx) {
      String NUMBER = ctx.NUMBER().getText();
      int num= Integer.parseInt(NUMBER);
      Fraction res =  new Fraction(num,1);
      return res;
   }

   @Override public Fraction visitTermOp(FracLangParser.TermOpContext ctx) {
      String operador= ctx.op.getText();
      Fraction Term1= visit(ctx.term());
      Fraction frac= new  Fraction(-Term1.getNumerador(),Term1.getDenominador());
      return frac;
   }

   @Override public Fraction visitTermParenthesis(FracLangParser.TermParenthesisContext ctx) {
      Fraction term = visit(ctx.term());
      return term;
   }

   @Override public Fraction visitTermFRACTION(FracLangParser.TermFRACTIONContext ctx) {
      String frac = ctx.FRACTION().getText();
      String[] ar= frac.split("/");
      int num= Integer.parseInt(ar[0]);
      int den= Integer.parseInt(ar[1]);
      Fraction f = new Fraction(num,den);
      return f;
   }

   @Override public Fraction visitTermAtr(FracLangParser.TermAtrContext ctx) {
      String Text= ctx.TEXT().getText();
      Fraction Term1= visit(ctx.term());
      if(!arrayText.keySet().contains(Text)){
         arrayText.put(Text, Term1);
      }
      return Term1;


   }

   @Override public Fraction visitTermTextAddSub(FracLangParser.TermTextAddSubContext ctx) {
      String operador= ctx.op.getText();
      Fraction Term1= visit(ctx.term(0));
      Fraction Term2= visit(ctx.term(1));
      Fraction result= new Fraction();
      switch (operador) {
         case "+":
              result= Term1.SomaFraction(Term2);
              return result;
         case "-":
               result= Term1.SubFraction(Term2);
              return result;
          default:
              break;
      }
      return result;
   }

   @Override public Fraction visitTermRead (FracLangParser.TermReadContext ctx) {
      Scanner scanner = new Scanner(System.in);
      String id = ctx.STRING().getText();
      id = id.substring(1,id.length()-1);
      System.out.print(id + ": ");
      String fraction = scanner.nextLine();
      String[] parts = fraction.split("/");
      int numerador = Integer.parseInt(parts[0]);
      int denominador = Integer.parseInt(parts[1]);
      arrayText.put(id, new Fraction(numerador, denominador));
      return new Fraction(numerador, denominador);
      
   }

   @Override public Fraction visitTermReduce (FracLangParser.TermReduceContext ctx) {
      Fraction term = visit(ctx.term());
      return term.reduce();
   }

}
