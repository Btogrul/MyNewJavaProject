package Archive.mentor.archive_inner.Month_2.M16.Task_3;

public class Person implements Fly,Swim,Walk{
    @Override
    public void fly() {
        System.out.println("if dreaming");
    }

    @Override
    public void swim() {
        System.out.println("may be");
    }

    @Override
    public void walk() {
        System.out.println("of course");
    }
    void about(){
        System.out.println();
        this.fly();
        this.walk();
        this.swim();
    }
}
