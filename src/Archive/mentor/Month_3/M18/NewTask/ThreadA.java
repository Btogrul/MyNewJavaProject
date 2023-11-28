package Archive.mentor.Month_3.M18.NewTask;

public class ThreadA extends Thread{
    int count;

    public ThreadA(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Thread A " + i);
        }
    }
}
