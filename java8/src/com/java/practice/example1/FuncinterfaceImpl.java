package com.java.practice.example1;

public class FuncinterfaceImpl {

    public static void main(String[] args) {

        FuncInterface fI = x -> System.out.println("Printing x : "+x);
        fI.run(5);

        FuncInterface fI1 = x -> print(x);
        fI1.run(10);

    }

    private static void print(int x) {
        System.out.println("I am inside print method : "+x);
    }

}
