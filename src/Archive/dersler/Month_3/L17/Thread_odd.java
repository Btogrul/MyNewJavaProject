package Archive.dersler.Month_3.L17;

public class Thread_odd extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10000; i+=2) {
            System.out.println("odd " + i);
        }
    }
}
