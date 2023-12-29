package Archive.mentor.Month_4.M26.New_task;

import java.util.HashMap;
import java.util.Map;

public class Players {
    Map<String, User> players_list = new HashMap<>();




    public void addUser(String userName, String userSurname, String userClass, int registrationDate) {
        User user = new User(userName, userSurname, userClass, registrationDate);
        players_list.put(userName, user);
    }

    public void removeUser(String userName) {
        players_list.remove(userName);
    }

    public boolean containsUserName(String userName) {
        return players_list.containsKey(userName);
    }

    public void displayPlayers() {
        players_list.values().forEach(System.out::println);
    }

}
