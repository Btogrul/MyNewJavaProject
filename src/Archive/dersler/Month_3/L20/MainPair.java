package Archive.dersler.Month_3.L20;

import java.util.*;

public class MainPair {
    public static void main(String[] args) {
        Pair<String,Integer > new_pair = new Pair<>("Hey", 20);
        new_pair.test();



        System.out.println();
        System.out.println("---------------------");


        //Task 2


        List<String> list = new ArrayList<>();
        list.add("kiwi");
        list.add("nectarine");
        list.add("watermelon");

        for (String fruit : list) {
            System.out.print(fruit + " ");
        }

        //Task  3


        System.out.println();
        System.out.println("---------------------");

        Set<Integer> test_set = new HashSet<>();
        test_set.add(2);
        test_set.add(3);
        test_set.add(3);
        test_set.add(2);


        for (Integer x : test_set) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("---------------------");

        //Task 4

        Queue<String> my_text = new LinkedList<>();
        my_text.add("1");
        my_text.add("2");
        my_text.add("3");

        System.out.println("String numbers :");
        while (!my_text.isEmpty()) {
            System.out.print(my_text.poll() + " ");
        }
    }




}
