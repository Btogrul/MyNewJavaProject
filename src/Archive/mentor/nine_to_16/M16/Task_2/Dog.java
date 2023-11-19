package Archive.mentor.nine_to_16.M16.Task_2;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("eat everything");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping after eating");
    }
}
