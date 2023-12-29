package Archive.mentor.archive_inner.Month_3.M23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate();

        System.out.print("mehsullarin sayi : ");
        int numItems = sc.nextInt();

        Map<String, Double> items = new HashMap<>();

        for (int i = 1; i <= numItems; i++) {
            System.out.print("name " + i + "-> ");
            String name = sc.next();

            System.out.print("price " + i + "-> ");
            double price = sc.nextDouble();

            items.put(name, price);
        }

        double totalPrice = cal.calculateTotal(items);
        System.out.println("total " + totalPrice);

    }

}
