public class BankAccount {
    int account_number;
    int balance;

    public int cashDraw(int user_input) {
       return this.balance - user_input;
    }

    public int depozit(int user_input){
        return this.balance + user_input;
    }

}
