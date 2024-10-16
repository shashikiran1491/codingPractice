package com.java.practice.template;

public class CoffeeMaker extends BeverageMaker {
    @Override
    protected void addCondiments() {
        System.out.println("Step4 : Adding cocoa");
    }

    @Override
    protected void brew() {
        System.out.println("Step2 : Steeping the coffee");
    }
}
