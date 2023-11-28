package Archive.dersler.archive_inner.Month_1_and_2.L8;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Questions question = new Questions();
        Scanner sc = new Scanner(System.in);


        //suallarimin bashlanqici
        String question_1 =question.questionText = "Avstraliyanın simvolu olan heyvan hansıdır?";
        String [] question_1_choices = question.choices = new String[]{"Meymun", "Tarantula", "Kenguru", "Balina"};
        int question_1_answer = question.correctAnswerIndex = 2;
        question.Question(question_1, question_1_choices, question_1_answer );
        System.out.print("Qeyd olunan variantlardan birni seçin : ");
        int user_answer = sc.nextInt();
        question.isCorrect(user_answer);
        System.out.println("Sizin " + question.userScore(user_answer) + " xaliniz var !");
        if (question.userScore<0){
            System.out.println("Oyun bitdi");
            return;
        }
        // ----------------- sualin biri bitdi -------------

        String question_2 =question.questionText = " Güneş sistemi daxilində neçə planet var?";
        String [] question_2_choices = question.choices = new String[]{"altı", "beş", "yeddi", "səkkiz"};
        int question_2_answer = question.correctAnswerIndex = 3;
        question.Question(question_2, question_2_choices, question_2_answer );
        System.out.print("Qeyd olunan variantlardan birni seçin : ");
        int user_answer_2 = sc.nextInt();
        question.isCorrect(user_answer_2);
        System.out.println("Sizin " + question.userScore(user_answer_2) + " xaliniz var !");
        if (question.userScore<0){
            System.out.println("Oyun bitdi");
            return;
        }

        // ----------------- sualin biri bitdi -------------
        String question_3 =question.questionText = " Havanın əsas komponenti olan kimyəvi qaz hansıdır?";
        String [] question_3_choices = question.choices = new String[]{"Azot", "Hidrogen", "Oksigen", "Karbon"};
        int question_3_answer = question.correctAnswerIndex = 0;
        question.Question(question_3, question_3_choices, question_3_answer );
        System.out.print("Qeyd olunan variantlardan birni seçin : ");
        int user_answer_3 = sc.nextInt();
        question.isCorrect(user_answer_3);
        System.out.println("Sizin " + question.userScore(user_answer_3) + " xaliniz var !");
        if (question.userScore<0){
            System.out.println("Oyun bitdi");
            return;
        }
        // ----------------- sualin biri bitdi -------------
        String question_4 =question.questionText = " Yaddaşını itirən insan ?";
        String [] question_4_choices = question.choices = new String[]{"Gamer", "Altsheymer", "Progamer", "Qeyd olunanlardan heç biri"};
        int question_4_answer = question.correctAnswerIndex = 1;
        question.Question(question_4, question_4_choices, question_4_answer );
        System.out.print("Qeyd olunan variantlardan birni seçin : ");
        int user_answer_4 = sc.nextInt();
        question.isCorrect(user_answer_4);
        System.out.println("Sizin " + question.userScore(user_answer_4) + " xaliniz var !");

        // ----------------- sualin biri bitdi -------------

        // suallarin sonu



    }
}
