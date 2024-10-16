package com.java.coding.queue;

public class LinkedListQueue {

    Node front;
    Node rear;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        q.enqueue(10);

    }

    public void enqueue(int data) {
        if(front == null) {
            rear = new Node(data);
            front  = rear;
        }
        else {
            rear.next = new Node(data);
            rear = rear.next;
        }
        size++;
    }

    public int dequeue() {

        if(front != null) {
            int data = front.data;
            front = front.next;
            size--;
            return data;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void display() {
        if(front == null){
            return;
        }

        for(int i=0; i<size; i++) {
            Node n = front;
            System.out.println(n.data);
            n = n.next;

        }

    }
}
