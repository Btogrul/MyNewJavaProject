package Archive.mentor.Month_3.M22.Task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size : ");
        int user_input = sc.nextInt();


        Map<Integer, String> name = new HashMap<>();


        for (int i = 0; i < user_input; i++) {
            System.out.println("name:");
            String user_name = sc.next();
            System.out.println("score:");
            int user_score = sc.nextInt();

            name.put(user_score, user_name);
        }


        for (Map.Entry<Integer, String> entry : name.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
