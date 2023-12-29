package Archive.mentor.archive_inner.Month_3.M24;

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
        roles.add(new Role("killer", 22, 30));


        Collections.sort(stars, Comparator.comparingInt(s -> s.actingSkill));


        Collections.sort(roles, Comparator.comparingInt(r -> r.minAge));


        for (Actor actor: stars) {
            System.out.println(actor.name);
            for (Role role  : roles) {

                if (actor.age >= role.minAge&& actor.age <= role.maxAge){
                    System.out.println(role.name + " <- roluna uygun olan siralama ve minimal yash " + role.minAge + " ve max yash " + role.maxAge  );

                }
            }
            System.out.println("==========================");

        }
    }
}
