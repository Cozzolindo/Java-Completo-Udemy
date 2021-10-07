import java.io.File;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String sPath = scan.nextLine();

        File fPath = new File(sPath);

        File[] folders = fPath.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = fPath.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(sPath + "\\newFile").mkdir();
        System.out.print(success);

        scan.close();
    }
}