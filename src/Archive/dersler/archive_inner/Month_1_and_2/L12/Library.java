package Archive.dersler.archive_inner.Month_1_and_2.L12;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Library {
    private String libraryName;
    private Book[] books;

    public Library(String libraryName, int size) {
        this.libraryName = libraryName;
        this.books = new Book[size];
    }
    public Book[] getBooks() {
        return books;
    }
    public void addBook(int count) {
        if (count >= 0 && count < books.length) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Add a book");
            System.out.println("----------------");

            System.out.println("Enter the author:");
            String author = sc.nextLine();

            System.out.println("Enter the title:");
            String title = sc.nextLine();

            System.out.println("Enter the publication year:");
            int publicationYear = sc.nextInt();


            Book book = new Book(count, author, title, publicationYear);


            books[count] = book;

            System.out.println("Book added successfully.");
        } else {
            System.out.println("error detected. book rejected ");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library " + libraryName + ":");
        for (Book book : books) {
            if (book != null) {
                System.out.println("ID -> " + book.getId() + " || " + " Author " + book.getAuthor() + " || " + " Year ->" + book.getPublicationYear());
                System.out.println("===Title===");
                System.out.println(book.getTitle());
                System.out.println("==========");
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(libraryName, library.libraryName) && Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(libraryName);
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }
}
