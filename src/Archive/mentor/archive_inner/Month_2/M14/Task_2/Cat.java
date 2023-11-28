package Archive.mentor.archive_inner.Month_2.M14.Task_2;

public class Cat extends Animal{
    private String color;

    public Cat(String name, String sound, String color) {
        super(name, sound);
        this.color = color;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("color: " + color );
    }
}
