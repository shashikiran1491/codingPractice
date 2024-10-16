package com.squaretrade.adapter;

public class Iphone4sCharger implements  Charger {

    @Override
    public void charge() {
        System.out.println("charging with 4s charger");
    }
}
