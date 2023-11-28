package Archive.mentor.archive_inner.Month_2.M13;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir soz yaz ");
        String new_str = sc.nextLine();

        String message = " ";

            int first = 0;
            int last = new_str.length() - 1;


            while (first < last) {

            if (new_str.charAt(first) != new_str.charAt(last)) {
               message= "Palindrom deyil " + new_str;
                break;

            }else{
                message= "Palindromdur " + new_str;

            }



            last--;
            first++;


         }



        System.out.println(message);
    }

}
