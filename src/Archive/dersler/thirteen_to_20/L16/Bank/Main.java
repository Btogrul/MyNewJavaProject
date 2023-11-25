package Archive.dersler.thirteen_to_20.L16.Bank;

import java.io.IOException;

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
