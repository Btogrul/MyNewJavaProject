package Archive.mentor.archive_inner.Month_2.M12;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter something ");
        String user_input = sc.nextLine();



        System.out.println("set turn");
        int turn_number = sc.nextInt();





//        for (int i = 0; i < turn_number; i++) {
//            System.out.print(user_input);
//        }




        System.out.println(user_input.repeat(turn_number));




    }
}
