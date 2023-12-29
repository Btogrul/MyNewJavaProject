package Archive.mentor.Month_4.M26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_Books {
    public static void main(String[] args) {
        List<Book_Task> new_list = new ArrayList<>();
        new_list.add(new Book_Task("One Piece", "Eiichiro Oda", 1997));
        new_list.add(new Book_Task("Attack on Titan", "Hajime Isayama", 2009));
        new_list.add(new Book_Task("Solo Leveling", "Chugong", 2018));


        Book_Task latest_manga = new_list.stream()
                .max(Comparator.comparingInt(Book_Task::getYear))
                .orElse(null);

        System.out.println(latest_manga);
    }
}
