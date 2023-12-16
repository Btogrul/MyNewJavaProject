package Archive.dersler.Month_3.L22.Task_3;

public class Book implements Comparable<Book>{
    String title;
    String author;
    int price;
    int publicationYear;

    public Book(String title, String author, int price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
