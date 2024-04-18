import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class  Exercicio4{
    public static void main(String[] args) throws FileNotFoundException{
        Map<String,Integer> VALUE_STRING= new HashMap<>();
        File file= new File("/home/tomas/C/numbers.txt");
        String result="A list of numbers: ";
        Read_File(file,VALUE_STRING);
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        Scanner sc2= new Scanner(input);
        while(sc2.hasNext()){
            String frase=sc2.next();
            if (frase.contains("-")) {
                String[] partes = frase.split("-");
                for (String parte : partes) {
                    if (VALUE_STRING.containsKey(parte)) {
                        result += VALUE_STRING.get(parte) + " ";
                    } else {
                        result += parte + " ";
                    }
                }
            } else {
                if (VALUE_STRING.containsKey(frase)) {
                    result += VALUE_STRING.get(frase) + " ";
                }
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