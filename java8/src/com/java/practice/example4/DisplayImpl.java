package com.java.practice.example4;

public class DisplayImpl implements Display{

    public static void main(String[] args) {

     DisplayImpl dimpl = new DisplayImpl();
     dimpl.show("Hello");

     System.out.println(dimpl.sum(2, 3));

    }

    @Override
    public void show(String msg) {
        System.out.println("I implement Display : "+ msg);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
