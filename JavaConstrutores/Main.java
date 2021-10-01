import java.util.Locale;
import java.util.Scanner;

import Classes.Account;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.println("Enter account number:\n");
        int number = scan.nextInt();
        System.out.println("Enter account holder:\n");
        scan.nextLine(); //Consumir quebra de linha
        String holder = scan.nextLine();
        System.out.println("Is there an initial deposit?\n");
        char response = scan.next().charAt(0);
        if(response == 'y' || response == 'Y'){
            System.out.println("Enter initial deposit value:\n");
            double balance = scan.nextDouble();
            account = new Account(number, holder, balance);
        }else{
            account = new Account(number, holder);
        }
        System.out.println("\n Account data:");
        System.out.println(account);
        System.out.println("\nEnter a deposit value:");
        double deposit = scan.nextDouble();
        account.deposit(deposit);
        System.out.println("\n Updated Account:");
        System.out.println(account);
        System.out.println("\nEnter a withdraw value:");
        double with = scan.nextDouble();
        account.withdraw(with);
        System.out.println("\n Updated Account:");
        System.out.println(account);

        scan.close();
    }
}
