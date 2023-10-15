package Archive.mentor.M5;

import java.util.Scanner;

public class MaxMinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Arrayin uzunluqunu qeyd edin ");
        int [] myArray = new int [sc.nextInt()];




        for (int i = 0; i<= myArray.length - 1; i++){
            System.out.println(" zehmet olmasa arrayin " + i + " elementin daxil edin  ");
            myArray[i] = sc.nextInt();
        }

        int maxValue = myArray[0];
        int minValue = myArray[0];


        for (int i = 1; i < myArray.length; i++) {

            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }

        System.out.println("Maksimum qiymət: " + maxValue);
        System.out.println("Minimum qiymət: " + minValue);
        

    }
}
