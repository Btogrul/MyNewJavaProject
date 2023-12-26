package Archive.TestingSmthng;

public class Thread_test_2  extends  Thread{
    @Override
    public synchronized void run() {
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Notify detected");
        notify();
    }
}
