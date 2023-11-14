package Archive.mentor.zero_to_eight.M1;

import java.util.Scanner;


public class Sahe {
    public static void main(String[] args) {
        System.out.println("Dairənin radiusunu daxil edin: " );
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
//        double total = Math.PI * Math.pow(r, 2); error

        double total = Math.PI * Math.pow(r, 2); // hell yolunu chat gpt terefinden tapdim

        System.out.println("Dairənin sahəsi => S = Pi * R(2) əsasən cavabımız : " + (int)total + " daha dəqiq desək " +  total);
    }
}

//Math.pow(x,y) - bir rəqəmin kvadratı kubu və s almaq üçün istifadə olunur