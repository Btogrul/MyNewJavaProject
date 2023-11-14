package Archive.mentor.zero_to_eight.M8;
public class Person {
    int id;
    String name;
    String lastName;
    int age;
    int numberOfFamilies;
    Building building;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", numberOfFamilies=" + numberOfFamilies +
                ", building=" + building +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFamilies() {
        return numberOfFamilies;
    }

    public void setNumberOfFamilies(int numberOfFamilies) {
        this.numberOfFamilies = numberOfFamilies;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}