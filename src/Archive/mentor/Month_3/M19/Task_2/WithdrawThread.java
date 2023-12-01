package Archive.mentor.Month_3.M19.Task_2;

import Archive.mentor.Month_3.M18.InsufficientBalanceException;

public class WithdrawThread extends Thread{
    BankAccount name;
    double amount;

    public WithdrawThread(BankAccount name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            name.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
    }
}
