package thubhub.classic;

public class Account {
    protected double balance;

    public Account(double amount) {
        balance = amount;
    }

    public Account() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else
            return 0.0;
    }

    public double getBalance() {
        return balance;
    }
}
