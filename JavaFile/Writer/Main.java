import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good Morning Morioh cho", "Voz do Brasil", "Globo News"};
        String path = "E:\\Udemy\\Java Completo\\Java-Completo-Udemy\\JavaFile\\Writer\\Txt\\new.txt";

        //try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ cria um novo arquivo
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // Adiciona em um arquivo já existente
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}