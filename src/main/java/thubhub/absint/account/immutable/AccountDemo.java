package thubhub.absint.account.immutable;

import thubhub.absint.account.mutable.Account;
import thubhub.absint.account.mutable.Deposit;
import thubhub.absint.account.mutable.Withdraw;

public class AccountDemo {
    static Account myAccount;

    public static void main(String args[]) {
        myAccount = new Account();



        new Deposit(){
            @Override
            public double getBalance() {
                return myAccount.getBalance();
            }

            @Override
            public double getAmount() {
                return 250.00;
            }

            @Override
            public void handleResult(double result) {
                myAccount = new Account(result);
            }
        };

        System.out.println("Current balance " +
                myAccount.getBalance());


        new Withdraw(){
            @Override
            public double getBalance() {
                return myAccount.getBalance();
            }

            @Override
            public double getAmount() {
                return 80.00;
            }

            @Override
            public void handleResult(double result) {
                myAccount = new Account(result);

            }
        };

        System.out.println("Remaining balance " +
                myAccount.getBalance());
    }
}