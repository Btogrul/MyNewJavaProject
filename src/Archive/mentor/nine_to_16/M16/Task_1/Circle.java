package Archive.mentor.nine_to_16.M16.Task_1;

public class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" circle");
    }

    @Override
    public void calculateArea() {
        int result = (int)(Math.PI * Math.pow(this.r,2));
        System.out.println("circle area : "+  result);
    }
}
