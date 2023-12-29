package Archive.mentor.Month_4.M26;
import java.util.Arrays;
import java.util.List;
public class Main_movie {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Black Gold", "Drama", 2011),
                new Movie("Harry Potter", "Fantasy", 2001),
                new Movie("The Lord of the Rings", "Adventure", 2001),
                new Movie("The Brothers Grimm", "Fantasy", 2005),
                new Movie("Perfume: The Story of a Murderer", "Drama", 2006)
        );

        List<String> genre_list = movies.stream()
                .map(Movie::getGenre)
                .distinct()
                .sorted()
                .toList();




        System.out.println("-----------");
        movies.forEach(movie -> System.out.println(movie.getTitle() + " " + movie.getGenre() + " " + movie.getRelease_date()));
       

        System.out.println("-----------");
        System.out.println(genre_list);
        System.out.println("-----------");
    }
}
