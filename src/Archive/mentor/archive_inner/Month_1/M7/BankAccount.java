package Archive.mentor.archive_inner.Month_1.M7;

public class BankAccount {
    int account_number;
    int balance;

    public int cashDraw(int user_input) {
       return balance - user_input;
    }

    public int depozit(int user_input){
        return balance + user_input;
    }

}
