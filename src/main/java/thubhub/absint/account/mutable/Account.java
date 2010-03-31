package thubhub.absint.account.mutable;

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

    public void setBalance(double result) {
        balance = result;
    }
}
