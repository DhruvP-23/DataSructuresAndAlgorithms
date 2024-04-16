package Trees;

import java.util.Comparator;

/**
 * Represents a binary tree data structure.
 * @param <T> the type of elements stored in the binary tree
 */
public class BinaryTree<T> {
    // Class containing parent Node, left and right child
    // of current node and key value
    class Node {
        T key;
        Node left, right, parent;

        public Node(T item) {
            key = item;
            left = right = parent = null;
        }
    }

    /**
     * Levels of this binary tree
     */
    protected int l;

    /**
     * Number of nodes in this binary tree
     */
    protected int n;

    /**
     * nil Node of this binary tree
     */
    protected Node nil;

    /**
     * Root Node of this binary tree
     */
    protected Node root;

    /**
     * Constructs an empty binary tree.
     */
    public BinaryTree() {
        nil = new Node(null);
        root = nil;
        n = 0;
        l = 0;
    }

    /**
     * Returns the number of nodes in this binary tree.
     * @apiNote RUNTIME: O(1)
     * @return the number of nodes in this binary tree
     */
    public int size() {
        return n;
    }

    /**
     * Returns the number of levels in this binary tree.
     * @apiNote RUNTIME: O(1)
     * @return the number of levels in this binary tree
     */
    public int levels() {
        return l;
    }

    /**
     * Checks if this binary tree is empty.
     * @apiNote RUNTIME: O(1)
     * @return true if this binary tree is empty, false otherwise
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Adds an element to this binary tree.
     * @param x the element to add
     * @apiNote RUNTIME: O(log n)
     * @return true if the element was added, false otherwise
     */
    public boolean add(T x){
        return false;
    }
}

