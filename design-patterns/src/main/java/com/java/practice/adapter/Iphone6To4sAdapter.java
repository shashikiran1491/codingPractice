package com.java.practice.adapter;

public class Iphone6To4sAdapter implements Charger {

    Iphone4sCharger iphone4sCharger;

    Iphone6To4sAdapter() {
        iphone4sCharger = new Iphone4sCharger();
    }

    @Override
    public void charge() {
        iphone4sCharger.charge();
    }
}
