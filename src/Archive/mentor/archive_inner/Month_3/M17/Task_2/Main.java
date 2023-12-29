package Archive.mentor.archive_inner.Month_3.M17.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("set a pass ");
        String pass = sc.nextLine();

        try{
            Password new_pass = new Password();
            new_pass.validPass(pass);

        }catch (CustomException e){
            System.out.println(e.getMessage());
        }

    }
}
