package Archive.mentor.archive_inner.Month_3.M18;

public class Bank {
    BankAccount acc_1 = new BankAccount("1",2000);
    BankAccount acc_2 = new BankAccount("2",4000);


    public void addAccount(BankAccount account, String accountNumber,int balance){
        new BankAccount(accountNumber,balance);
    }



    public void withdrawFromAccount(String accountNumber, double amount)
            throws InvalidAccountNumberException, InsufficientBalanceException {

        if (!acc_1.getAccountNumber().equals(accountNumber) && !acc_2.getAccountNumber().equals(accountNumber)){
            throw new InvalidAccountNumberException("bele bir acc yoxdur");
        }else{
            BankAccount accountWithdraw = null;

            if (acc_1.getAccountNumber().equals(accountNumber)) {
                accountWithdraw = acc_1;
            } else if (acc_2.getAccountNumber().equals(accountNumber)) {
                accountWithdraw = acc_2;
            }

            if (accountWithdraw != null) {
                try {
                    accountWithdraw.withdraw(amount);
                } catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }

            }
        }




    }

}
