package Archive.dersler.thirteen_to_20.L15.CardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Card card_game = new Card();
        Card npc_card = new Card();
        String player_cards;
        String npc_cards;
        int player_money ;
        int player_health = 3;
        String restart;
        System.out.println("Java kozinosuna xoş gəldiniz! ");

        System.out.print("Zəhmət olmasa adınızı qeyd edin : ");

        String player_name = sc.nextLine();



        System.out.println(player_name + " başlayaq ?  hə/yox || he ");
        System.out.println(" Qeyd :  Sizin  oyuna başlamadan öncə " + player_health + " şansınız olur və büdcənizdən asılı olaraq oyun davam edir.");
        System.out.println();
        String user_ready = sc.nextLine();
        if (user_ready.equals("hə")||user_ready.equals("he")){
            System.out.print ("Zəhmət olmasa balansınızı artırın : ");
            player_money = sc.nextInt();
            System.out.println();
            System.out.println("Balans uğurla artırıldı!  : " + player_money + " $ ");
            System.out.println();
            sc.nextLine();





            do{
                if (player_health>0 && player_health<=3 && player_money != 0){
                    System.out.println("-----------------");
                    System.out.println("Oyun başladı");

                    int card_picker =  (int) (Math.random() * 3) + 1;
                    switch (card_picker){
                        case 1 -> player_cards = card_game.card_call();
                        case 2 -> player_cards = card_game.card_call_2();
                        case 3 -> player_cards = card_game.card_call_3();
                        default -> player_cards = "card yoxdur";
                    }

                    int npc_card_picker =  (int) (Math.random() * 3) + 1;
                    switch (npc_card_picker){
                        case 1 -> npc_cards = npc_card.card_call();
                        case 2 -> npc_cards = npc_card.card_call_2();
                        case 3 -> npc_cards = npc_card.card_call_3();
                        default -> npc_cards = "card yoxdur";
                    }



                    System.out.println("=====================");
                    System.out.println(player_cards);
                    System.out.println("=====================");

                    System.out.println("Reqibin seçdiyi kartlar " + npc_cards);
                    System.out.println("=====================");

                    if(card_game.total_score > npc_card.total_score){
                        int random_money = (int)(Math.random() * 1000)+ 100;
                        System.out.println("Təbriklər ! siz qalib gəldiniz ! " + player_name + "  balansınıza " + random_money + "$ əlavə olundu! " +
                                "toplam balans : " + (player_money+random_money) + "$" );
                    } else if (card_game.total_score < npc_card.total_score) {
                        int random_money = (int)(Math.random() * 1000)+ 100;
                        System.out.println(" Havadan meqlubiyyet qoxusu gelir ! " + player_name + "  balansınızdan " + random_money + "$ çıxıldı! " +
                                "toplam balans : " + (player_money-random_money) + "$" );
                        player_health--;
                        if (player_money-random_money<0){
                            System.out.println("Pulun olanda gelersen " + player_name);
                            break;
                        }
                    }else{
                        System.out.println("beraber qaldiniz!");
                    }


                }else{
                    System.out.println("Təbriklər! Siz bankrot oldunuz! ");
                }
                System.out.println("davam edək ? he / hə / yes");
                restart= sc.nextLine();
            } while((restart.equals("he")|| restart.equals("hə")|| restart.equals("yes"))&& player_money != 0 && player_health>0 );







        } else if (user_ready.equals("yox")) {
            System.out.println("bye bye");

        }else{
            System.out.println("qeyd olunan seçimlərdən birini seç ");
        }


    }
}
