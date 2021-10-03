import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        method1();
        System.out.println("The End of programmation");

    }

    public static void method2(){

        System.out.println("***Method 2 STARTING***");
        Scanner scan = new Scanner(System.in);

        System.out.println("Names:");
        String[] vector = scan.nextLine().split(" ");
        System.out.println("Position:");
        
        try{
            int position = scan.nextInt();
            System.out.println(vector[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds!");
            e.printStackTrace();
        } catch(InputMismatchException e){
            System.out.println("Mismatched!");
            e.printStackTrace();
        }

        System.out.println("***Method 2 ENDING***");
    }

    public static void method1(){
        System.out.println("***Method 1 STARTING***");
        method2();
        System.out.println("***Method 1 ENDING***");
    }
}