import java.util.Scanner;

import Classes.Account;
import Exceptions.Exceptions;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Account id:");
        int id = scan.nextInt();
        System.out.println("Account holder:");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.println("Account balance:");
        Double balance = scan.nextDouble();
        System.out.println("Account withdraw limit:");
        Double limit = scan.nextDouble();

        Account acc = new Account(id, holder, balance, limit);
        System.out.println();
        System.out.println("ACCOUNT DATA:");
        System.out.println(acc.toString());
        System.out.println();

        try{
            System.out.println("How much you want to withdraw?");
            Double withdraw = scan.nextDouble();
            acc.withdraw(withdraw);
        } catch(Exceptions e ){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("NEW ACCOUNT BALANCE:");
        System.out.println(String.format("Balance: %.2f", acc.getBalance()));

        scan.close();
    }
}
