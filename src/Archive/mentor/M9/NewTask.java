package Archive.mentor.M9;

import java.sql.Array;

public class NewTask {
    public static void main(String[] args) {
        int [] newArray = new int[] {1,5,7,2,9,0};



        int max = newArray[0];



        for (int i = 0; i < newArray.length; i++) {


            if (newArray[i] > max) {
                max = newArray[i];
            }

        }



        System.out.println("max reqem " + max);
    }
}
