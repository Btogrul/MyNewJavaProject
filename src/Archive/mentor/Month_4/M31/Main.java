package Archive.mentor.Month_4.M31;

public class Main {

    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();

        try {

            database.addStudent(1, "A", 17);
            database.addStudent(2, "B", 18);
            database.addStudent(3, "C", 19);



            database.addStudent(1, "A", 17);

            System.out.println(database.getStudentName(1) );
            System.out.println(database.getStudentName(2) );

            System.out.println( database.getStudentName(5) );

        } catch (CustomException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
