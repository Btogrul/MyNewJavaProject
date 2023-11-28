package Archive.mentor.archive_inner.Month_2.M14;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        MethodForNewTask length = new MethodForNewTask();

        Scanner sc = new Scanner(System.in);

        String user_input =sc.nextLine();




        if (user_input != ""){

            length.length(user_input);

        }else{
            System.out.println("nese yaz");
        }


    }

}
