package Archive.TestingSmthng.NewTest;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        // Пример использования switch с enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's not a special day.");
        }
    }

}
