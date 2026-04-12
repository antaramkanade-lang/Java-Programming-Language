import java.util.*;

public class CheckSubtreeInATree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Here node is describing the identical ones in a tree.
    public static boolean isIdentical(Node node, Node subRoot) {
        // here we will check the statements for non-identical
        if (node == null && subRoot == null) {// this is identical.
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        // if right or left any one subtree is identical then return true.
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String args[]) {
        // Tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // SubTree:
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot)); // gives True.
    }
}
