import java.util.Scanner;

public class TaskNew {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        char [][] myArr = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        System.out.println("Enter row number ");
        int row = sc.nextInt();

        System.out.println();

        System.out.println("Enter column number ");
        int column = sc.nextInt();
        System.out.println();

        for (int i = 0; i < myArr.length-1; i++) {



            for (int j = 0; j < myArr[i].length;j++) {

                System.out.print(myArr[i][j]    );
                if (myArr[row][j] == myArr[i][column]){
                    System.out.println();
                    System.out.println(myArr[row][column]);
                }

            }
        }




//        if (row >= 0 && row < myArr.length && column >= 0 && column < myArr[row].length) {
//            char element = myArr[row][column];
//            System.out.println(" Elementimiz setr" + row + " Sutunumuz  ise " + column + "   <=====>    " + element);
//        } else {
//            System.out.println("Xetamiz var ");
//        }
    }
}
