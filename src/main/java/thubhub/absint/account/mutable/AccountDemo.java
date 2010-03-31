package thubhub.absint.account.mutable;

public class AccountDemo {

    public static void main(String args[]) {
        final Account myAccount = new Account();


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
               myAccount.setBalance(result); 
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
                myAccount.setBalance(result);

            }
        };

        System.out.println("Remaining balance " +
                myAccount.getBalance());
    }
}

