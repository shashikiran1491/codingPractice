package com.java.practice.facade;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
