package com.java.coding.linkedlist;

public class LinkedListV1 {

    Node head;

    public static void main(String[] args) {

        LinkedListV1 list = new LinkedListV1();
        list.insert(2);
        list.insert(5);
        list.insert(3);

        //list.findKthNodeFromTheEnd(2);
        list.reverseLinkedList();


    }


    public void reverseLinkedList() {

        Node prev = null;
        Node curr = head;

        while(curr != null) {
         Node temp = curr.next;
         curr.next = prev;
         prev = curr;
         curr = temp;

        }

        show(prev);

    }

    public static void show(Node head) {

        if(head == null) {
            return;
        }

        Node n = head;

        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;

        }

        System.out.println(n.data);

    }

    /**
     * Find nth node from the end using two pointetrs
     *
     *
     */

    public void findKthNodeFromTheEnd(int k) {

        Node main_ptr = head;
        Node ref_ptr = head;

        while(k > 0) {
           ref_ptr = ref_ptr.next;
           k--;
        }

        while(ref_ptr != null) {
            ref_ptr = ref_ptr.next;
            main_ptr = main_ptr.next;
        }

        System.out.println("Printing kth element : "+main_ptr.data);

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

}
