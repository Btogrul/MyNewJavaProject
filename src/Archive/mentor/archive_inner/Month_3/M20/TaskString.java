package Archive.mentor.archive_inner.Month_3.M20;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type something... ");
        String user_input = sc.nextLine();;

        StringBuilder my_build;
        my_build = new StringBuilder(user_input);

        System.out.println("my string output -->>> " + user_input.replaceAll("[aeiouAEIOU]", ""));


        for (int i = 0; i < my_build.length(); ) {
            char currentChar = my_build.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'
                    || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                my_build.deleteCharAt(i);
            } else {
                i++;
            }
        }

        System.out.println("my StringBuilder output -->>> " + user_input.replaceAll("[aeiouAEIOU]", ""));

    }
}
