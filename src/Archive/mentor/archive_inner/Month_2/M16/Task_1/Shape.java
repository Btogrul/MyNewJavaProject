package Archive.mentor.archive_inner.Month_2.M16.Task_1;

public abstract class Shape implements Drawable {
    @Override
    public void draw() {
        System.out.print("drawing ");
    }
    public abstract void calculateArea();
}
