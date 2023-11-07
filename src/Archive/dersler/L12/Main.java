package Archive.dersler.L12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Library name:");
        String libraryName = sc.nextLine();
        System.out.println("Library size:");
        int librarySize = sc.nextInt();

        Library library = new Library(libraryName, librarySize);
        Member newMember;

        for (int i = 0; i < librarySize; i++) {
            library.addBook(i);
        }

        System.out.println("New member id:");
        int id_member = sc.nextInt();
        sc.nextLine();

        System.out.println("Member name:");
        String member_name = sc.nextLine();

        System.out.println("How many books do you want to borrow?");
        int numBooksToBorrow = sc.nextInt();
        sc.nextLine();

        Book[] member_books = new Book[numBooksToBorrow];

        for (int i = 0; i < numBooksToBorrow; i++) {
            System.out.println("Enter the title of the book you want to borrow:");
            String bookTitle = sc.nextLine();


            Book bookToBorrow = null;
            for (Book book : library.getBooks()) {
                if (book != null && book.equals(new Book(0, "", bookTitle, 0))) {
                    bookToBorrow = book;
                    break;
                }
            }

            if (bookToBorrow != null) {
                member_books[i] = bookToBorrow;
            } else {
                System.out.println("The book with the specified title is not available in the library.");
            }
        }

        
        newMember = new Member(id_member, member_name, member_books);

        library.displayBooks();

        if (newMember != null) {
            System.out.println("Books borrowed by " + newMember.getName() + ":");
            for (Book book : newMember.getBorrowedBooks()) {
                if (book != null) {
                    System.out.println(book);
                }
            }
        }
    }
}
