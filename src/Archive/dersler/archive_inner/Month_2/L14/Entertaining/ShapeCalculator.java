package Archive.dersler.archive_inner.Month_2.L14.Entertaining;

public class ShapeCalculator {

    int userScore;

    int result;

    public void area(int a, int b){
        this.result = a*b;
        System.out.println(a + " * " + b +" = ?"  );

    }

    public void area(int r){
        int pi = (int)3.14;
        this.result = pi * r*r;
        System.out.println("(int)pi * "+ r + " * " + r +" = ?"  );
    }


    public void area(double a, int h){

        this.result =  (int)(0.5 * a * h);
        System.out.println("(int)(1/2 * "+ a + " * " + h +") = ?"  );

    }

}
