
import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət olmasa ilk rəqəmi əlavə edin ");
        int firstNumber = sc.nextInt() ;

        System.out.println("Zəhmət olmasa əməliyyatı seçin  (vurma, bölmə, qalıq, çıxma, toplama ) ");
        sc.nextLine();
        String operation = sc.nextLine();

        System.out.println("Zəhmət olmasa növbəti  rəqəmi əlavə edin ");
        int secondNumber = sc.nextInt();



        boolean works = operation.equals("vurma") ||
                operation.equals("bölmə") ||
                operation.equals("qalıq") ||
                operation.equals("toplama") ||
                operation.equals("çıxma");



        if (works){
            switch (operation){
                case "vurma":
                    System.out.println("Nəticə " + (firstNumber*secondNumber));
                    break;
                case "bölmə":
                    System.out.println("Nəticə " + (firstNumber/secondNumber));
                    break;
                case "çıxma":
                    System.out.println("Nəticə " + (firstNumber-secondNumber));
                    break;
                case "toplama":
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
