package Archive.dersler.zero_to_12.L9;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        ----------------------------------
        System.out.println("Yeni kitab elave etmek isteyirsiz ?  yes/no");
        String user_input =sc.nextLine();



        if (user_input.equals("yes")){

            System.out.print("Elave olunacaq kitablarin sayini qeyd edin: ");
            int total_books= sc.nextInt();


            System.out.println(" neçə yeni yazıçı olacaq ? ");
            int count_of_authors = sc.nextInt();


            if (total_books > 0 || count_of_authors >0){

                Book [] new_books = new Book[total_books];
                Author [] author_new_list = new Author[count_of_authors];
                for (int i = 0; i < count_of_authors; i++) {



                    author_new_list[i] = new Author();
                    sc.nextLine();
                    System.out.print("Yazıçının adını daxil edin: ");
                    author_new_list[i].setName(sc.nextLine());
                    System.out.print("Yazıçının doğum ilini daxil edin: ");
                    author_new_list[i].setBirthYear(sc.nextInt());


                    for (int j = 0; j < total_books; j++) {
                        sc.nextLine();
                        new_books[j] = new Book();
                        System.out.print("Kitabın adı: ");
                        new_books[j].setTitle(sc.nextLine());
                        System.out.print("Nəşr ili: ");
                        new_books[j].setPublicationYear(sc.nextInt());
                        new_books[j].author = author_new_list[i];


                    }

                }

                for (int i = 0; i < count_of_authors; i++) {
                    System.out.println("--------------");
                    System.out.println( new_books[i].getAuthor());
                    for (int j = 0; j < total_books; j++) {
                        System.out.println(" kitabin adi: "  +  new_books[j].getTitle() + " Nəşr ili: " + new_books[j].getPublicationYear());
                    }
                    System.out.println("--------------");
                }

            }else{
                System.out.println("Qeyd xetasi");
            }




        } else if (user_input.equals("no")) {
            Author author = new Author("J.K. Rowling", 1965);
            Book book = new Book(author, "Harry Potter and the Philosopher's Stone", 1997);
            Author author_1 = new Author("George Orwell", 1903);
            Book book_1 = new Book(author_1,"To Kill a Mockingbird", 1968);


            System.out.println(book);
            System.out.println("--------------");
            System.out.println(book_1);
            System.out.println("--------------");

/*           System.out.println(book.getAuthor());
           System.out.println(book.getTitle() + book.getPublicationYear()); */


        }else {
            System.out.println(" Xeta ");
        }


    }
}
