package Archive.mentor.nine_to_16.M11;

import java.util.Scanner;

public class ManipulationPt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" type smthg : ");
        String userInput = sc.nextLine();

        System.out.println(" Your Message -> " + userInput) ;
        System.out.println(" lenght : " + userInput.length());
        System.out.println(" may be an apple ? " + userInput.toLowerCase().contains("apple"));
        System.out.println("==============");
        if (userInput.contains("apple")){
            userInput.toLowerCase().replace("apple","orange");
        }else{
            System.out.println(" There is no apple :( ");
        }

        System.out.println(" lowercase " + userInput.toLowerCase());
        System.out.println(" uppercase " + userInput.toUpperCase());

        if (userInput.length()>5){
            System.out.println(userInput.substring(0,5));
            System.out.println(userInput.substring(userInput.length() - 5));
        }else{
            System.out.println(" not today");
        }


        if (userInput.toLowerCase().startsWith("hello")){
            System.out.println("Starts with Hello");
        }else {
            System.out.println(" does not Starts with Hello");
        }



        if (userInput.toLowerCase().endsWith("world")){
            System.out.println("Ends with world");
        }else{
            System.out.println("Does Not Ends with world");
        }
    }
}
