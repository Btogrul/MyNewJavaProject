package Archive.dersler.Month_3.L20;

public class Pair<T extends String, X extends Number> {
    T value;
    X value2;

    public Pair(T value, X value2) {
        this.value = value;
        this.value2 = value2;
    }


    void test(){
        System.out.println(this.value + " " + this.value2);
    }



}
