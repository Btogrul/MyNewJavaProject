package Archive.dersler.archive_inner.Month_3.L19.Task_5;

public class MyRegTest {
    public static void main(String[] args) {
        String my_test = "Salam! Bir kg sogan ver sene zehmet !!";
        String[] strs = my_test.split("[!\\s]+");

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].toLowerCase().contains("s")) {
                System.out.println(strs[i]);
            }
        }
    }
}
