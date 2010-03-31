package thubhub.absint.account.mutable;

public abstract class Withdraw {

    public abstract double getBalance();
    public abstract double getAmount();
    public abstract void handleResult(double result);


    public Withdraw() {
           if (getBalance() >= getAmount()) {
               handleResult(getBalance() - getAmount());
           } else
               handleResult(0.0);
       }


}
