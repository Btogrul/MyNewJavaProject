package Archive.mentor.M11;

public class StringManipulation {
    public static void main(String[] args) {
        String myText= "Hello Me";

        System.out.println("toplam uzunluq " + myText.trim().length());
        System.out.println( myText.toUpperCase());
        System.out.println(myText.toLowerCase());
        System.out.println(myText.startsWith("A"));
        System.out.println(myText.endsWith("E"));
        System.out.println(myText.replace("e","E"));

        String[] words = myText.split(" ");
        System.out.println("------");


        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("------");

        System.out.println(myText.indexOf("o"));



        String substring = myText.substring(4, 7);
        System.out.println(substring);
    }
}
