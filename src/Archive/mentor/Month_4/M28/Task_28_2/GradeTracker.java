package Archive.mentor.Month_4.M28.Task_28_2;

import java.util.HashMap;
import java.util.Map;

public class GradeTracker {
    Map<String, Integer> grades;
    Map<String, Integer> counts;

    public GradeTracker() {
        this.grades = new HashMap<>();
        this.counts = new HashMap<>();
    }

    public void addStudent(String studentName) {
        grades.put(studentName, 0);
        counts.put(studentName, 0);
        System.out.println("Student added: " + studentName);
    }


    public void add_grade(String studentName, int grade) {
            int x = grades.get(studentName);
            int y = counts.get(studentName);
            grades.put(studentName, x + grade);
            counts.put(studentName, y + 1);
    }

}
