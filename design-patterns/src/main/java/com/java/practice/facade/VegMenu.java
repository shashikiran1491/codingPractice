package com.java.practice.facade;

import java.util.List;

public class VegMenu implements Menu {
    @Override
    public List<String> getItems() {
        return List.of("Idly", "Dosa");
    }
}
