package Archive.dersler.Month_4.Lambda_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_Stream {
    public static void main(String[] args) {
        List<String> string_numbers = new ArrayList<>();
        string_numbers.add("1");
        string_numbers.add("2");
        string_numbers.add("3");
        string_numbers.add("4");
        string_numbers.add("5");
        string_numbers.add("6");

        List<String> filt_numbers = string_numbers.stream()
                .filter(list -> list.length() < 5)
                .toList();


        System.out.println("filt " + filt_numbers);
        System.out.println("numbers " + string_numbers);

        //==========================

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> skipNumbers = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skipNumbers);


    }
}

