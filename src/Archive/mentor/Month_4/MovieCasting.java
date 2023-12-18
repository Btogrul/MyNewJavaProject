package Archive.mentor.Month_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieCasting {
    public static void main(String[] args) {
        ArrayList<Actor> stars = new ArrayList<>();
        stars.add(new Actor("Amanda", 18, 99));
        stars.add(new Actor("Isabelle", 21, 98));
        stars.add(new Actor("Albedo", 36, 100));
        stars.add(new Actor("Jeepers", 29, 80));

        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Role("survivor", 20, 40));
        roles.add(new Role("miller", 22, 30));


        Collections.sort(stars, Comparator.comparingInt(s -> s.actingSkill));


        Collections.sort(roles, Comparator.comparingInt(r -> r.minAge));


        for (Role role : roles) {
            System.out.println(role.name + " <- roluna uygun olan siralama ve minimal yash " + role.minAge + " ve max yash " + role.maxAge  );
            for (Actor actor : stars) {
                System.out.println(actor.name);
            }
            System.out.println("==========================");

        }
    }
}
