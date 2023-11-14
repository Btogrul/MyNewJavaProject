package Archive.dersler.zero_to_12.L10;

public class ObjectForMemoryDemo {
    String name;
    Integer dateOfBirth;
    Boolean student;


    public ObjectForMemoryDemo(String name, Integer dateOfBirth, Boolean student) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.student = student;
    }

    @Override
    public String toString() {
        return "ObjectForMemoryDemo{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", student=" + student +
                '}';
    }
}
