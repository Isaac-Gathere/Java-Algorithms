/**
 * Name
 * Date
 * The Main class contains the main method to run the Library Management System program.
 * It provides a menu for library staff to add, remove, search, and display books.
 */
import java.util.Scanner;

public class Main {

    /**
     * The main method to run the Library Management System program.
     * It displays a menu for library staff to interact with the system.
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates an instance of LibraryManagementSystem to manage the library
        LibraryManagementSystem lms = new LibraryManagementSystem();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Displays the Library Management System menu
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            // Perform actions based on user's choice
            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.println("\nEnter book details:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    lms.addBook(new Book(title, author, ISBN, genre));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    // Remove a book
                    System.out.print("\nEnter the title of the book to remove: ");
                    String removeTitle = scanner.nextLine();
                    lms.removeBook(removeTitle);
                    System.out.println("Book removed successfully!");
                    break;
                case 3:
                    // Search for a book
                    System.out.print("\nEnter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    lms.searchBook(searchTitle);
                    break;
                case 4:
                    // Display all books
                    lms.displayBooks();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter a number from 1 to 5.");
                    break;
            }
        } while (choice != 5); // Continue the loop until the user chooses to exit

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
