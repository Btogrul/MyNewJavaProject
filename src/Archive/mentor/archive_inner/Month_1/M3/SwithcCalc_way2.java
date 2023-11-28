package Archive.mentor.archive_inner.Month_1.M3;

import java.util.Scanner;

public class SwithcCalc_way2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət olmasa ilk rəqəmi əlavə edin ");
        double firstNumber = sc.nextDouble() ;

        System.out.println("Zəhmət olmasa əməliyyatı seçin  (*, /, qalıq, -, + )");
        sc.nextLine();
        String operation = sc.nextLine();

        System.out.println("Zəhmət olmasa növbəti  rəqəmi əlavə edin ");
        double secondNumber = sc.nextDouble();



        boolean works = operation.equals("*") ||
                operation.equals("/") ||
                operation.equals("qalıq") ||
                operation.equals("+") ||
                operation.equals("-");



        if (works){
            switch (operation){
                case "*":
                    System.out.println("Nəticə " + (firstNumber*secondNumber));
                    break;
                case "/":
                    System.out.println("Nəticə " + (firstNumber/secondNumber));
                    break;
                case "-":
                    System.out.println("Nəticə " + (firstNumber-secondNumber));
                    break;
                case "+":
                    System.out.println("Nəticə " + (firstNumber+secondNumber));
                    break;
                case "qalıq":
                    System.out.println("Nəticə " + (firstNumber%secondNumber));
                    break;
                default:
                    System.out.println("Nəticə olaraq təəsüflər olsun ki heç nə qeyd edə bilmədik! ");

            }
        }else {
            System.out.println("Yanlış əməliyyat : " + operation);
        }

    }
}
