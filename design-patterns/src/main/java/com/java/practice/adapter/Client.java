package com.java.practice.adapter;

public class Client {

    public static void main(String[] args) {

        IPhone6s ip = new IPhone6s(new Iphone6To4sAdapter());
        ip.OnCharge();
    }

}
