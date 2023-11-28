package Archive.mentor.archive_inner.Month_1.M2;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Zehmet olmasa logini daxil edin : ");
        String log = sc.nextLine();


        System.out.println("Zehmet olmasa parolu daxil edin : ");
        int pass = sc.nextInt();


        boolean logIn = log.equals("admin") && pass == 12345;

        if (logIn) {
            System.out.println("xosh geldiniz!");
        } else {
            System.out.println(" yanlish pass ve yaxud login ");
        }

    }
}
