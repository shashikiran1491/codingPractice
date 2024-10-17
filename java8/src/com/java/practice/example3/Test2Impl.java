package com.java.practice.example3;

public class Test2Impl {

    public static void main(String[] args) {

        Test2 t2 = (x, y) -> {
            System.out.println("Print a and b : "+x +" : "+y);
        };
        t2.print(5, 6);

        printMe((a , b) -> System.out.println("Can I print a and b? "+a +" : "+b), 5, 6);

    }

    public static void printMe(Test2 t2, int a, int b){
        t2.print(a, b);
    }

}
