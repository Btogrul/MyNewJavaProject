package Archive.mentor.Month_3.M18.NewTask;

public class ThreadB extends Thread{
    int count;

    public ThreadB(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Thread B " + i);
        }
    }
}
