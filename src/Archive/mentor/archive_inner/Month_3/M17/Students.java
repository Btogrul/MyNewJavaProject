package Archive.mentor.archive_inner.Month_3.M17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int students_num;
        int totalScore=0;


        try{
            System.out.println("telebelerin sayini qeyd edin ");
            students_num = sc.nextInt();


            for (int i = 0; i < students_num; i++) {
                System.out.println((i+1) + " telebenin xalini qeyd edin ");
                int[] studentsScore = new int[students_num];
                studentsScore[i] = sc.nextInt();
                totalScore += studentsScore[i];
            }



            int result = totalScore/students_num;

            System.out.println("Ortalama qiymet " + result);

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException xeta var");

        }catch (ArithmeticException e ){
            System.out.println("ArithmeticException xeta var");
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException xetasi var");
        }
    }
}
