package com.squaretrade.facade;

public class NonvegRestaurant implements Hotel{

    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
