package Archive.dersler.L14;

public class ShapeCalculator {
    public void area(int a, int b){
        int result = a*b;
        System.out.println(result);
    }

    public void area(int r){
        int pi = (int)3.14;
        int result = pi * r*r;
        System.out.println(result);
    }


    public void area(double a, int h){

        int result =  (int)(0.5 * a * h);
        System.out.println(result);
    }


}
