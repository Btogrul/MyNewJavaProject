package Archive.dersler.archive_inner.Month_3.L22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskComp {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("x", "A", 133));
        books.add(new Book("z", "c", 41));
        books.add(new Book("11", "d", 55));


        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
