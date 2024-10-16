package com.squaretrade.template;

public abstract class BeverageMaker {

    public final void makeBeverage() {
        boilWater();
        brew();
        pourinCup();
        addCondiments();
    }

    protected abstract void addCondiments();
    protected abstract void brew();

    public void boilWater() {
        System.out.println("Step1 : Boiling water");
    }

    private void pourinCup() {
        System.out.println("Step3 : pouring into the cup");
    }


}
