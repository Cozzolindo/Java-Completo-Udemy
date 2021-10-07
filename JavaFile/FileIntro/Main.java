import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        File file = new File("E:\\Udemy\\Java Completo\\Java-Completo-Udemy\\JavaFile\\FileIntro\\Txt\\File.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            if(!(scan == null)){
                scan.close();
            }
        }
    }
}