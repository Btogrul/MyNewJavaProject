package Archive.dersler.archive_inner.Month_2.L13.Task_1;

public class Bike extends Vehicle{
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }


    @Override
    public String toString() {
        return "Bike{" +
                "numWheels=" + numWheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
