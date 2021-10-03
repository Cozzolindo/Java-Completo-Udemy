import Classes.Account;
import Classes.BusinessAccount;
import Classes.Savings;

public class Main{
    public static void main(String[] args) {
        //Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 600.0);

        //UPCASTING:

        //Account acc1 = bacc;
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

        //OVERRIDE:
        System.out.println();
        //acc.deposit((double) 500);
        //System.out.println("Valor atual da conta de id: " + acc.getNumber() + " e " + acc.getBalance());
        //acc.withdraw((double)250);
        //System.out.println("Valor da conta de id: " + acc.getNumber() + " apos o saque: " + acc.getBalance());
        acc3.deposit(500.0);
        System.out.println("Valor atual da conta de id: " + acc3.getNumber() + " e " + acc3.getBalance());
        acc3.withdraw((double)250);
        System.out.println("Valor da conta de id: " + acc3.getNumber() + " apos o saque: " + acc3.getBalance());
        acc2.deposit(500.0);
        System.out.println("Valor atual da conta de id: " + acc2.getNumber() + " e " + acc2.getBalance());
        acc2.withdraw((double)250);
        System.out.println("Valor da conta de id: " + acc2.getNumber() + " apos o saque: " + acc2.getBalance());

        //POLYMORPHISM:

        Account x = new BusinessAccount(1150, "Carlos", 600.0, 300.0);
        Account y = new Savings(1160, "Cristina", 300.0, 0.05);
        System.out.println();
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
        x.withdraw(300.0);
        y.withdraw(150.0);
        System.out.println();
        System.out.println("Contas apos o saque:");
        System.out.println(x.getHolder() + " " + x.getBalance());
        System.out.println(y.getHolder() + " " + y.getBalance());

    }
}