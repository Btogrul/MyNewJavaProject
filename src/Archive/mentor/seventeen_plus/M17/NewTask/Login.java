package Archive.mentor.seventeen_plus.M17.NewTask;

public class Login {
    private final String log = "admin";
    private final String pass = "admin";




    void login(String log,String pass) throws AuthenticationException{

        if (!log.equals(this.log) || !pass.equals(this.pass)){
            throw  new AuthenticationException("Girish xetasi");
        }


    }

}
