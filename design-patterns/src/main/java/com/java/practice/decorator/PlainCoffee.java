package com.java.practice.decorator;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "plain coffee";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}
