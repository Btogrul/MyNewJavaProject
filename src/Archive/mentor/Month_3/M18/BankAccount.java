package Archive.mentor.Month_3.M18;

public class BankAccount {
    String accountNumber;
    double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }






    public void withdraw(double amount) throws InsufficientBalanceException{

        if (amount> this.balance){
            throw new InsufficientBalanceException("Balansinda kifayet qeder mebleq yoxdur");

        }else if(amount==this.balance){
            throw new InsufficientBalanceException("balansin 0-a endiyinden ggursuz emeliyyat");

        }else {
            balance -= amount;
            System.out.println("balansin " + this.balance);
            System.out.println("istifadeci " + this.accountNumber);

        }

    }





    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
