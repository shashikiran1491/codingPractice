package com.java.practice.facade;

public class HotelKeeperImpl implements HotelKeeper {
    @Override
    public Menu getVegMenu() {
        VegRestaurant r = new VegRestaurant();
       return r.getMenu();
    }

    @Override
    public Menu getNonVegMenu() {
        NonvegRestaurant nv = new NonvegRestaurant();
       return nv.getMenu();
    }
}
