package Archive.mentor.archive_inner.Month_2.M15.Task_3;

public class Weapon {
    void attack(){
        System.out.println("basic attack");
    }
    void attack(int damage){
        System.out.println("attack damage is : " + damage);
    }

    void attack(double criticalMultiplier){
        System.out.println("critical " + criticalMultiplier);
    }

    void attack(String specialMove) {
        System.out.println("special move: " + specialMove);
    }

}
