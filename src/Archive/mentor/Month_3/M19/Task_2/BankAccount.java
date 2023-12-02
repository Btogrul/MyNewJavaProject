package Archive.mentor.Month_3.M19.Task_2;

import Archive.mentor.Month_3.M18.InsufficientBalanceException;

public class BankAccount {
    String accountOwner;
    double balance;


    public BankAccount(String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }






    public synchronized void withdraw(double amount) throws InsufficientBalanceException {

        if (amount> this.balance){
            throw new InsufficientBalanceException("Balansinda kifayet qeder mebleq yoxdur");

        }else if(amount==this.balance){
            throw new InsufficientBalanceException("balansin 0-a endiyinden ggursuz emeliyyat");

        }else {
            balance -= amount;
            System.out.println(" balansdan cixilan mebleq " + amount);
            System.out.println("balansin " + this.balance);
            System.out.println("istifadeci " + this.accountOwner);

        }

    }
}
