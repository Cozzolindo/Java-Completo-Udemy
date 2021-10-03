import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        File file = new File("E:\\Udemy\\Java Completo\\Java-Completo-Udemy\\JavaException\\Finally\\File\\human.txt");
        Scanner scan = null;
        try{
            System.out.println("Genoma humano:");
            System.out.println();
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("ERROR -- opening file" + e.getMessage());
            
        } finally{
            if(scan != null){
                scan.close();
                System.out.println("Finally executed");
            }
        }

    }
}