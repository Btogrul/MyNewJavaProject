package Archive.dersler.thirteen_to_20.L16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Participant {
    String name;
    String email;
    int age;

    public Participant(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void displayParticipants(){
        try{
            FileReader new_file = new FileReader("Participant.txt");
            System.out.println("name " + this.name);
            System.out.println("mail " + this.email );
            System.out.println("mail " + this.age );
        }catch (FileNotFoundException e){
            System.out.println("fayli tapa bilmedik ");
        }
    }
}
