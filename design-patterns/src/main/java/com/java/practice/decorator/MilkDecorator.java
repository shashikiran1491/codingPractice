package com.java.practice.decorator;

public class MilkDecorator extends CoffeeDecorator {

    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Added milk";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 12.0;
    }

}
