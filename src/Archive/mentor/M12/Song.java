package Archive.mentor.M12;

import java.util.Objects;

public class Song {
    private String  artist, title;
    private int duration;


    public Song() {
    }

    public Song(String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song songs = (Song) o;
        return duration == songs.duration && Objects.equals(artist, songs.artist) && Objects.equals(title, songs.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, duration);
    }
}
