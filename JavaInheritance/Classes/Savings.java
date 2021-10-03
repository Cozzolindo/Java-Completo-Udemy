package Classes;

public class Savings extends Account{
    
    private Double interestRate;


    public Savings() {
        super();
    }


    public Savings(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
        
    }


    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public double withdraw(Double amount){
        return balance -= amount;
    }
}
