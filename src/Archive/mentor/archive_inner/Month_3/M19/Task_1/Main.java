package Archive.mentor.archive_inner.Month_3.M19.Task_1;

public class Main {
    public static void main(String[] args) {

        Thread helloThread = new HelloThread("Hello");
        Thread worldThread = new HelloThread("World");


        helloThread.start();
        worldThread.start();


        try {
            helloThread.join();
            worldThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
