package Archive.dersler.thirteen_to_20.L16.Bank;

import java.util.Objects;

public class Bank {
    BankAccount acc_1 = new BankAccount(01,"Teymur",200);
    BankAccount acc_2 = new BankAccount(02,"Tural",42000);
    BankAccount acc_3 = new BankAccount(03,"Tutar",32323);
    BankAccount acc_4 = new BankAccount(04,"Beyrut",0);
    BankAccount acc_5 = new BankAccount(05,"Varliq",2000000);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(acc_1, bank.acc_1) && Objects.equals(acc_2, bank.acc_2) && Objects.equals(acc_3, bank.acc_3) && Objects.equals(acc_4, bank.acc_4) && Objects.equals(acc_5, bank.acc_5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acc_1, acc_2, acc_3, acc_4, acc_5);
    }
}
