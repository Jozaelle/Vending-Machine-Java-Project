package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Item {


    public Chips(String slot, String productName, BigDecimal price, int quantity) {
        super(slot, productName, price, quantity);

    }

    @Override
    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
