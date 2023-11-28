package Archive.mentor.Month_3.M18.NewTask;

public class ThreadC extends Thread{
    int count;

    public ThreadC(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Thread C " + i);
        }
    }
}
