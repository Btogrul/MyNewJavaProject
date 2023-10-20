public class Questions {
    String questionText;
    String[] choices;
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


}
