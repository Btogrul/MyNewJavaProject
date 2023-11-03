package Archive.mentor.M11;

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
