package Archive.mentor.archive_inner.Month_3.M22.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);


        System.out.println("size : " + num.size());

        System.out.print("reverse : ");
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println();

        System.out.println(num.contains(4) ? "found" : "not found");

        num.remove(2);


        num.add(0, 0);


        num.set(2, 66);

        List<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(70);
        newNumbers.add(80);
        newNumbers.add(90);


        num.addAll(newNumbers);

        Collections.sort(num);


        System.out.println("Result:");
        for (int numX : num) {
            System.out.print(numX + " ");
        }
    }
}
