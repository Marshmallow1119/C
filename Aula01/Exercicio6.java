import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class  Exercicio6{
    public static void main(String[] args) throws FileNotFoundException{
        Map<String,String> VALUE_STRING= new HashMap<>();
        String Translate=args[0];
        for(int i=1; i<args.length;i++){
            String text=args[i];
            File file2= new File(text);
            Scanner sc1= new Scanner(file2);
            text=sc1.nextLine();
            File file= new File(Translate);
            String Result_String="";String result="";
            Read_File(file,VALUE_STRING);
            boolean EQUAL= true;
            int SIZE=1;
            while(EQUAL){
                result=Result_String;
                String[] parts = result.split("\\s+");
                if(parts.length == SIZE){
                    Result_String=Append_String(VALUE_STRING,text,Result_String);
                }else{
                    Result_String=Append_String(VALUE_STRING,result,Result_String);
                    if(result.equals(Result_String)){
                        break;
                    }      
                }
            }
            System.out.println(Result_String);
            sc1.close();
        }
    }

    public static void Read_File(File filename,Map<String,String> VALUE_STRING) throws FileNotFoundException{
        Scanner sc= new Scanner(filename);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] parts = line.split("\\s+",2);
            VALUE_STRING.put(parts[0],parts[1]);
        }
        sc.close();
    }

    public static String Append_String(Map<String,String> VALUE_STRING,String Text,String Result_String){
        Result_String="";
        Scanner sc2= new Scanner(Text);
        while(sc2.hasNext()){
            String frase=sc2.next();
            if (VALUE_STRING.containsKey(frase)) {
                Result_String += VALUE_STRING.get(frase)+ " ";
            }else{
                Result_String +=frase+ " ";
            }
        }
        sc2.close();
        return Result_String;
    }   
}