package Archive.dersler.archive_inner.Month_1_and_2.L6;

import java.util.Scanner;

public class BattleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cavab ;
        boolean turn = true ;
        boolean winner = true ;
        String userAnswer;
        int team_a_score = 0;
        int team_b_score = 0;
        int team_a_health = 3;
        int team_b_health = 3;

        System.out.println(" A komandasının oyuncusun adı : ");
        String player_a = sc.nextLine();

        System.out.println(" B komandasının oyuncusun adı : ");
        String player_b = sc.nextLine();


        boolean ready = player_a != "" && player_b != "";
        System.out.println();


        if (ready) {
            do {
                String[] exercises = new String[]{"10*20", "10+12", " 80 * 2 + 10", "5!", "16 + 5 + 11 - 2", " 5 * 5", " 6*6 ", "2*2 - 2", "(6+8) * 2 ", "3 * 3 / 3"};

                for (int i = 0; i < 1; i++) {

                    int random_number = (int) (Math.random() * 10);

                    String random_question = exercises[random_number];

                    if (turn) {
                        System.out.println(random_question + " " + player_a + " Zehmet olmasa cavabi qeyd edin :");
                        userAnswer = sc.nextLine();
                    } else {
                        System.out.println(random_question + " " + player_b + " Zehmet olmasa cavabi qeyd edin :");
                        userAnswer = sc.nextLine();
                    }

                    switch (random_number) {
                        case 0:
                            cavab = userAnswer.equals("200");
                            break;
                        case 1:
                            cavab = userAnswer.equals("22");
                            break;
                        case 2:
                            cavab = userAnswer.equals("170");
                            break;
                        case 3:
                            cavab = userAnswer.equals("120");
                            break;
                        case 4:
                            cavab = userAnswer.equals("30");
                            break;
                        case 5:
                            cavab = userAnswer.equals("25");
                            break;
                        case 6:
                            cavab = userAnswer.equals("36");
                            break;
                        case 7:
                            cavab = userAnswer.equals("2");
                            break;
                        case 8:
                            cavab = userAnswer.equals("28");
                            break;
                        case 9:
                            cavab = userAnswer.equals("3");
                            break;
                        default:
                            cavab = false;
                            break;
                    }

                    if (cavab) {
                        if (turn) {
                            team_a_score++;
                            System.out.println("Doğru cavab! " + player_a + " -nin xalı: " + team_a_score);
                            System.out.println();
                        } else {
                            team_b_score++;
                            System.out.println("Doğru cavab! " + player_b + " -nin xalı: " + team_b_score);
                            System.out.println();
                        }
                    } else {
                        if (turn) {
                            team_a_health--;
                            System.out.println("Yanlış cavab! " + player_a + " -nin qalıq canı: " + team_a_health);
                            System.out.println();
                            System.out.println("Sira deyishdi!");
                            turn = !turn;
                        } else {
                            team_b_health--;
                            System.out.println("Yanlış cavab! " + player_b + " -nin qalıq canı: " + team_b_health);
                            System.out.println();
                            System.out.println("Sira deyishdi!");
                            turn = !turn;
                        }
                    }

                    if (team_a_score == 2 || team_b_score == 2) {
                        System.out.println(" Sira deyishdi! ");
                        turn = !turn;
                    }
                    if (team_a_score == 1) {
                        System.out.println("Tebrikler! " + player_a + " Qalib geldi!");
                        winner = false;
                    } else if (team_b_score == 1) {
                        System.out.println("Tebrikler! " + player_b + " Qalib geldi!");
                        winner = false;
                    }
                }


            } while (team_a_health > 0 && team_b_health > 0 && winner);

            if (team_a_health == 0) {
                System.out.println(player_a + " -nin komandası meqlub oldu!");
            } else {
                System.out.println(player_b + " -nin komandası  meqlub oldu!");
            }


        } else {
            System.out.println("Zehmet olmasa qeydiyyatdan doğru keçin");
        }
    }
}



