package com.java.coding.bst;

public class SearchNode {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(root.data);
        }

    }


    public static void main(String[] args) {
        SearchNode sn = new SearchNode();
        sn.insert(10);
        sn.insert(8);
        sn.insert(12);
        sn.insert(4);
        sn.insert(2);

       // sn.display();
        sn.searchNode(4);
    }

    public void searchNode(int data) {

        while(root != null && root.data != data) {

            if(data < root.data) {
                root = root.left;
            } else if (data > root.data) {
                root = root.right;
            }
        }

        System.out.println(root);

    }


    public void insert(int data) {
       root = insertRecord(data, root);
    }

    public Node insertRecord(int data, Node root) {

        if(root == null){
            root = new Node(data);
        }

       else if(data < root.data) {
            root.left = insertRecord(data, root.left);
        }

        else if(data > root.data) {
            root.right =  insertRecord(data, root.right);
        }

        return root;
    }

    public void display() {
        displayRecord(root);
    }

    public void displayRecord(Node root) {
        if(root != null) {
            displayRecord(root.left);
            System.out.println(root.data);
            displayRecord(root.right);
        }
    }


}
