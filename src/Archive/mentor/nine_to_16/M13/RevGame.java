package Archive.mentor.nine_to_16.M13;

import java.util.Scanner;

public class RevGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence (or type 'exit' to quit)");

        String user_input = sc.nextLine();




        while (!user_input.equals("exit")) {


            char[] charArray = user_input.toCharArray();


            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }


            System.out.println();



            System.out.println("Enter a sentence (or type 'exit' to quit)");
            user_input = sc.nextLine();
        }

        System.out.println("bye bye");
    }
}
