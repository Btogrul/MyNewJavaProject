import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("bir deyer elave edin ");

        int userInput = sc.nextInt();
        int result= 1;

        for(int i = 1; i <= userInput; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
