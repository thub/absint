package thubhub.absint.account.immutable;

public class Account {
    protected double balance;

    public Account(double amount) {
        balance = amount;
    }

    public Account() {
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }
   
}