package com.java.coding.queue;

public class MyQueue {

    int[] arr = new int[5];
    int front  = -1;
    int rear = -1;
    int size = 0;

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
       // q.enqueue(20);
       // q.enqueue(30);
       // q.enqueue(40);
       // q.enqueue(50);
        q.dequeue();
       // q.enqueue(60);
        System.out.println(q.size);
        q.print();
    }

    private void print() {
        for(int i=0; i<size; i++) {
            System.out.println(arr[front % arr.length]);
            front++;
        }
    }


    public void enqueue(int data) {

        if(size == arr.length) {
            System.out.println("Queue is full");
        }

        rear = (rear + 1) % arr.length;
        size++;
        arr[rear] = data;


    }

    public void dequeue() {

        if(size == 0){
            System.out.println("Queue is empty");
        }

        front = (front+1) % arr.length;
        size--;

    }


  /*

    public void enqueue(int data) {

        if((rear + 1) % arr.length == front) {
            System.out.println("Queue is full");
            return;
        }

        else if(front == -1 && rear == -1) {
            front++;
            rear++;
        }

        else {
            rear = (rear + 1) % arr.length;
        }

        arr[rear] = data;
        size++;
    }

    public void dequeue() {

        if(front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            return;
        } else if(front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
            size--;
        }

    }
*/

}
