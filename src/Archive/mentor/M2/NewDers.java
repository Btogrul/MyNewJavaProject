package Archive.mentor.M2;

import java.util.Scanner;

public class NewDers {

    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        int c = 15;
//
//
//        String result = (a>b && a>c )? a +"shert odendi" : (b>a && b>c) ? b +" sherti odendi" : (c>a && c>b) ?   c + " en boyukdu " : " " ;
//
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Reqem daxil edin ");
        int userGuess = sc.nextInt();

        if (userGuess%2 == 0){
            System.out.println("eded cut ededdir");
        }else {
            System.out.println("eded tek ededdir");
        }
    }


}
