package Archive.mentor.Month_4.M28.Task_27_1;

public class Book {
    String isbn, title, author;
    int quantity;

    public Book(String ISBN, String title, String author, int quantity) {
        this.isbn = ISBN;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
