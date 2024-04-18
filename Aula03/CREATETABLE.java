import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CREATETABLE{
    public static void main(String[] args) {
        String csvFile = "result.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Escrevendo os cabeçalhos
            bufferedWriter.write("Column1,Column2,Column3");
            bufferedWriter.newLine();

            // Escrevendo os dados
            bufferedWriter.write("A,B,C");
            bufferedWriter.newLine();
            bufferedWriter.write("1,2,3");
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
