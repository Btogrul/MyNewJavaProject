package Archive.TestingSmthng;

public class Thread_testing extends Thread {
    @Override
    public synchronized void run() {
        try{
            wait();
            for (int i = 0; i < 3; i++) {
                System.out.println(i);

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread_testing x = new Thread_testing();
        Thread_testing y = new Thread_testing();
        Thread_test_2 z = new Thread_test_2();
        x.start();
        y.start();
        z.start();

        try{
            x.join();
            y.join();
            z.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
