import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Names:");
        String[] vector = scan.nextLine().split(" ");
        System.out.println("Position:");
        
        try{
            int position = scan.nextInt();
            System.out.println(vector[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds!");
        } catch(InputMismatchException e){
            System.out.println("Mismatched!");
        }

        System.out.println("The End of programmation");

    }
}