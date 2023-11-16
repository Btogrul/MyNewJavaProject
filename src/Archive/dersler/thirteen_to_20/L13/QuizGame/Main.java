package Archive.dersler.thirteen_to_20.L13.QuizGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Easy easyQuestions = new Easy();
        Medium mediumQuestions = new Medium();
        Hard hardQuestions = new Hard();

        String user_answer;



        System.out.println("Oyuna xoş gəldiniz! Zəhmət olmasa adınızı qeyd edin :  ");
        String user_name = sc.nextLine();


        System.out.println(user_name + "oynamaq istədiyiniz səviyyəni seçin : ");
        System.out.println("----------");
        System.out.println("|| easy , medium , hard " +  "||  və yaxud   ||" + " 1 , 2 , 3 ||   seçməyiniz kifayət edər." );
        System.out.println("----------");
        user_answer = sc.nextLine();






        if (user_answer.equals("easy") || user_answer.equals("1")){

        }

    }
}
