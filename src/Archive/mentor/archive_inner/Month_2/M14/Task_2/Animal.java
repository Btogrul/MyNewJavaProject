package Archive.mentor.archive_inner.Month_2.M14.Task_2;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " makes the sound: " + sound);
    }
}
