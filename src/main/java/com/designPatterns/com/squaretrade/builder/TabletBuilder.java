package com.squaretrade.builder;

public class TabletBuilder implements Builder{

    private Computer computer;

    public TabletBuilder() {
        this.computer = new Computer();
    }



    @Override
    public Builder buildProcessor(String processor) {
        computer.setGraphicsCard(processor);
        return this;
    }

    @Override
    public Builder buildMemory(int memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public Builder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public Builder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard("");
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
