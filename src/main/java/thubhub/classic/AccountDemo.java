package thubhub.classic;

class AccountDemo
{
    public static void main(String args[])
    {
        Account myAccount = new Account();

        myAccount.deposit(250.00);

        System.out.println ("Current balance " +
                myAccount.getBalance());

        myAccount.withdraw(80.00);

        System.out.println ("Remaining balance " +
                myAccount.getBalance());
    }
}

