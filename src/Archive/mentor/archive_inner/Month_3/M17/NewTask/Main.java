package Archive.mentor.archive_inner.Month_3.M17.NewTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        System.out.print("Sayta daxil olun ");
        String user_input = sc.nextLine();

        if (user_input.equals("192.168.1.1") || user_input.equals("192.168.1.0")){
            System.out.print("logini qeyd edin -> ");
            String user_log = sc.nextLine();
            System.out.print("Parolu qeyd edin -> ");
            String user_pass = sc.nextLine();
            try{
                login.login(user_log,user_pass);
                System.out.println("girish ugurlu oldu");
            }catch (AuthenticationException e){
                System.out.println("Xetamiz var, xetamiz!!! " + e.getMessage());
            }

        }

    }
}
