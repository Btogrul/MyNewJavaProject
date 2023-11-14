package Archive.mentor.nine_to_16.M12;

public class Playlist {
    private Song[] songs;
    private static int list = 0;

    public Playlist(int size) {
        songs = new Song[size];
    }

    public void addSong(Song song) {
        if (list < songs.length) {
            songs[list] = song;
            list++;
        } else {
            System.out.println("Playlistim doldu ");
        }
    }

    public void displaySongs() {


        for (int i = 0; i < list; i++) {

            Song song = songs[i];
            System.out.println("Mahni: " + song.getTitle() + ", Artist: " + song.getArtist() + ", muddet: " + song.getDuration());


        }



    }
}
