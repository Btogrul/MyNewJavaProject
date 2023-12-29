package Archive.mentor.Month_4.M26.New_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Players players_list = new Players();


        players_list.addUser("X", "Alfa", "assassin", 20231213);
        players_list.addUser("Y", "Beta", "Mage", 20230303);
        players_list.addUser("Z", "Gamma", "warrior", 20230405);


        players_list.displayPlayers();

        System.out.println();

        players_list.removeUser("X");
        System.out.println();
        System.out.println("===============");
        System.out.println("Axtardiqiniz oyuncunun adi ");
        String search_user = sc.nextLine();
        System.out.println(players_list.containsUserName(search_user)
                ? search_user + " adında var"
                : search_user + " adında yoxdur");


        System.out.println("==================");
        players_list.displayPlayers();
    }
}
