package Archive.mentor.nine_to_16.M9;

import java.util.Arrays;

public class Manifacture {
    int id;
    String  name;
    String country;
    Car [] new_car;

    public Manifacture(int id, String name, String country, Car[] new_car) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.new_car = new_car;
    }

    @Override
    public String toString() {
        return "Manifacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", new_car=" + Arrays.toString(new_car) +
                '}';
    }
}
