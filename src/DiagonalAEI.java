public class DiagonalAEI {
    public static void main(String[] args) {

        char [][] myArr = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };



        System.out.println();

        for (int i = 0; i < myArr.length; i++) {

            for (int j = 0; j < myArr[i].length;j++) {

                System.out.print(myArr[i][j]);

            }
            System.out.println();

        }

        System.out.println("-------");

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i][i]);
        }




    }
}
