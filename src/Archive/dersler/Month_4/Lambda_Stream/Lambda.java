package Archive.dersler.Month_4.Lambda_Stream;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        TestInterface check =  (num) -> num > 0;
        int x = 1;
        int y = -1;
        System.out.println("x  " + check.operation(x));
        System.out.println("y  " + check.operation(y));




        List<Double> my_list = new ArrayList<>();
        my_list.add(2.01);
        my_list.add(3.04);
        my_list.add(4.2);

        List<Integer> intList = new ArrayList<>();
        my_list.forEach(d -> intList.add((int) Math.round(d)));

        System.out.println("int list " + intList);
        System.out.println("doubles " + my_list);
    }
}
