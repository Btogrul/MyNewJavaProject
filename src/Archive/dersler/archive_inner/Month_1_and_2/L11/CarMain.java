package Archive.dersler.archive_inner.Month_1_and_2.L11;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();


        String fullName = name + "  " + surname;
        System.out.println(fullName);




        Car car_1 = new Car(2,4);
        System.out.println(car_1);


    }
}
