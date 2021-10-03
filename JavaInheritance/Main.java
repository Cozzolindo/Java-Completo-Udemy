import Classes.Account;
import Classes.BusinessAccount;
import Classes.Savings;

public class Main{
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 600.0);

        //UPCASTING:

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 50.0);
        Account acc3 = new Savings(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING:
        BusinessAccount acc4 = (BusinessAccount)acc2; //Forçando a variavel acc2 ser uma BusinessAccount
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3; Gera um erro

        if(acc3 instanceof Savings){
            Savings acc5 = (Savings)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }
    }
}