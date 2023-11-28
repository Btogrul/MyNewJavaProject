package Archive.dersler.archive_inner.Month_1_and_2.L3;

import java.util.Scanner;

public class GuessTheNumber_way2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("1-10 arasi bir reqem secin");
        int userGuess = sc.nextInt();

        double random = Math.random() * 10;
        int total_random = (int)random;

        System.out.println("random rəqəm : " + total_random);


        boolean uduzmaq = userGuess > total_random || userGuess < total_random;


        if(uduzmaq){
            System.out.println(" qeyd etdiyiniz cavab doğru deyil  ");
        }else{
            System.out.println("doğru cavab!!! təbriklər");
        }
    }
}
