package Archive.mentor.Month_4.M28.Task_28_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRecordSystem {
    List<Student> students;

    public StudentRecordSystem() {
        this.students = new ArrayList<>();
    }

    void add(Student student) {
        students.add(student);
    }

    void remove(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                return;
            }
        }
    }

    void display() {
        System.out.println("students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("==================");
    }

    void search(String role) {
        for (Student student : students) {
            if (student.getDepartment().equalsIgnoreCase(role)) {
                System.out.println(student);
            }
        }
        System.out.println("==================");
    }
}
