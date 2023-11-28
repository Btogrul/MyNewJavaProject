package Archive.dersler.archive_inner.Month_2.L16.Bank;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    int balance;

    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void depositAmount(int balance){
        this.balance +=balance;
        System.out.println(accountHolder +  " balansin  : " + this.balance);
    }


    public void withdrawAmount(int balance) throws CustomException{
        this.balance -=balance;
        if (this.balance <= 0) {
            throw new CustomException("balansini artir");
        }else {
            System.out.println(accountHolder +  " balansin  : " + this.balance);
        }
    }


    public void transferFunds(BankAccount account, int transferMoney)throws CustomException{
        try{
            withdrawAmount(transferMoney);
            account.depositAmount(transferMoney);
            System.out.println("Transfer ugurlu oldu. Transfer olunan balansdaki umumi mebleq  "
                    + account.balance + "! Sizin balansda qalan mebleq  " + this.balance);
        }catch (CustomException e){
            throw new CustomException("balansinda transfer uchun kifayet qeder mebleq yoxdur ");
        }
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
