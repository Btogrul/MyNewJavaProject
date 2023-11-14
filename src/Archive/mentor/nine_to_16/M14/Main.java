package Archive.mentor.nine_to_16.M14;

public class Main {
    public static void main(String[] args) {
        Manager newManager = new Manager("Moto", 60.525, 5);
        Developer newDev = new Developer("Cris", 60.355, "Java");

        newManager.getDetails();


        System.out.println();
        System.out.println("==============");
        System.out.println();


        newDev.getDetails();
    }
}
