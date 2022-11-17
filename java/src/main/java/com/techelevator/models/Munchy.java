package com.techelevator.models;

import java.math.BigDecimal;

public class Munchy extends Item{
    public Munchy(String slot, String name, BigDecimal price) {
        super(slot, name, price);
    }
    @Override
    public void getMessage(){
        // Munchy Munchy SO Good!!!
    }
}
