package com.java.practice.facade;

import java.util.List;

public class NonVegMenu implements Menu {
    @Override
    public List<String> getItems() {
        return List.of("chicken");
    }
}
