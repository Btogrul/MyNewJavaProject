package Archive.dersler.archive_inner.Month_2.L14.Entertaining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userScore = 0;
        Scanner sc = new Scanner(System.in);
        ShapeCalculator shape = new ShapeCalculator();
        String player_choose;
        System.out.println("Oyuna xoş gəldiniz! ");
        System.out.print("adınızı qeyd edin : ");
        String player_name = sc.nextLine();
        int user_input;


        System.out.println("Misallardan birini seçin: 1 - dairə, 2 - düzbucaqlı dördbucaq, 3 - düzbucaqlı üçbucaq");
        System.out.println("Və ya 'exit' yazaraq oyundan çıxa bilərsiniz.");

        do {
            player_choose = sc.nextLine();

            double a = (int)(Math.random() * 5 + 2);
            int b = (int) (Math.random() * 10) + 5;

            switch (player_choose) {
                case "1":
                    shape.area((int)a);
                    user_input = sc.nextInt();
                    if (user_input == shape.result) {
                        userScore += 5;
                        System.out.println("Dairə -> " + shape.result);
                        System.out.println(player_name + " Sizin xaliniz " + userScore);
                    } else {
                        System.out.println("Yanlış cavab");
                        userScore -= 5;
                        System.out.println(player_name + " Sizdən -5 xal çıxıldı: " + userScore);
                    }
                    System.out.println("novbeti misal 1,2,3 və ya exit");
                    player_choose = sc.nextLine();
                    break;


                case "2":
                    shape.area((int)a,b);
                    user_input = sc.nextInt();

                    if (user_input == shape.result) {
                        userScore += 3;
                        System.out.println("düzbucaqlı dördbucaq -> " + shape.result);
                        System.out.println(player_name + " Sizin xaliniz " + userScore);
                    } else {
                        System.out.println("Yanlış cavab");
                        userScore -= 3;
                        System.out.println(player_name + " Sizdən -3 xal çıxıldı: " + userScore);
                    }
                    System.out.println("novbeti misal 1,2,3 və ya exit");
                    player_choose = sc.nextLine();
                    break;
                case "3":
                    shape.area(a,b);
                    user_input = sc.nextInt();

                    if (user_input == shape.result) {
                        userScore += 10;
                        System.out.println("düzbucaqlı üçbucaq -> " + shape.result);
                        System.out.println(player_name + " Sizin xaliniz " + userScore);
                    } else {
                        System.out.println("Yanlış cavab");
                        userScore -= 10;
                        System.out.println(player_name + " Sizdən -10 xal çıxıldı: " + userScore);
                    }
                    System.out.println("novbeti misal 1,2,3 və ya exit");
                    player_choose = sc.nextLine();
                    break;


                case "exit":
                    System.out.println("Oyundan çıxdınız.");
                    break;
                default:
                    System.out.println("Yanlış seçim, yenidən seçin.");
                    break;
            }

        } while (!player_choose.equals("exit"));



    }
}
