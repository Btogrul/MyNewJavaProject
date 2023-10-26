package Archive.dersler.L9;

public class Author {
    String name;
    int birthYear;



    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Author() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }




    @Override
    public String toString() {
        return "Yazıçı{" +
                "Adı:'" + name + '\'' +
                ", doğum tarixi: " + birthYear +
                '}';
    }

}
