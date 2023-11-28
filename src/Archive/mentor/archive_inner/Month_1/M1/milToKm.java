package Archive.mentor.archive_inner.Month_1.M1;

import java.util.Scanner;

public class milToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("neçə miles yol getmisiz ?");
        int m = sc.nextInt();
        double km = 1.6;
        double total = m * km;
        System.out.println("toplamda getdiyiniz yol km :" + total + " km"+ " Qeyd: 1 miles =>  " + km + " km." );


    }

}
