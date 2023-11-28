package Archive.dersler.archive_inner.Month_1_and_2.L11;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1,"Toghrul");

        BankAccount account2 = new BankAccount(2,"Samir");



        System.out.println("Umumi akkountlarin sayi " + BankAccount.totalAccounts);

    }
}
