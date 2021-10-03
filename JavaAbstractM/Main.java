import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Classes.Circle;
import Classes.Rectangle;
import Classes.Shape;
import Enums.Color;

public class Main{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of shapes:");
        int n = scan.nextInt();
        List<Shape> list = new ArrayList<>();

        for (int i = 1; i<= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle?");
            scan.nextLine();
            String type = scan.nextLine();
            System.out.println("Color (Black, Blue, Violet, Red, Green, Purple):");
            Color color = Color.valueOf(scan.next());
            if(type.charAt(0) == 'R' || type.charAt(0) == 'r'){
                System.out.println("Width: ");
                double width = scan.nextDouble();
                System.out.println("height: ");
                double height = scan.nextDouble();
                list.add(new Rectangle(color, width, height));
            }else{
                System.out.println("Radius: ");
                double radius = scan.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shapes:");
        for(Shape shapes : list){
            System.out.println(String.format("%.2f",shapes.area()));
        }
        
    }
}