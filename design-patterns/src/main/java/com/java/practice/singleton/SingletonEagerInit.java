package com.java.practice.singleton;

public class SingletonEagerInit {

    private static SingletonEagerInit instance = new SingletonEagerInit();

    private SingletonEagerInit() {

    }

    public static SingletonEagerInit getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        SingletonEagerInit s1 = getInstance();
        SingletonEagerInit s2 = getInstance();

        System.out.println(s1==s2);

    }
}
