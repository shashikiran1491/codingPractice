package com.squaretrade.decorator;

public class SugarDecorator extends CoffeeDecorator{

    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Sugar";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 10;
    }

}
