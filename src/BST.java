/**
 * The BST class represents a binary search tree to efficiently manage books within the library.
 * Each book in the library is represented as a node in the BST.
 */
public class BST {
    private TreeNode root; // The root node of the binary search tree

    /**
     * Constructs an empty binary search tree.
     */
    public BST() {
        root = null;
    }

    /**
     * Inserts a new book into the binary search tree.
     * @param book The book to be inserted.
     */
    public void insert(Book book) {
        root = insertRecursive(root, book);
    }

    private TreeNode insertRecursive(TreeNode root, Book book) {
        if (root == null) {
            return new TreeNode(book);
        }

        if (book.getTitle().compareToIgnoreCase(root.getBook().getTitle()) < 0) {
            root.setLeft(insertRecursive(root.getLeft(), book));
        } else if (book.getTitle().compareToIgnoreCase(root.getBook().getTitle()) > 0) {
            root.setRight(insertRecursive(root.getRight(), book));
        }

        return root;
    }

    /**
     * Performs an inorder traversal of the binary search tree and prints the books.
     */
    public void inorderTraversal() {
        inorderRecursive(root);
    }

    private void inorderRecursive(TreeNode root) {
        if (root != null) {
            inorderRecursive(root.getLeft());
            System.out.println(root.getBook());
            inorderRecursive(root.getRight());
        }
    }

    /**
     * Searches for a book with the given title in the binary search tree.
     * @param title The title of the book to search for.
     * @return The node containing the book if found, null otherwise.
     */
    public TreeNode search(String title) {
        return searchRecursive(root, title);
    }

    private TreeNode searchRecursive(TreeNode root, String title) {
        if (root == null || root.getBook().getTitle().equalsIgnoreCase(title)) {
            return root;
        }

        if (title.compareToIgnoreCase(root.getBook().getTitle()) < 0) {
            return searchRecursive(root.getLeft(), title);
        }

        return searchRecursive(root.getRight(), title);
    }

    /**
     * Deletes a book with the given title from the binary search tree.
     * @param title The title of the book to delete.
     */
    public void delete(String title) {
        root = deleteRecursive(root, title);
    }

    private TreeNode deleteRecursive(TreeNode root, String title) {
        if (root == null) {
            return null;
        }

        if (title.compareToIgnoreCase(root.getBook().getTitle()) < 0) {
            root.setLeft(deleteRecursive(root.getLeft(), title));
        } else if (title.compareToIgnoreCase(root.getBook().getTitle()) > 0) {
            root.setRight(deleteRecursive(root.getRight(), title));
        } else {
            // Node with only one child or no child
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.setBook(minValue(root.getRight()).getBook());

            // Delete the inorder successor
            root.setRight(deleteRecursive(root.getRight(), root.getBook().getTitle()));
        }

        return root;
    }

    private TreeNode minValue(TreeNode root) {
        TreeNode current = root;

        while (current.getLeft() != null) {
            current = current.getLeft();
        }

        return current;
    }
}
