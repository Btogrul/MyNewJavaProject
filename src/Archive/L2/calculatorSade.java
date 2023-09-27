package Archive.L2;

import java.util.Scanner;

public class calculatorSade {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("Rəqəmi əlavə edin:");
        int a = scanner.nextInt();



        System.out.println("Digər rəqəmi əlavə edin:");
        int b = scanner.nextInt();

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;


        System.out.println("toplasaq  => " + add);
        System.out.println("çıxsaq  => " + subtract);
        System.out.println("vursaq  => " + multiply);
        System.out.println("bölsək  => " + divide);
    }
}