package Classes;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    

    public Account() {
        super();
    }
    


    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public  double withdraw(Double amount){
        double juros = 0.1*balance;
        return balance -= (amount + juros);
    }
    
    public double deposit(Double amount){
        return balance += amount;
    }

    
}
