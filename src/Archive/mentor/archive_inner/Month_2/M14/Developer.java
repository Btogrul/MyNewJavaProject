package Archive.mentor.archive_inner.Month_2.M14;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
