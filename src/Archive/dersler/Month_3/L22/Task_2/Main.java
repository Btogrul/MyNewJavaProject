package Archive.dersler.Month_3.L22.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("D", 17, 50));
        students.add(new Student("C", 19, 51));
        students.add(new Student("B", 18, 70));




        Collections.sort(students, (a, b) -> a.getName().compareTo(b.getName()));



        for (Student student : students) {
            System.out.println(student);
        }


    }
}
