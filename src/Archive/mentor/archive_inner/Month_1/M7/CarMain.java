package Archive.mentor.archive_inner.Month_1.M7;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);



        System.out.print("Markani daxil edin ");
        car.make = sc.nextLine();
        System.out.println("-----------");

        System.out.print("modeli daxil edin ");
        car.model = sc.nextLine();
        System.out.println("-----------");

        System.out.println();






        System.out.print("Mashinin ilini daxil edin :");

        car.year = sc.nextInt();
        if (car.year != 0 && car.year >  1886 && car.make != "" && car.model != ""){
            System.out.print("Mashinin Milini daxil edin :");
            car.mil = sc.nextInt();
            if (car.mil >=0){
                System.out.println(" Nətircə olaraq: ");
                System.out.println(" Markasi: " + car.make);
                System.out.println(" Modeli: " + car.model);
                System.out.println(" Yashi: " + car.carAge());
                System.out.println(" Toplam km: " + car.milCalculate());

            }else {
                System.out.println("xeta");
            }
        }else {
            System.out.println(" Melumatlari tam doldurun ");
        }

    }
}
