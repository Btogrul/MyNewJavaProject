package Archive.mentor.zero_to_eight.M4;

import java.util.Scanner;

public class VurmaCedvel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("reqem elave edin :");

        int userInput = sc.nextInt();
        int result;



        if (userInput != 0 ){

            for (int i = 1; i <= 10 ; i++){
                result = userInput * i;

                System.out.println(userInput + " * "  + i + " = " + result);


            }
        }else{
            System.out.println(" Cedvelden kenar bir hesablama");
        }

    }
}
