package Archive.mentor.nine_to_16.M12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Playlistin uzunluqunu qeyd edin ");
        int userInput = sc.nextInt();


        Playlist playlist = new Playlist(userInput);



        for (int i = 0; i < userInput; i++) {
            sc.nextLine();
            System.out.println("-------------");
            System.out.println("artisti secin  ");
            String artist = sc.nextLine();
            System.out.println("mahninin adı ");
            String title = sc.nextLine();
            System.out.println("müddəti seçin ");
            int duration = sc.nextInt();




            Song newSong = new Song(artist,title,duration);
            playlist.addSong(newSong);
        }

        playlist.displaySongs();
    }
}
