package Archive.mentor.nine_to_16.M15.Task_1;

public class Main {
    public static void main(String[] args) {
        Calculator call = new Calculator();
        ScientificCalculator scCall = new ScientificCalculator();


        System.out.println(call.add(13,23));
        System.out.println(call.add(12.22,12.12));
        System.out.println(call.add(1,2,3));


        System.out.println(scCall.power(22.0,2));
    }
}
