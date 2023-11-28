package Archive.dersler.Month_3;

public class ThreadForAnotherWay extends Main {
    another_way new_way = new another_way();
    @Override
    public void run() {

        new_way.even();
        new_way.odd();

    }
}
