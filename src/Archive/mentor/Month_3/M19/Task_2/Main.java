package Archive.mentor.Month_3.M19.Task_2;

public class Main {
    public static void main(String[] args) {
        BankAccount acc_1 = new BankAccount("Toghrul", 10.000);
        WithdrawThread trh_1 = new WithdrawThread(acc_1,2.000 );
        WithdrawThread trh_2 = new WithdrawThread(acc_1,7.000 );


        trh_1.start();
        trh_2.start();


        try{
            trh_1.join();
            trh_2.join();
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
