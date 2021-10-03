import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Classes.Employee;
import Classes.Outsourced;

public class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.println("Outsourced? (y/n)");
            char ch = scan.next().charAt(0);
            System.out.println("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.println("Hours: ");
            int hours = scan.nextInt();
            System.out.println("Value per hour: ");
            double valueHour = scan.nextDouble();
            if(ch == 'n' || ch == 'N'){
                Employee emp = new Employee(name, hours, valueHour);
                list.add(emp);
            }else{
                System.out.println("Additional charge:");
                double addCharge = scan.nextDouble();
                Employee emp = new Outsourced(name, hours, valueHour, addCharge);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Employees:");
        for(Employee emp : list){
            System.out.println(emp.toString());
        }

        System.out.println();
        System.out.println("Payment:");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}