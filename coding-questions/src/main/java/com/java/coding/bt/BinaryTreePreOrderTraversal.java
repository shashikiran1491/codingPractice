package com.java.coding.bt;

import java.util.Stack;

public class BinaryTreePreOrderTraversal {

    //TODO : Pre-order traversal by recursion

    /**
     * Inorder traversal - left  - root - right
     *
     * PreOrder Traversal - Root - left - right (Iteratively) Use a stack
     *
     *
     */


    Node root;

    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        BinaryTreePreOrderTraversal bt = new BinaryTreePreOrderTraversal();
        bt.insert(8);
        bt.insert(7);
        bt.insert(2);
        bt.insert(10);
        bt.insert(15);

        //bt.inOrder();
        //bt.preOrderTraversal();
        //bt.preOrder();
    }

    private void insert(int data) {
        root = insertRecord(data, root);
    }

    private Node insertRecord(int data, Node root) {

        if (root == null) {
            root = new Node(data);
        } else if(data < root.data) {
           root.left =  insertRecord(data, root.left);
        } else if(data > root.data) {
           root.right = insertRecord(data, root.right);
        }
        return root;
    }


    private void preOrder() {
        preOrder(root);
    }



    private void preOrder(Node root) {

        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }




    // pre-order traversal iterative method
    private void preOrderTraversal() {

        Stack<Node> stack = new Stack<Node>();

        stack.push(root);

        while(!stack.isEmpty()) {
          root = stack.pop();
            System.out.println(root.data);

            if(root.right != null) {
                stack.push(root.right);
            }

            if(root.left != null) {
                stack.push(root.left);
            }
        }
    }


    //in order traversal recursive method
    private void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {

        if(root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);

        }
    }
}
