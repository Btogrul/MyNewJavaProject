package Archive.mentor.Month_4.M31;

import java.util.HashSet;
import java.util.Set;

public class NewTask {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("apple");
        setA.add("banana");
        setA.add("orange");
        setA.add("kiwi");




        Set<String> setB = new HashSet<>();
        setB.add("orange");
        setB.add("kiwi");
        setB.add("grape");
        setB.add("pear");




        Set<String> kesishme = new HashSet<>(setA);
        kesishme.retainAll(setB);

        System.out.println("kesihsme: " + kesishme);


        Set<String> total = new HashSet<>(setA);
        total.addAll(setB);
        System.out.println("total: " + total);


        Set<String> ferqler = new HashSet<>(setA);
        ferqler.removeAll(setB);

        System.out.println(ferqler);




    }



}
