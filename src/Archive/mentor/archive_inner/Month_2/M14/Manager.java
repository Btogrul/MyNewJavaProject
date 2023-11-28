package Archive.mentor.archive_inner.Month_2.M14;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Team Size: " + teamSize);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }
}
