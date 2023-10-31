package Archive.mentor.M10;

public class ArrayTaskReverse {
    public static void main(String[] args) {
        String [] newArr = new String[]{"hello", "world"};

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }



        System.out.println();
        System.out.println("----------");


        for (int i = newArr.length - 1; i >= 0; i--) {
            System.out.print(newArr[i] + " ");
        }
    }
}
