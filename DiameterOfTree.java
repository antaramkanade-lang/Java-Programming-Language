import java.util.*;

public class DiameterOfTree {
    // Approach 1: Here we have calculated height separately which increases time
    // complexity.
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDia = diameter2(root.right);
        int rightHt = height(root.right);
        int selfDia = leftHt + rightHt + 1;
        return Math.max(selfDia, Math.max(leftDia, rightDia));
    }

    // Approach 2: Here we will take out the whole info height and dia together.
    static class Info {
        int dia;
        int ht;

        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(dia, ht);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("diameter of a tree is: " + diameter2(root));
        System.out.println("diameter of a tree is: " + diameter(root).dia);
        System.out.println("height of a tree is: " + diameter(root).ht);
    }
}
