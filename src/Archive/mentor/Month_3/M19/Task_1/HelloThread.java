package Archive.mentor.Month_3.M19.Task_1;

public class HelloThread extends Thread {

    private String message;

    public HelloThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print(message + " ");
            Thread.yield(); 
        }
    }

}
