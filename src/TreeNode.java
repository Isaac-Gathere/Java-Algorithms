/**
 * Represents a node in a binary search tree (BST).
 */
public class TreeNode {
    private Book book; // The book associated with this node
    private TreeNode left; // The left child of this node
    private TreeNode right; // The right child of this node

    /**
     * Constructs a new TreeNode with the specified book.
     *
     * @param book The book associated with this node.
     */
    public TreeNode(Book book) {
        this.book = book;
        left = null;
        right = null;
    }

    /**
     * Retrieves the book associated with this node.
     *
     * @return The book associated with this node.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Sets the book associated with this node.
     *
     * @param book The new book associated with this node.
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * Retrieves the left child of this node.
     *
     * @return The left child of this node.
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * Sets the left child of this node.
     *
     * @param left The new left child of this node.
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * Retrieves the right child of this node.
     *
     * @return The right child of this node.
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * Sets the right child of this node.
     *
     * @param right The new right child of this node.
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }
}
