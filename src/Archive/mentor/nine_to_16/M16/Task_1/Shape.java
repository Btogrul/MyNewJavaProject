package Archive.mentor.nine_to_16.M16.Task_1;

public abstract class Shape implements Drawable {
    @Override
    public void draw() {
        System.out.print("drawing ");
    }
    public abstract void calculateArea();
}
