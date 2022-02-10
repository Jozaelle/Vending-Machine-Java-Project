package com.techelevator;

import java.math.BigDecimal;

public class Item {

    private String slot;
    private String productName;
    private BigDecimal price;
    private int quantity;
    private String sound;

    public Item(String slot, String productName, BigDecimal price, int quantity){
        this.slot=slot;
        this.productName= productName;
        this.price= price;
        this.quantity=quantity;
    }

    public String getSlot() {
        return slot;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSound() {
        return sound;
    }
}
