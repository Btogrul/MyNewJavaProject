package Archive.mentor.archive_inner.Month_2.M11;

public class Counter {
    int count ;
    static int totalCount ;




    public void increment() {
        count++;
        totalCount++;
    }

    public void decrement() {
            count--;
            totalCount--;

    }

    public int getCount() {
        return count;
    }



    public static int getTotalCount() {
        return totalCount;
    }


}
