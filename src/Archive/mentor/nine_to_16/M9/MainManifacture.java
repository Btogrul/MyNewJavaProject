package Archive.mentor.nine_to_16.M9;

public class MainManifacture {
    public static void main(String[] args) {
        Car[] car_1 = new Car[3];
        car_1[0]= new Car (1,"Ford","Fusion",2023,false);
        car_1[1]= new Car (2,"BMW","M5",2012,true);
        car_1[2]= new Car (3,"Toyota","Supra",1999,true);

        Manifacture new_manifacture = new Manifacture(1,"New & Old cars", "USA & Japan" ,car_1);

        System.out.println(new_manifacture);

    }
}
