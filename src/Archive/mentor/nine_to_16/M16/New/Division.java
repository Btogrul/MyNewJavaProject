package Archive.mentor.nine_to_16.M16.New;

public class Division {
    public void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("0-a bolmek olmaz");
        }else {
            System.out.println(a/b);
        }

    }
}
