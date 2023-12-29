package Archive.mentor.archive_inner.Month_3.M19;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.next();

        StringBuilder build = new StringBuilder();

        for (int i = text_1.length() - 1 ; i >= 0; i--) {
            build.append(text_1.charAt(i));
        }
        System.out.println(build);
    }
}
