
public class MyStack {
    /**
     * Implement a stack using linkedlist
     */

    class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    StackNode head;
    int top = 0;




    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();

        stack.show();

    }

    public void push(int num) {
        StackNode node = new StackNode(num);

        if (head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }


    public int pop() {
        if(head == null) {
            return -1;
        }

        StackNode temp = head.next;
        int data = head.data;
        head = temp;
        return data;
    }

    public void show() {
        if(head == null) {
            System.out.println("Stack is empty");
        }

        StackNode n = head;

        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
