package com.squaretrade.observer.observer;

public class PhoneObserver implements Observer{

    private String weather;

    @Override
    public void update(String weather) {
     this.weather = weather;
     display();
    }

    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
