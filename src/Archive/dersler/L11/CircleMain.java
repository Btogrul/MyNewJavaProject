package Archive.dersler.L11;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Radiusu elave edin ");
        int radius = sc.nextInt();

        Circle myCircle = new Circle(radius);
        double area = myCircle.calculateArea();
        System.out.println("Area of the Circle: " + area);
    }
}
// instance -> obyekte aid olan deyishen.  static ->  ise classa aid olan