package Archive.dersler.zero_to_12.L11;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1,"Toghrul");

        BankAccount account2 = new BankAccount(2,"Samir");



        System.out.println("Umumi akkountlarin sayi " + BankAccount.totalAccounts);

    }
}
