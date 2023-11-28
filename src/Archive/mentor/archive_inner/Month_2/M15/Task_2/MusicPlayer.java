package Archive.mentor.archive_inner.Month_2.M15.Task_2;

public class MusicPlayer {
    void play(String name) {
        System.out.println("Playing " + name + " in MP3 format.");
    }

    void play(String name, String format) {
        System.out.println("Playing " + name + " in " + format + " format.");
    }

    void play(String name, int bitrate) {
        System.out.println("Playing " + name + " with bitrate: " + bitrate + " kbps.");
    }
}
