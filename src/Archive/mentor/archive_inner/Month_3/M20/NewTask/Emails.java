package Archive.mentor.archive_inner.Month_3.M20.NewTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Emails {
        public static void main(String[] args) {
            String[] emails = new String[]{"sdadasdde@example.com","sadasddd222@gmail.com",
                    "sdasdasdad_email","mcccccc@symbol.com","sdasdadr@symbol"};

            for (int i = 0; i < emails.length; i++) {
                System.out.println(emails[i] + "  | ---> " +isValidEmail(emails[i]));
            }
        }

        public static boolean isValidEmail(String email) {

            Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]+[._]*[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]\\w*");

            Matcher matcher = pattern.matcher(email);

            return matcher.matches();
        }

}
