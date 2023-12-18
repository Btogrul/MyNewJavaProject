package Archive.dersler.archive_inner.Month_3.L19.Task_1;

public class Main {
    public static void main(String[] args) {
        Month month = Month.DECEMBER;
        Month[] winterMonths = {Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};

        boolean winter = false;

        for(int i = 0; i < winterMonths.length; i++) {
            if (month.equals(winterMonths[i])){
                winter = true;
                break;
            }
        }

        if (winter){
            System.out.println("Qish geldi");
        }

    }
}
