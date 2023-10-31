package Archive.dersler.L11.part2;
import java.util.Random;
public class TreasureHunter {
    int secretCode;

    public TreasureHunter(int bound) {
        this.secretCode = new Random().nextInt(bound);

    }

    public int revealSecretCode() {
        return this.secretCode;
    }


}
