import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import Classes.Product;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        //double[] vector = new double[10];
        int n = scan.nextInt();
        Product[] vector = new Product[n];
        for(int i =0; i<n; i++){
            scan.nextLine();//Quebra de linha
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vector[i] = new Product(name, price);
        }
        int k = 0;
        double average = 0;
        while(k<vector.length){
            average += vector[k].getPrice();
            k++;
        }
        System.out.printf("%.2f", average/n);
        scan.close();
    }
}