import java.util.Scanner;
import Classes.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = scan.nextDouble();

        double c = Calculator.getCircumference(radius);
        double v = Calculator.getVolume(radius);

        System.out.printf("Circumference: %2f\n", c);
        System.out.printf("Volume: %2f\n", v);
        System.out.printf("Circumference: %f", Calculator.PI);
    }

    
}
