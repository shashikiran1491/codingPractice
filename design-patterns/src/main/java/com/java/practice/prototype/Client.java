package com.java.practice.prototype;

public class Client {

    public static void main(String[] args) {

        Circle c = new Circle("red");
        Shape clonedCircle = c.clone();

        System.out.println(clonedCircle);


    }

}
