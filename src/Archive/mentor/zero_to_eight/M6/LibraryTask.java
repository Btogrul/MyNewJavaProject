package Archive.mentor.zero_to_eight.M6;

import java.util.Scanner;

public class LibraryTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many books would you like to add? ");
        int totalBooks = sc.nextInt();

        if (totalBooks <= 0 ){
            System.out.println(" comeback when you will have some books to add ");
            return;
        }

        sc.nextLine();

        String[][] booksList = new String[totalBooks][2];

        for (int i = 0; i < booksList.length; i++) {
            for (int j = 0; j < booksList[i].length - 1; j++) {
                System.out.print((i + 1) + " Book name: ");
                booksList[i][j] = sc.nextLine();
                System.out.println();
                if (booksList[i][j] != "") {
                    System.out.print((i + 1) + " Author name: ");
                    booksList[i][j+1] = sc.nextLine();
                } else {
                    System.out.println("Please fill out the information.");
                    return;
                }
                System.out.println("-----------");
            }
        }

        for (int i = 0; i < booksList.length; i++) {
            for (int j = 0; j < booksList[i].length - 1 ; j++) {
                System.out.println("Book name:  " + booksList[i][j]);
                System.out.println("Author:  " + booksList[i][j + 1]);
            }
            System.out.println("------------");
        }
    }
}