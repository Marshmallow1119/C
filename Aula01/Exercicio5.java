import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class  Exercicio5{
    public static void main(String[] args) throws FileNotFoundException{
        Map<String,Integer> VALUE_STRING= new HashMap<>();
        Stack<Integer> pilha= new Stack<Integer>();
        File file= new File("/home/tomas/C/numbers.txt");
        int result= 0;
        Read_File(file,VALUE_STRING);
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        Scanner sc2= new Scanner(input);
        int NUM3;
        int NUM4;
        int HUNDRED= 100;

        while(sc2.hasNext()){
            String frase=sc2.next();
            switch (frase) {
                case "million":
                    NUM3=pilha.pop();
                    result += (NUM3 * VALUE_STRING.get(frase));
                    break;
                case "thousand":
                    NUM4=pilha.pop();
                    if(NUM4 == HUNDRED) {
                        NUM3=pilha.pop();
                        result += (NUM3 * (NUM4 * VALUE_STRING.get(frase)));
                    }else{
                        NUM3=pilha.pop();
                        result += (NUM3 * VALUE_STRING.get(frase));
                    }
                        
                    break;
                case "hundred":
                    pilha.push(VALUE_STRING.get(frase));
                    break;
                default:
                    if(frase.contains("-")){
                        if(!pilha.isEmpty()){NUM4=pilha.pop();NUM3=pilha.pop();result += (NUM3 * NUM4);}
                        String[] partes = frase.split("-");
                        for (String parte : partes) {
                            if (VALUE_STRING.containsKey(parte)) {
                                result += VALUE_STRING.get(parte);
                            }
                        }
                    }else if(VALUE_STRING.containsKey(frase)){
                        pilha.push(VALUE_STRING.get(frase));
                    }
                    break;   
            }    
            }
        System.out.println(result);
        sc1.close();
        sc2.close();
    }
    public static void Read_File(File filename,Map<String,Integer> VALUE_STRING) throws FileNotFoundException{
        Scanner sc= new Scanner(filename);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] parts = line.split(" - ");
            int NUM=Integer.parseInt(parts[0]);
            VALUE_STRING.put(parts[1],NUM);
        }
        sc.close();
    }
    
}