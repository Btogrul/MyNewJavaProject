package Archive.mentor.archive_inner.Month_2.M16.Task_2;

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
