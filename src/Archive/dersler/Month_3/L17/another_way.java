package Archive.dersler.Month_3.L17;

public class another_way extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10000; i++) {
            if (i % 2 == 0) {
                System.out.println("even " + i);
            } else {
                System.out.println("odd " + i);
            }
        }
    }
}