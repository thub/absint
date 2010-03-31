package thubhub.absint.account.mutable;

public abstract class Deposit {

    public abstract double getBalance();
    public abstract double getAmount();
    public abstract void handleResult(double result);

    public Deposit() {
        handleResult( getBalance() + getAmount());
    }


}
