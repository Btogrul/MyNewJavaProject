public class Car {
    String make;
    String model;
    int year;
    int mil;

    public double milCalculate(){
       return this.mil * 1.6;
    }

    public int carAge(){
        return 2023 - this.year;
    }
}
