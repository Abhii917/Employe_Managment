package Arrays_DSA;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;

public class createTree {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        Node ans = Create();
        inOrder(ans);
        System.out.println();
        preOrder(ans);
        System.out.println();
        PostOrder(ans);
        System.out.println();

    }

    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void PostOrder(Node root) {
        if (root == null)
            return;

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(" " + root.data);
    }

    static Node Create() {
        Node root = null;

        System.out.println("enter data:");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter data for left " + data);
        root.left = Create();

        System.out.println("Enter data for right " + data);
        root.right = Create();

        return root;
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}
