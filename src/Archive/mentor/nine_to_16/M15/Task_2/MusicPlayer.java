package Archive.mentor.nine_to_16.M15.Task_2;

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
