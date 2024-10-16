public class LinkedList {

    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        if(head == null) {
            System.out.println("No elements in the list");
        }

        Node n = head;

        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public int length() {
        if(head == null) {
            return 0;
        }

        int length = 0;
        Node n = head;

        while(n.next != null){
            length++;
            n = n.next;
        }
    return length+1;
    }

    public void middleElement() {
       int length = length();
       int middleElement = length/2;

       Node n = head;
       int count = 0;

       while(count < middleElement){
           n=n.next;
           count++;
       }
        System.out.println("Middle element is : "+ n.data);

    }

    /**
     * find nth node from end of the linked list
     * Given the head of a linked list and the number k, Your task is to find the kth node from the end.
     * If k is more than the number of nodes, then the output should be -1.
     *
     * if linkedlist is {2, ,5, 3, 4, 6, 2}
     * 2nd node from end is 6. O/p = 6
     */

    public void findNthNodeFromTheEnd(int k) {

        if(head == null) {
            return;
        }


        //if k=2; length 6-2 = 4th and start index = 0

        int length = length();
        int index = length - k;

        Node n = head;

        for(int i=0; i<index; i++) {
            n = n.next;
        }

        System.out.println("Printing nth node from the end : "+n.data);

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.insert(7);

        list.show();
        //System.out.println("Length is : "+list.length());
        //list.middleElement();
        //list.findNthNodeFromTheEnd(2);
    }
}
