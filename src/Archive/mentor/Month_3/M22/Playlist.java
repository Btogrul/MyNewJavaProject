package Archive.mentor.Month_3.M22;

import java.util.List;

public class Playlist {
    static void addSong(List<String> playlist, String song) {
        playlist.add(song);
        System.out.println(" " + song + " <--- əlavə olundu.");
    }

     static void removeSong(List<String> playlist, String song) {
        if (playlist.remove(song)) {
            System.out.println(" " + song + " <--- silindi.");
        } else {
            System.out.println(" " + song + " <--- bele bir mahni tapilmadi.");
        }
    }

     static void displayPlaylist(List<String> playlist) {
        System.out.println(" Playlist: ");

        if (!playlist.isEmpty()){
            for (String song : playlist) {
                System.out.println(song);
            }
        }

    }
}
