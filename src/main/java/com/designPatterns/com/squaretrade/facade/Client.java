package com.squaretrade.facade;

public class Client {

    public static void main(String[] args) {

        HotelKeeper hk = new HotelKeeperImpl();
        System.out.println(hk.getVegMenu().getItems());
        System.out.println(hk.getNonVegMenu().getItems());

    }
}
