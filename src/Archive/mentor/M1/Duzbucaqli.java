package Archive.mentor.M1;

import java.util.Scanner;

public class Duzbucaqli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("düzbücaqlının A tərəfini daxil edin: ");
        int a = sc.nextInt();
        System.out.println("düzbücaqlının B tərəfini daxil edin: ");
        int b = sc.nextInt();
        int result = a * b ;
        int perimetr = 2 * (a+b);
        System.out.println(" Düzbücaqlının sahəsi S = a * b düsturuna əsasən =>"  +  result + ", perimetri isə => " + perimetr);
    }
}
