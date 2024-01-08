package Archive.mentor.Month_4.M28.Task_27_1;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String, Book> new_library;

    public Library() {
        this.new_library = new HashMap<>();
    }

    void add_book(Book book) {
        new_library.put(book.getIsbn(), book);
    }

    void remove_book(String isbn) {
        new_library.remove(isbn);
    }

    void get_book(String isbn) {
        Book book = new_library.get(isbn);
        if (book != null) {
            System.out.println("axtardiqiniz kitab " + isbn );
            System.out.println(book);
        } else {
            System.out.println("bele bir kitab yoxdur.");
        }
    }
    void print_library() {
        System.out.println();
        System.out.println("kitabxana :");
        for (Book book : new_library.values()) {
            System.out.println(book);
        }
        System.out.println();
    }
}
