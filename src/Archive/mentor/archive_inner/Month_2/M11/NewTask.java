package Archive.mentor.archive_inner.Month_2.M11;

public class NewTask {
    public static void main(String[] args) {
        String text = "runforestrun";

        String word = "run ";

        int first = text.indexOf("run");
        int last = text.lastIndexOf("run");

        text = text.substring(0, first) + text.substring(first + "run".length(), last) + text.substring(last + "run".length());




        System.out.println(text);
    }


}
