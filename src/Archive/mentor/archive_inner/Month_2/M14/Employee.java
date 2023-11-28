package Archive.mentor.archive_inner.Month_2.M14;

public class Employee {
    private String name;
    private double salary;





    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }




    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
