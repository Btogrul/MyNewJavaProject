package Archive.dersler.archive_inner.Month_1_and_2.L11.part2;

public class TreasureMain {
    public static void main(String[] args) {
        int bound = (int) (Math.random()*10000 + 12345);
        TreasureHunter newHunt = new TreasureHunter(bound);
        HiddenMessage hidden = new HiddenMessage();




        System.out.print(" Our secret code is --->>>> " + newHunt.revealSecretCode());
        System.out.println();
        for (int i = 0; i < hidden.hidden.length()/2; i++) {
            int keyActivator = (int)(Math.random() * 8);
            hidden.forFun(keyActivator);
        }

    }
}
