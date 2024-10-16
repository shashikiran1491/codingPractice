package com.squaretrade.adapter;

/**
 *  Assuming u do not have a separate charger for Iphone6s and u have to
 *  use Iphone4s charger
 *
 */

public class IPhone6s implements  Iphone{
    Iphone6To4sAdapter adapter;

    public IPhone6s(Iphone6To4sAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void OnCharge() {
        adapter.charge();
    }
}
