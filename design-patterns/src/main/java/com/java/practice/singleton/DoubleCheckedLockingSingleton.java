package com.java.practice.singleton;

public class DoubleCheckedLockingSingleton {

    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        System.out.println(" ");
    }

    public static DoubleCheckedLockingSingleton getInstance() {

        if(instance == null) {

            synchronized (DoubleCheckedLockingSingleton.class) {

                if(instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;

    }


}
