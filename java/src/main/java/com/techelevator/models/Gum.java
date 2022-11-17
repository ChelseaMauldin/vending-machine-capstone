package com.techelevator.models;

import java.math.BigDecimal;

public class Gum extends Item{
    public Gum(String slot, String name, BigDecimal price) {
        super(slot, name, price);
    }
    @Override
    public void getMessage(){
    // Chewy Chewy, Lots O' Bubbles!!!
    }

}
