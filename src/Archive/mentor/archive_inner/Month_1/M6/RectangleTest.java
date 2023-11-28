package Archive.mentor.archive_inner.Month_1.M6;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);


        System.out.println("a terefini daxil edin ");
        int a_side = sc.nextInt();

        System.out.println("b terefini daxil edin ");
        int b_side = sc.nextInt();




        int sahe = rectangle.RectangleArea(a_side, b_side);

        int perimetr = rectangle.RectanglePerimetr(a_side, b_side);

        System.out.println("Sahesi: " + sahe);

        System.out.println("Perimetri: " + perimetr);

    }
}