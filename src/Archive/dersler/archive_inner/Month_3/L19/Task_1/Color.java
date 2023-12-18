package Archive.dersler.archive_inner.Month_3.L19.Task_1;

public enum Color {
    GREEN,
    YELLOW,
    RED;

    public static void ColorMessage(Color color) {
        switch (color) {
            case RED:
                System.out.println("qirmizi reng");
                break;
            case GREEN:
                System.out.println("yashil reng");
                break;
            case YELLOW:
                System.out.println("sari reng ");
                break;
            default:
                System.out.println("nothing to say");
        }
    }

}
