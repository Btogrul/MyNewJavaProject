package Archive.mentor.archive_inner.Month_2.M14.Task_2;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String sound, String breed) {
        super(name, sound);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("breed: " + breed );
    }
}
