package Archive.mentor.M4;

import java.util.Scanner;

public class TaskNew {
    public static void main(String[] args) {


        int result = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println(" zehmet olmasa arrayin olcusunu daxil edin  ");
        int [] myArray = new int [sc.nextInt()];


        for (int i = 0; i<= myArray.length - 1; i++){
            System.out.println(" zehmet olmasa arrayin " + i + " elementin daxil edin  ");
            myArray[i] = sc.nextInt();
        }



        for ( int item: myArray) {
            result += item;
        }

        System.out.println("Cavab  " + result);
    }
}
