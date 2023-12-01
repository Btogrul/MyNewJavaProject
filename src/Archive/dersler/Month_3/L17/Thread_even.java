package Archive.dersler.Month_3.L17;

public class Thread_even extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 2; i < 10000 ; i+=2) {
            System.out.println("even " + i);

        }
    }
}
