package Archive.mentor.M12;

public class Playlist {
    private Song[] songs;
    private static int currentIndex = 0;

    public Playlist(int size) {
        songs = new Song[size];
    }

    public void addSong(Song song) {
        if (currentIndex < songs.length) {
            songs[currentIndex] = song;
            currentIndex++;
        } else {
            System.out.println("Playlistim doldu ");
        }
    }

    public void displaySongs() {
        for (int i = 0; i < currentIndex; i++) {
            Song song = songs[i];
            System.out.println("Mahni: " + song.getTitle() + ", Artist: " + song.getArtist() + ", muddet: " + song.getDuration());
        }
    }
}
