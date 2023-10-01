package Archive.dersler.L3;

import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("1-10 arasi bir reqem secin");
        int userGuess = sc.nextInt();

        double random = Math.random() * 10;
        int total_random = (int)random;

        System.out.println("random rəqəm : " + total_random);


        if(userGuess > total_random){
            System.out.println(" sizin cavab verilən nəticədən yuxarıdır  ");
        } else if (userGuess < total_random) {
            System.out.println(" sizin cavab  verilən nəticədən aşağıdır");
        }else{
            System.out.println("doğru cavab!!! təbriklər");
        }
    }
}
