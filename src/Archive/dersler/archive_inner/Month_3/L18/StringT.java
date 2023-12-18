package Archive.dersler.archive_inner.Month_3.L18;

public class StringT {
    public static void main(String[] args) {
        String word_1 = "trying";
        String word_2 = "something new";
        String text = word_1 + " " + word_2;
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.substring(7));
        System.out.println();
        System.out.println("------------");
        System.out.println();
        StringBuilder myText = new StringBuilder("A man's dreams are an index to his greatness.");
        myText.append(" - Floki/ Vinland Saga");
        myText.insert(0, "2023 // ");
        System.out.println(myText);


        System.out.println();
        System.out.println("------------");
        System.out.println();
        StringBuffer newString = new StringBuffer("Simple text");
        System.out.println(newString);

        Thread thr_1 = new Thread(() -> newString.append(" -  1"));
        Thread thr_2 = new Thread(() -> newString.append(" - 2"));

        thr_1.start();
        thr_2.start();

        try{
            thr_1.join();
            thr_2.join();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("using thr " + newString);
    }

}
