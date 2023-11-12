package Archive.dersler.L13.Task_2_2;

public class Circle extends Shape {

    @Override
    public void calculateArea(int a, int b) {
        System.out.println("area " + a * (b * b));
    }
}