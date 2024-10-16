import java.util.Stack;

public class BinaryTreePostOrderTraversal {

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
        BinaryTreePostOrderTraversal bt = new BinaryTreePostOrderTraversal();
        bt.insert(8);
        bt.insert(7);
        bt.insert(2);
        bt.insert(10);
        bt.insert(15);
       // bt.postOrderTraversal();
        bt.postOrder();
    }


    //recursion
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node root) {
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }


    //iterative method using two stacks
    public void postOrderTraversal() {
        Stack<Node> st1 = new Stack();
        Stack<Node> st2 = new Stack();

        st1.push(root);

        while(!st1.isEmpty()) {
            root = st1.pop();
            st2.push(root);

            if(root.left != null) {
                st1.push(root.left);
            }

            if(root.right != null) {
                st1.push(root.right);
            }
        }

        while(!st2.isEmpty()) {
            System.out.println(st2.pop().data);
        }
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



}
