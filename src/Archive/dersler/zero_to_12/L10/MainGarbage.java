package Archive.dersler.zero_to_12.L10;

public class MainGarbage {
    public static void main(String[] args) {
        GarbageCollectionDemo delete = new GarbageCollectionDemo();


        String [] humans = new String[]{"Asd","bsd","tsd0"};
        String [] pets = new String []{"Dog","Cat", "Fox"};
        pets = null;
        delete.runGarbageCollector();
        for (int i = 0; i < 3; i++) {
            System.out.print(humans[i] + " ");

        }






    }
}
