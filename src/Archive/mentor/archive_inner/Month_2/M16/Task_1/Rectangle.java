package Archive.mentor.archive_inner.Month_2.M16.Task_1;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" Rectangle");
    }


    @Override
    public void calculateArea() {

        int result = width* height;
        System.out.println("Rectangle area  : " + result);

    }
}
