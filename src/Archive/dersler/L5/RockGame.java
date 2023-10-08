package Archive.dersler.L5;

import java.util.Scanner;

public class RockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean restartGame;
        int userScore = 0;
        int compScore = 0;

      do {
            boolean play;
            System.out.println("Oyuna başlayaq ? (he/yes/hə)");
            String userAnswer = sc.nextLine();


            if (userAnswer.equals("he") || userAnswer.equals("yes") || userAnswer.equals("hə")) {
                play = true;
            } else {
                System.out.println("Yanlış qərar.");
                play = false;
            }

            String computerGuess;

            for (int i= 0; i<3; i++){
                if (play) {


                    int randomNumber = (int) (Math.random() * 3);
                    // System.out.println(randomNumber);



                    switch (randomNumber) {
                        case 0:
                            computerGuess = "daş";
                            break;
                        case 1:
                            computerGuess = "kağız";
                            break;
                        default:
                            computerGuess = "qayçı";
                    }

                    System.out.println("Zəhmət olmasa bir seçim edin: (daş,  qayçı, kağız)");
                    String userGuess = sc.nextLine();



                    if (userGuess.equals(computerGuess)) {
                        System.out.println("Bərabərsiz! Rəqibiniz də " + computerGuess + "seçmişdir!");
                    } else if ((userGuess.equals("daş") && computerGuess.equals("qayçı"))
                            || (userGuess.equals("kağız") && computerGuess.equals("daş"))
                            || (userGuess.equals("qayçı") && computerGuess.equals("kağız"))) {
                        userScore += 1;
                        System.out.println("Təbriklər!!! Siz qalib gəldiniz! Rəqibiniz  " + computerGuess + " seçmişdi!");
                    } else if ((computerGuess.equals("daş") && userGuess.equals("qayçı"))
                            || (computerGuess.equals("kağız") && userGuess.equals("daş"))
                            || (computerGuess.equals("qayçı") && userGuess.equals("kağız"))) {

                        compScore += 1;
                        System.out.println("Təəssüf ! Rəqibiniz " + computerGuess + " seçdi.");

                    } else {
                        System.out.println(" Zəhmət olmasa qeyd olunan (daş, kağız, qayçı) seçimlərdən birini seçin!");
                    }
                    System.out.println("hesab Sizin " + userScore + ". Rəqibin " + compScore + " xalı var!" );
                }
            }

            System.out.println("Yeniden başla ?  (he/hə/yox)");
            String restartAnswer = sc.nextLine();

            if (restartAnswer.equals("hə") || restartAnswer.equals("he")) {
                restartGame = true;
                userScore = 0;
                compScore = 0;
            } else if (restartAnswer.equals("yox")) {
                System.out.println("Oyun üçün təşəkkürlər!");
                restartGame = false;
            } else {
                System.out.println("Doğru qərar vermədiyiniz üçün oyun dayandırıldı!");
                restartGame = false;
            }
        } while (restartGame);
    }
}