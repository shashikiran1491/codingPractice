package com.java.practice.template;

public class Client {

    public static void main(String[] args) {

        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println();

        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();


    }

}
