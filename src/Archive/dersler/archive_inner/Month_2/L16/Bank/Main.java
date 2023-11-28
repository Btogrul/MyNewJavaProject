package Archive.dersler.archive_inner.Month_2.L16.Bank;

public class Main {
    public static void main(String[] args){
        Bank b_of_b = new Bank();

        try{
            b_of_b.acc_1.transferFunds(b_of_b.acc_2, 200);
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
