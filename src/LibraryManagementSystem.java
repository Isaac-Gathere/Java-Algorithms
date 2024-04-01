/**
 * The LibraryManagementSystem class represents a library management system that utilizes a binary search tree (BST)
 * to efficiently manage books within the library.
 */
public class LibraryManagementSystem {
    private BST library; // The binary search tree to store library books

    /**
     * Constructs a new LibraryManagementSystem with an empty library.
     */
    public LibraryManagementSystem() {
        library = new BST();
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        library.insert(book);
    }

    /**
     * Removes a book from the library based on its title.
     * @param title The title of the book to be removed.
     */
    public void removeBook(String title) {
        library.delete(title);
    }

    /**
     * Searches for a book in the library based on its title.
     * @param title The title of the book to search for.
     */
    public void searchBook(String title) {
        TreeNode result = library.search(title);
        if (result != null) {
            System.out.println("Book found: " + result.getBook());
        } else {
            System.out.println("Book not found.");
        }
    }

    /**
     * Displays all the books in the library in sorted order.
     */
    public void displayBooks() {
        System.out.println("Library Books:");
        library.inorderTraversal();
    }
}
