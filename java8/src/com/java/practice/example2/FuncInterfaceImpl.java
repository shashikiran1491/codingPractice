package com.java.practice.example2;

public class FuncInterfaceImpl {

    public static void main(String[] args) {

        FuncInterface fI = (a, b) -> a + b;
        int sum = fI.operation(2, 3);

        System.out.println("Printing sum :"+sum);

        FuncInterface fI1 = (a, b) -> a * b;
        int mul = fI1.operation(4, 5);

        System.out.println("Printing mul :"+mul);


    }

}
