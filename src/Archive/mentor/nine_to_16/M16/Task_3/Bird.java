package Archive.mentor.nine_to_16.M16.Task_3;

public class Bird implements Fly,Swim,Walk{
    @Override
    public void fly() {
        System.out.println("yes");
    }

    @Override
    public void swim() {
        System.out.println("may be some ");
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
