import java.util.Stack;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Double NUM;
        Double NUM1;
        Double NUM2;
        char operador;
        Double resultado;
        int SIZE=2;
        Stack<Double> pilha= new Stack<Double>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            if(sc.hasNextDouble()){
                NUM=sc.nextDouble();
                pilha.push(NUM);
                print_Stack(pilha);
            }else if(sc.hasNext()){
                operador=sc.next().charAt(0);
                if(pilha.size()>=SIZE){
                    NUM1=pilha.pop();
                    NUM2=pilha.pop();
                    resultado=calculate(operador,NUM1,NUM2);
                    pilha.push(resultado);
                    print_Stack(pilha);            
                }
            }
        }
        sc.close();
    }

    private static Double calculate(char operador,Double numero1, Double numero2){
        Double resultado=0.0;
        switch (operador) {
            case '+':
                resultado=numero1+numero2;
                break;
            case '-':
                resultado=numero1-numero2;
                break;
            case '*':
                resultado=numero1*numero2;
                break;
            case '/':
                resultado=numero1/numero2;
                break; 
            default:
                System.err.println("Invalid number");   
                break;
        } 
        return resultado;
    }

    public static void print_Stack(Stack<Double> pilha){
        System.out.print("Stack: [");
        for (int i = 0; i < pilha.size(); i++) {
            System.out.print(pilha.get(i));
            if (i != pilha.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
 