package Classes;

public class BusinessAccount extends Account {

    private Double loanLimit;
    
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public BusinessAccount() {
        super();
    }



    public Double getLoanLimit() {
        return this.loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount -10;
        }
    }



    
    
    
    


    



    
}
