package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Item{
    public Candy(String slot, String name, BigDecimal price) {
        super(slot, name, price);

    }
    @Override
    public void getMessage(){
        // Sugar Sugar SO Sweet!!!
    }
}
