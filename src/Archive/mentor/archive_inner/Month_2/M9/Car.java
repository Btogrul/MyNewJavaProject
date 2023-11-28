package Archive.mentor.archive_inner.Month_2.M9;

public class Car {
    int id;
    String make;
    String model;
    int year;
    boolean secondHand;

    public Car(int id, String make, String model, int year, boolean secondHand) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.secondHand = secondHand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", secondHand=" + secondHand +
                '}';
    }
}
