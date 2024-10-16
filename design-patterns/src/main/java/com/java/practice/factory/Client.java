package com.java.practice.factory;

public class Client {

    public static void main(String[] args) {

        VehicleFactory factory = new TwoWheelerFactory();
        Vehicle tw = factory.createVehicle();
        tw.printVehicle();

        VehicleFactory factory1 = new FourWheelerFactory();
        Vehicle fw = factory1.createVehicle();
        fw.printVehicle();


    }

}
