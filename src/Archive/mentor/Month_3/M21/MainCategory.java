package Archive.mentor.Month_3.M21;

public class MainCategory {
    public static void main(String[] args) {
        InputCategory in_1 = InputCategory.NUMBER;
        InputCategory in_2 = InputCategory.TEXT;
        InputCategory in_3 = InputCategory.SPECIAL_CHARACTER;

        System.out.println(in_1.getCategory());
        System.out.println(in_2.getCategory());
        System.out.println(in_3.getCategory());
    }
}
