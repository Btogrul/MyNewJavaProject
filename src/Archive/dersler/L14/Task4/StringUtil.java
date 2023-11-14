package Archive.dersler.L14.Task4;

public class StringUtil {
    public void stringCon(String input1 , String input2){
        System.out.println(input1.concat(input2));
    }

    public void stringUpper(String input1){
        System.out.println(input1.toUpperCase());
    }

    public void stringReverse(String input2){
        char[] charArray = input2.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println(" ");

    }

}


//method overload - eyni adda olub ferqli parametrler dashiyanda deyilir