package Archive.mentor.Month_4.M26.New_task;

public class User {
    String user_name;
    String user_surname;
    String user_class;
    int registration_date;

    public User(String user_name, String user_surname, String user_class, int registration_date) {
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_class = user_class;
        this.registration_date = registration_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public String getUser_class() {
        return user_class;
    }

    public int getRegistration_date() {
        return registration_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_surname='" + user_surname + '\'' +
                ", user_class='" + user_class + '\'' +
                ", registration_date=" + registration_date +
                '}';
    }
}
