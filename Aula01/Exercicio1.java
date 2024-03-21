
import java.util.Scanner;


public class Exercicio1 {
public static void main(String[] args) {
    double resultado;
    Scanner sc= new Scanner(System.in);
    System.out.println("Operation(number op number)?");
    double num1=sc.nextDouble();
    char op=sc.next().charAt(0);
    double num2=sc.nextDouble();
    switch (op) {
        case '+':
            resultado=num1+num2;
            System.out.printf("Result: %f",resultado);
            break;
    
        case '-':
            resultado=num1-num2;
            System.out.printf("Result: %f",resultado);
            break;
        
        case '*':
            resultado=num1*num2;
            System.out.printf("Result: %f",resultado);
            break;
        case '/':
            resultado=num1/num2;
            System.out.printf("Result: %f",resultado);
            break;  
        default:
            System.err.println("Nao escolheste um operador valido");
            break;       
    }
    sc.close();
    


}
}