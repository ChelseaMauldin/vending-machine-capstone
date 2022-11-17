package com.techelevator.models;

import java.math.BigDecimal;

public class Drink extends Item{
    public Drink(String slot, String name, BigDecimal price) {
        super(slot, name, price);
    }
    @Override
    public void getMessage(){
        // Drinky Drinky, Slurp Slurp!!!
    }
}
