import java.util.ArrayList;
import java.util.Scanner;

//book class
class Book {
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

//library class
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added successfully: " + title);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + book.title + " by " + book.author + " (" + (book.isIssued ? "Issued" : "Available") + ")");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.isIssued) {
                    book.isIssued = true;
                    System.out.println("Book issued successfully: " + book.title);
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isIssued) {
                    book.isIssued = false;
                    System.out.println("Book returned successfully: " + book.title);
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println("- " + book.title + " by " + book.author + " (" + (book.isIssued ? "Issued" : "Available") + ")");
        }
    }
}

//main class
public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        library.addBook("Palace", "Raja Rao");
        library.addBook("Atomic", "James Clear");
        library.addBook("Gitanjali", "Rabindranath Tagore");
        library.addBook("Trainspotting", "irvine Welsh");



        while (true) { 
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Book");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                System.out.print("Enter book title: ");
                String newTitle = sc.nextLine();
                System.out.print("Enter author name: ");
                String newAuthor = sc.nextLine();
                library.addBook(newTitle, newAuthor);
                break;

                case 2:
                System.out.print("Enter book title to search: ");
                String searchTitle = sc.nextLine();
                library.searchBook(searchTitle);

                break;

                case 3:
                System.out.print("Enter book title to issue: ");
                String issueTitle = sc.nextLine();
                library.issueBook(issueTitle);

                break;

                case 4:
                System.out.print("Enter book title to return: ");
                String returnTitle = sc.nextLine();
                library.returnBook(returnTitle);
                break;

                case 5:
                System.out.print("Displaying all books: ");
                library.displayBooks();
                break;

                case 6:
                System.out.println("Exiting... Goodbye!");
                sc.close();
                System.exit(0);
                break;

                default:
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    }
    
