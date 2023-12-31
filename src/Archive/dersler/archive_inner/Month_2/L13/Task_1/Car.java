package Archive.dersler.archive_inner.Month_2.L13.Task_1;

public class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
