package Archive.dersler.Month_3;

public class Thread_even extends Main {
    @Override
    public void run() {
        for (int i = 2; i <10000 ; i+=2) {
            System.out.println("even " + i);
        }
    }
}
