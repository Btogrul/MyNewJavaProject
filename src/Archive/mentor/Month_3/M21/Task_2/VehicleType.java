package Archive.mentor.Month_3.M21.Task_2;

public enum VehicleType {
    CAR,
    MOTORCYCLE,
    TRUCK,
    BICYCLE;

    public static void PrintInfo(VehicleType name) {
        switch (name) {
            case CAR -> System.out.println("car");
            case MOTORCYCLE ->  System.out.println("moto");
            case TRUCK -> System.out.println("truck");
            case BICYCLE -> System.out.println("bicycle ");
            default -> System.out.println(" nothing to say ");
        }
    }
}

