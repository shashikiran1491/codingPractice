package com.squaretrade.template;

public class TeaMaker extends BeverageMaker{

    @Override
    public void boilWater() {
        System.out.println("Step1 : Boiling water in teaMaker");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Step4 : Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Step2 : Steeping the tea");
    }
}
