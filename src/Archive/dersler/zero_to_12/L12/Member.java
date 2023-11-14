package Archive.dersler.zero_to_12.L12;

import java.util.Arrays;

public class Member {
    int id;
    String name;
    Book[] borrowedBooks;

    public Member(int id, String name, Book[] borrowedBooks) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        int bookHashCode = book.hashCode();
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].hashCode() == bookHashCode) {
                System.out.println(name + " has already borrowed a book with the same hash code.");
                return;
            }
        }

        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == null) {
                borrowedBooks[i] = book;
                System.out.println(name + " has borrowed " + book.getTitle());
                return;
            }
        }
        System.out.println(name + " has reached the maximum limit of borrowed books.");
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + Arrays.toString(borrowedBooks) +
                '}';
    }
}
