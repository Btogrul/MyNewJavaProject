package Archive.dersler.Month_3;

public class Thread_odd extends Main {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i+=2) {
            System.out.println("odd " + i);
        }
    }
}
