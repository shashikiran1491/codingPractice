package com.java.practice.example3;

public class Test1Impl {

    public static void main(String[] args) {

        //method1
        Test1 t = () -> System.out.println("Heloo");
        t.print();

        //method2
        printMe(() -> System.out.println("Hey I am calling print method"));

    }

    static void printMe(Test1 t){
        t.print();
    }

}
