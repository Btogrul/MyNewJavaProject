package Archive.dersler.L11;

public class BankAccount {
    int id;
    String name;

    static  int totalAccounts = 0;


    public BankAccount(int id, String name) {
        this.id = id;
        this.name = name;
        totalAccounts++;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
