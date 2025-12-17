import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Library {

    private ArrayList<String> issuedBooks = new ArrayList<>();
    private ArrayList<String> borrowedBooks = new ArrayList<>();

    public void issueBook(String bookName) {
        issuedBooks.add(bookName);
        System.out.println("Issued: " + bookName);
    }

    public void borrowBook(String bookName) {
        borrowedBooks.add(bookName);
        System.out.println("Borrowed: " + bookName);
    }

    public void showIssuedBooks() {
        System.out.println("Issued Books: " + issuedBooks);
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
try {
    System.out.println("Enter the number of issued books:");
    int n = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter the issued book names:");
    for (int i = 0; i < n; i++) {
        library.issueBook(sc.nextLine());
    }

    System.out.println("Enter the number of borrowed books:");
    int num = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter the borrowed book names:");
    for (int i = 0; i < num; i++) {
        library.borrowBook(sc.nextLine());
    }

    System.out.println("\nAll Books:");
    library.showIssuedBooks();
    library.showBorrowedBooks();
}
catch (InputMismatchException e){
    System.out.println(e);
}
    }
}
