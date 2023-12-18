package Archive.dersler.archive_inner.Month_3.L17;

public class Main extends java.lang.Thread {

    public static void main(String[] args) {
        Thread_even t_even = new Thread_even();
        Thread_odd t_odd = new Thread_odd();
        t_even.start();
        t_odd.start();



//        another_way t_new_way = new another_way();
//        t_new_way.start();

    }


}
