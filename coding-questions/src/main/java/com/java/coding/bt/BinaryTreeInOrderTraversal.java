package com.java.coding.bt;

public class BinaryTreeInOrderTraversal {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        BinaryTreeInOrderTraversal tree = new BinaryTreeInOrderTraversal();
        tree.insert(8);
        tree.insert(7);
        tree.insert(2);
        tree.insert(10);
        tree.insert(15);
        tree.inOrder();

    }

    public void inOrder() {
        inOrderTraversal(root);

    }

    public void inOrderTraversal(Node root) {

        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data);
            inOrderTraversal(root.right);

        }
    }


    public void insert(int data) {
        root = insertRecord(data, root);
    }


    public Node insertRecord(int data, Node root) {

        Node node = new Node(data);

        if(root == null) {
            root = node;
        } else if(data < root.data) {
           root.left = insertRecord(data, root.left);
        } else {
            root.right = insertRecord(data, root.right);
        }

        return root;
    }
}
