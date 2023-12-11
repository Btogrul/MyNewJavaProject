package Archive.mentor.Month_3.M22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist ply = new Playlist();
        List<String> playlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println(" Playlist Manager");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. Display playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 ->{
                    System.out.print(" Mahninin adini elave et : ");
                    String newSong = scanner.nextLine();
                    ply.addSong(playlist, newSong);
                }

                case 2 -> {
                    System.out.print(" Silmek istediyin mahni : ");
                    String songToRemove = scanner.nextLine();
                    ply.removeSong(playlist, songToRemove);
                }
                case 3-> ply.displayPlaylist(playlist);

                case 4 -> loop= false;

                default -> System.out.println("1 - 4 intervalinda seçim et.");
            }
            System.out.println();
            System.out.println("----------------");
            System.out.println();
        }

    }
}
