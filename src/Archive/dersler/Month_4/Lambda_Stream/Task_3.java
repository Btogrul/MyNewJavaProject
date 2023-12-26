package Archive.dersler.Month_4.Lambda_Stream;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("some");
        words.add("word");
        words.add("plus");

        Integer averageLength = (int) words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(averageLength);



        List<Integer> numbers =new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int product = numbers.stream()
                .reduce((a, b) -> a * b)
                .orElse(1);

        System.out.println(product);
    }
}
