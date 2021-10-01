package Classes;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double inicialBalance){
        this.number = number;
        deposit(inicialBalance);
        this.holder = holder;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
        balance += 5;
    }

    public String toString(){
        return "Account "
                + number +
                ", Holder: " +
                holder +
                ", Balance: $" +
                String.format("%.2f",balance);
    }
}
