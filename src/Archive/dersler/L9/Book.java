package Archive.dersler.L9;

public class Book {
    Author author;
    String title;
    int publicationYear;

    public Book(Author author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public Book() {
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }




    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }



}
