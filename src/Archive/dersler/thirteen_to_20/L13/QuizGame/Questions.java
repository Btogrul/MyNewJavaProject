package Archive.dersler.thirteen_to_20.L13.QuizGame;

import java.util.Arrays;

public class Questions {
    String questionText;
    String[]  choices;
    int correctAnswerIndex;

     int userScore=0;

    public String Question(String questionText, String[] choices, int correctAnswerIndex) {

        this.questionText = questionText;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;



        System.out.println();
        System.out.println("---------------");
        System.out.println(" Yeni Sual  :");
        System.out.println();
        System.out.println(questionText);
        System.out.println("");


        System.out.print("1) " + choices[0] + "   " + "2) " + choices[1]);
        System.out.println();
        System.out.print("3) " + choices[2] + "   " + "4) " + choices[3]);
        System.out.println();
        System.out.println("---------------");


        return choices[correctAnswerIndex];
    }



    public void isCorrect(int playerAnswerIndex) {
        if (playerAnswerIndex  == correctAnswerIndex + 1) {
            System.out.println("Doğrudur! cavab :  " + choices[correctAnswerIndex] );

        }else{
            System.out.println(" Yanlish cavab ! Sizden 1 xal silindi. ");

        }
    }


    public int userScore (int playerAnswerIndex){
        if (playerAnswerIndex  == correctAnswerIndex + 1) {
            userScore++;


        }else{
            userScore--;

        }
        return  userScore;

    }

    public Questions() {
    }

    public Questions(String questionText, String[] choices, int correctAnswerIndex, int userScore) {
        this.questionText = questionText;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
        this.userScore = userScore;
    }


    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionText='" + questionText + '\'' +
                ", choices=" + Arrays.toString(choices) +
                ", correctAnswerIndex=" + correctAnswerIndex +
                ", userScore=" + userScore +
                '}';
    }
}
