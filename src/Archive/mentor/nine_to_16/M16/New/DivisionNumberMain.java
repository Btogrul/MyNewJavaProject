package Archive.mentor.nine_to_16.M16.New;

import java.util.Scanner;

public class DivisionNumberMain {
    public static void main(String[] args) throws DivisionByZeroException {

        Scanner sc = new Scanner(System.in);
        Division new_div = new Division();

        System.out.println("enter first ");
        int a = sc.nextInt();
        System.out.println("enter second ");
        int b = sc.nextInt();

        new_div.divide(a,b);

    }
}
