package Archive.mentor.Month_3.M18.NewTask;

public class Main {
    public static void main(String[] args) {
        ThreadA thr_a = new ThreadA(3);
        ThreadB thr_b = new ThreadB(4);
        ThreadC thr_c = new ThreadC(6);
        thr_a.start();
        thr_b.start();
        thr_c.start();
    }
}
