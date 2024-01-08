package Archive.mentor.Month_4.M28.Task_27_1;

public class Main {
    public static void main(String[] args) {
        Library new_center = new Library();
        Book exmp_book =new Book("1", "title", "Mr.Testing something", 1 );
        Book exp_book_2 = new Book("2", "some new title", "Mr.X",3);
        Book exp_book_3 = new Book("3", "some new other title", "Mr.Y",3);

        new_center.add_book(exmp_book);
        new_center.add_book(exp_book_2);
        new_center.add_book(exp_book_3);
        new_center.print_library();

        new_center.get_book("3");

        new_center.remove_book("2");


        new_center.print_library();


    }
}
