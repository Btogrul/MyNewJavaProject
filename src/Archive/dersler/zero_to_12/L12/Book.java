package Archive.dersler.zero_to_12.L12;

import java.util.Objects;

public class Book {
    private int id, publicationYear;

    private String author, title;



    public Book() {
    }

    public Book(int id, String author, String title, int publicationYear) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
