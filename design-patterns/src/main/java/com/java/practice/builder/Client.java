package com.java.practice.builder;

public class Client {

    public static void main(String[] args) {

        ComputerBuilder cb = new ComputerBuilder();
         Computer c = cb.buildStorage(100)
                         .buildGraphicsCard("")
                                 .buildMemory(100)
                                         .build();
         System.out.println(c);

         TabletBuilder tb = new TabletBuilder();
         Computer c1 = tb.buildMemory(1000).build();

        System.out.println(c1);
    }
}
