package Archive.dersler.zero_to_12.L2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("Rəqəmi əlavə edin:");
        int a = scanner.nextInt();



        System.out.println("Digər rəqəmi əlavə edin:");
        int b = scanner.nextInt();



        System.out.println("Əməliyyatı seçin: plus, minus, bolme, vurma");
        scanner.nextLine();

        String x = scanner.nextLine();




        int total = 0;

        if (x.equals("plus")) {
            total = a + b;
        } else if (x.equals("minus") ) {
            total = a - b;
        } else if (x.equals("vurma") ) {
            total = a * b;
        } else if (x.equals("bolme") ) {
            total = a / b;
        }

        /* "==" numeric nəticəni əldə etmək üçün, ".equals()" -  qeyd etdiyimiz String nəticəyə bərabər olduğunu göstərir.

        məlumatı buradan əldə etdim  - https://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java

        */

        System.out.println("Nəticə: " + total);
    }
}




