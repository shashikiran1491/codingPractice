package com.java.practice.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;

    }


    public static void main(String[] args) {

        Singleton s1 = getInstance();
        Singleton s2 = getInstance();

        System.out.println(s1 == s2);

    }


}
