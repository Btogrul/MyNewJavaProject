package Archive.mentor.Month_3.M24.NewTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 3, 7, 2, 3, 7, 8));
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        ArrayList<Set<Integer>> numbers_1 = new ArrayList<>(Arrays.asList(uniqueSet));
        System.out.println("Original: " + numbers);
        System.out.println("without duplicate : " + numbers_1);

    }
}
