package Archive.mentor.archive_inner.Month_2.M11;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        counter1.increment();
        counter1.increment();
        counter1.increment();
        counter1.increment();

        counter2.increment();

        counter3.decrement();
        counter3.decrement();


        System.out.println("Counter 1-in sayi: " + counter1.getCount());
        System.out.println("Counter 2-nin sayi: " + counter2.getCount());
        System.out.println("Counter 3-nin sayi: " + counter3.getCount());
        System.out.println("Toplam counter sayi: " + Counter.getTotalCount());
    }
}
