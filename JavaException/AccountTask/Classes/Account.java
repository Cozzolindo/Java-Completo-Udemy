package Classes;

import Exceptions.Exceptions;

public class Account {
    protected Double balance;
    protected Double limit;
    protected Integer id;
    protected String holder;


    public Account() {
    }


    public Account(Integer id, String holder, Double balance, Double limit) {
        this.balance = balance;
        this.limit = limit;
        this.id = id;
        this.holder = holder;
    }


    public Double getBalance() {
        return this.balance;
    }

    public Double getLimit() {
        return this.limit;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws Exceptions{
        if(amount > getBalance()){
            throw new Exceptions("Insufficient credit in your account.");
        } else if ( amount > getLimit()){
            throw new Exceptions("Your withdraw limit has been exceeded.");
        }else{
            balance -= amount;
        }
    }


    @Override
    public String toString() {
        return "{" +
            ", id='" + getId() + "'" +
            ", holder='" + getHolder() + "'" +
            " balance='" + getBalance() + "'" +
            ", limit='" + getLimit() + "'" +
            "}";
    }


    
}
