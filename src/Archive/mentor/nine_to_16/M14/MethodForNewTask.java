package Archive.mentor.nine_to_16.M14;

public class MethodForNewTask {
    public static void length(String cumle) {


        cumle = cumle.trim();



        String[] sozler = cumle.split(" ");



        int index = sozler.length - 1;




        String lastWord = sozler[index];



        System.out.println(lastWord.length());
    }
}
