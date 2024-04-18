import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Exercicio2 {
    public static void main(String[] args) {
        Map<String,Double> var = new HashMap<String,Double>();
        Scanner sc=new Scanner(System.in); 
        String variable;
        String variable2;
        double num1=0.0;
        double num2=0.0;
        char op; 
        double resultado;
        
        while (sc.hasNextLine()) {
            num1=0-0;
            num2=0.0;
            String input=sc.nextLine();  
            Scanner line=new Scanner(input);
            if(line.hasNextDouble()){         //se for numero 1 
                num1=line.nextDouble();  
                if(line.hasNext()){                 // obrigatoriamente deve ser operador 1 + 1 ou n 
                    op=line.next().charAt(0); 
                    if(line.hasNextDouble()){         
                        num2=line.nextDouble();
                        // se quisermos colocar mais operacoes é aqui
                        calculate(null,op, num1,num2,var); // tudo certo
                    }else if(line.hasNext()){
                        variable2=line.next();
                        if(var.containsKey(variable2)){
                            num2=var.get(variable2);
                            calculate(null, op,num1,num2,var);
                        }else{
                            calculate(variable2, op, num1, num2, var);
                        }
                    }
                }else{
                    resultado=num1; 
                    System.out.printf("Result: %f%n",resultado);
                }
            }else if(line.hasNext()){  
                variable= line.next();                   //se for uma variavel  n
                if(line.hasNextDouble()){                      
                    System.err.println("Invalid number");
                }else if(line.hasNext()){                // obrigatoriamente deve ser operador n+-/= ou letra
                    op=line.next().charAt(0); 
                    if(line.hasNextDouble()){ 
                        if(!(var.containsKey(variable))){
                            num2=line.nextDouble();
                            calculate(variable,op, num1, num2,var);                  //se a seguir ao operador for letra n+/= n
                        }else{
                            num1=var.get(variable);
                            num2=line.nextDouble();
                            calculate(null,op, num1, num2,var);
                        }
                    }else{  
                        variable2=line.next();
                        if(var.containsKey(variable) && var.containsKey(variable2)){
                            num1=var.get(variable);
                            num2=var.get(variable2);
                            calculate(null,op, num1, num2,var);
                        }else{                          
                            System.err.println("Invalid number");
                        }      
                    }
                }else{
                    if(var.containsKey(variable)){
                        resultado=var.get(variable);    
                        System.out.printf("Result: %f%n",resultado);
                    }else{
                        System.err.println("Invalid number");
                    }
                }
            }else{
                break;
            }
            line.close();
        }
        sc.close();
    }

    private static void calculate(String variavel, char op, Double numero1, Double numero2, Map<String, Double> var){
        Double resultado=0.0;
        switch (op) {
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
            case '=':
                if(variavel != null){
                    if (numero1 != null && numero1 != null ) {
                        if( numero1 != 0 && numero2 == 0){
                            var.put(variavel, numero1);
                        }else if(numero1 == 0 && numero2 != 0){
                            var.put(variavel, numero2);
                        }
                    } else {
                        System.err.println("Invalid number");
                    }
                    resultado = var.get(variavel);
                    break;
                }else{
                    System.err.println("Invalid number");   
                }
            default:
                System.err.println("Invalid number");   
        } 
        System.out.printf("Result: %f%n",resultado);
    }
    
}
