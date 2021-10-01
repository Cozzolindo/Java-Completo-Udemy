import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.Department;
import Classes.HourContract;
import Classes.Worker;
import Classes.WorkerLevel;

public class Main{
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nome do departamento:");
        String departmentName = scan.nextLine();
        System.out.println("Nome do trabalhador:");
        String workerName = scan.nextLine();
        System.out.println("Nivel de experiencia:");
        String workerLevel = scan.nextLine();
        System.out.println("Teto salarial:");
        double baseSalary = scan.nextDouble();
        System.out.println("Nome do trabalhador:");
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("Quantos contratos esse trabalhador possui?");
        int n = scan.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Digite o contrato de numero #" + i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.println("Valor por hora: ");
            double valueHour = scan.nextDouble();
            System.out.println("Duracao (horas):");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valueHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println(("Digite mes e ano(MM/YYYY) para calcular os lucros:"));
        String Myear = scan.next();
        int month = Integer.parseInt(Myear.substring(0,2));
        int year = Integer.parseInt(Myear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Lucros de " + Myear + ": " + String.format("%.2f", worker.income(year, month)));

        scan.close();
    }
}