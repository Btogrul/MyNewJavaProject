package Archive.mentor.Month_4.M31;

import java.util.HashMap;

public class StudentDatabase {
    HashMap<Integer, Student> studentMap;

    public StudentDatabase() {
        this.studentMap = new HashMap<>();
    }
    public void addStudent(int studentId, String name, int age) throws CustomException {
        if (studentMap.containsKey(studentId)) {
            throw new CustomException( studentId + " movcuddur.");
        }

        Student newStudent = new Student(studentId, name, age);
        studentMap.put(studentId, newStudent);

    }

    public String getStudentName(int studentId) throws CustomException {
        if (!studentMap.containsKey(studentId)) {
            throw new CustomException( studentId + " yoxdur ");
        }
        return studentMap.get(studentId).getName();
    }

    public int getStudentAge(int studentId) throws CustomException {
        if (!studentMap.containsKey(studentId)) {
            throw new CustomException( studentId + " yoxdur ");
        }

        return studentMap.get(studentId).getAge();

    }

}
