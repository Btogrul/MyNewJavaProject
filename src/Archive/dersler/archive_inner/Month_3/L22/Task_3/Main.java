package Archive.dersler.archive_inner.Month_3.L22.Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("x", "A", 133,1222));
        books.add(new Book("z", "c", 41,1223));
        books.add(new Book("11", "d", 55,1221));
        books.add(new Book("a", "b", 53,1225));



//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book s1, Book s2) {
//                return Integer.compare(s1.getPublicationYear(), s2.getPublicationYear());
//            }
//        });

        Collections.sort(books, (s1, s2) -> Integer.compare(s1.getPublicationYear(), s2.getPublicationYear()));
//        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
