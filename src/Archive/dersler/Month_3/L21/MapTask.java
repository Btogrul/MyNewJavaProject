package Archive.dersler.Month_3.L21;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();



        Map<Integer, String> name = new HashMap<>();

        System.out.println("ölçünü qeyd et ");
        int size =sc.nextInt();

        name.put(0, "ilk");

        boolean loop =true;
        int turn=0;
        while(loop){
            int unique_id = (int)(date.getTime() + turn);

            System.out.println("key: " + unique_id);
            System.out.print("value: ");
            String value = sc.next();
            name.put(unique_id, value);

            turn++;

            if (size == turn ){
                loop =false;
            }
        }

        name.remove(0);


        System.out.println();
        System.out.println("-----------------");
        System.out.println("~~~Key~~~      ~~~Value~~~");
        for (Map.Entry<Integer, String> entry : name.entrySet()) {
            System.out.println(entry.getKey() + "   :   " + entry.getValue());
        }





    }


}
