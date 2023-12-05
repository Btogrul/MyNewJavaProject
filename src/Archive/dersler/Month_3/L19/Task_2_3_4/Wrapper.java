package Archive.dersler.Month_3.L19.Task_2_3_4;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("any number  ");
        int user_input = sc.nextInt();
        Integer wrapper_user = Integer.valueOf(user_input);
        double total = wrapper_user * 2;
        System.out.println(total);

        //task 2 bitdi

        //task 3 bashladi
        Integer boxing = 7;
        int unboxing = boxing;
        System.out.println(unboxing);

        //task 4 bashladi
        System.out.println("yashin ? ");
        String user_age = sc.nextLine();
        int user_int_age = Integer.parseInt(user_age);
        System.out.println("int deyere parse olunmush age => " + user_int_age  );










    }
}
