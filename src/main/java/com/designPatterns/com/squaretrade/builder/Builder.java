package com.squaretrade.builder;

public interface Builder {

    Builder buildProcessor(String processor);
    Builder buildMemory(int memory);
    Builder buildStorage(int storage);
    Builder buildGraphicsCard(String graphicsCard);

  Computer build();
}
