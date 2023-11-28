package Archive.mentor.archive_inner.Month_2.M16.New;

public class Division {
    public void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("0-a bolmek olmaz");
        }else {
            System.out.println(a/b);
        }

    }
}
