package Archive.mentor.Month_3.M18;

public class Main {
    public static void main(String[] args) {
        Bank YeloBank = new Bank();

        try{
            YeloBank.withdrawFromAccount("32",1000);
        }catch (InsufficientBalanceException | InvalidAccountNumberException e ){
            System.out.println(e.getMessage());
        }
    }
}
