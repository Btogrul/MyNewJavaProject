package Archive.mentor.Month_4.M28.Task_28_1;

public class Main {
    public static void main(String[] args) {
        StudentRecordSystem studentRecordSystem = new StudentRecordSystem();

        Student bot_1 = new Student(1, "lucian", "adc");
        Student bot_2 = new Student(2, "senna", "support");
        Student bot_3 = new Student(3, "garen", "warrior");

        studentRecordSystem.add(bot_1);
        studentRecordSystem.add(bot_2);
        studentRecordSystem.add(bot_3);

        studentRecordSystem.display();

        studentRecordSystem.remove(2);

        studentRecordSystem.display();
        System.out.println("-----------");
        studentRecordSystem.search("warrior");
    }
}
