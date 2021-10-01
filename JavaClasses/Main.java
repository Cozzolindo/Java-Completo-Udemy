import java.util.Scanner;
import Classes.Triangle;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite os valores do triangulo X:");
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        Triangle x, y;
        x = new Triangle(A, B, C);
        
        System.out.println("Digite os valores do triangulo Y:");
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        y = new Triangle(A, B, C);
        System.out.println(x.getArea());
        System.out.println(y.getArea());

        if(x.getArea()<y.getArea()){
            System.out.println("Area de Y eh maior!");
        }else{
            System.out.println("Area de X eh maior!");
        }
    }
}
