package Archive.mentor.Month_4.M26;
import java.util.ArrayList;
import java.util.List;
public class SecondTask {
        public static void main(String[] args) {
            List<String> user_input = new ArrayList<>();
            user_input.add("Re:Zero - Starting Life in Another World");
            user_input.add("Sword Art Online");
            user_input.add("No Game No Life");
            user_input.add("Overlord");
            user_input.add("The Rising of the Shield Hero");
            user_input.add("Log Horizon");
            user_input.add("That Time I Got Reincarnated as a Slime");
            user_input.add("Konosuba: God's Blessing on This Wonderful World!");
            user_input.add("In Another World with My Smartphone");
            user_input.add("The Devil is a Part-Timer!");


            List<String> output = user_input.stream()
                    .filter(s -> s.length() > 10)
                    .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                    .toList();

            for (String x : output
            ) {
                System.out.println();
                System.out.println(x);
                System.out.println();
                System.out.println("--------------");
            }
        }

}
