package Archive.mentor.Month_4.M26;

public class Movie {
    String title;
    String genre;
    int release_date;

    public Movie(String title, String genre, int release_date) {
        this.title = title;
        this.genre = genre;
        this.release_date = release_date;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRelease_date() {
        return release_date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", release_date=" + release_date +
                '}';
    }
}
