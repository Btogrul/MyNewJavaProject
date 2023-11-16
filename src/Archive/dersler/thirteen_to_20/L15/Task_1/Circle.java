package Archive.dersler.thirteen_to_20.L15.Task_1;

public class Circle extends Shape {
    @Override
    public void calculateArea(int pi, int r) {
        int result =  pi * r*r;
        System.out.println(result);
    }
}
