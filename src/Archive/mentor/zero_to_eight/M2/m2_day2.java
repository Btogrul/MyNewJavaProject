package Archive.mentor.zero_to_eight.M2;

import java.util.Scanner;

public class m2_day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Yashinizi qeyd edin! ");
        int userAge = sc.nextInt();


        boolean youCan = userAge >= 18 && userAge <= 60;


        if (youCan){
            System.out.println("Siz işləyə bilərsiniz! ");
        }
        if(!youCan){
            System.out.println("Yashiniz uyqun deyil");
        }

    }
}
