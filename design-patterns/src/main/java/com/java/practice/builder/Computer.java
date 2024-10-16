package com.java.practice.builder;

/**
 *  This is my Product class
 *  This is the complex object that needs to be created. It often has numerous optional parameters.
 *
 */

public class Computer {

    private String processor;
    private int memory;
    private int storage;
    private String graphicsCard;

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory=" + memory +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
