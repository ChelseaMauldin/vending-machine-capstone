package com.techelevator.models;

import java.math.BigDecimal;

public abstract class Item {
    private String slot;
    private String name;
    private BigDecimal price;
    private int stock = 6;

    public Item(String slot, String name, BigDecimal price) {
        this.slot = slot;
        this.name = name;
        this.price = price;

    }
    public abstract void getMessage();

    public String getSlot() {
        return slot;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
