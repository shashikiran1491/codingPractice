package com.squaretrade.decorator;

public class Client {

    public static void main(String[] args) {

        PlainCoffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() +" : " +coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() +" : " +milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarCoffee.getDescription() + " : " +sugarCoffee.getCost());

    }

}
