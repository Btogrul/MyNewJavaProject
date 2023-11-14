package Archive.mentor.nine_to_16.M14.Task_2;

public class Main {
    public static void main(String[] args) {
        Dog bulldog = new Dog("Havhav", "Woof", "Bulldog");
        Cat persianCat = new Cat("KittyCat", "Meow", "White");

        bulldog.makeSound();
        System.out.println("-------------");
        persianCat.makeSound();
    }
}
