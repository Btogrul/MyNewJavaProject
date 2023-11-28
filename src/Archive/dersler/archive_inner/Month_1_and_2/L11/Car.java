package Archive.dersler.archive_inner.Month_1_and_2.L11;

public class Car {
    int doorNumber;
    int price;
    int wheelNumber;

    int discount;

    public Car(int doorNumber, int wheelNumber) {
        this.doorNumber = doorNumber;
        this.price = 16000;
        this.wheelNumber = wheelNumber;
        this.discount = this.price / 2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorNumber=" + doorNumber +
                ", price=" + price + " $" +
                ", wheelNumber=" + wheelNumber +
                ",Buy now and get discount=" + discount + " $" +
                '}';
    }
}
