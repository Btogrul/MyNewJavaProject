package Archive.mentor.archive_inner.Month_3.M17.Task_2;

public class Password {

    public void validPass(String pass) throws CustomException{
        if (pass.length() < 8) {
            throw new CustomException(" uzunluq min 8 olmalidir ");
        }

        boolean uppercase = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercase = true;
                break;
            }
        }

        if (!uppercase) {
            throw new CustomException("en azi bir boyuk herif olmalidir");
        }


        boolean lower = false;

        for (char c : pass.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower = true;
                break;
            }
        }

        if (!lower) {
            throw new CustomException("en azi bir kicik herif olmalidir");
        }

        if (!uppercase) {
            throw new CustomException("en azi bir boyuk herif olmalidir");
        }


        boolean digit = false;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digit = true;
                break;
            }
        }

        if (!digit) {
            throw new CustomException(" en azi bir reqem olmalidir");
        }

    }

}
