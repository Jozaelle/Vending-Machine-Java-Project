package com.techelevator;

import java.math.BigDecimal;

public class Item {

    private String slot;
    private String productName;
    private BigDecimal price;
    private int quantity;
    private String sound;

    public Item(String slot, String productName, String price){
        this.slot=slot;
        this.productName= productName;
        this.price = new BigDecimal(price);
        this.quantity = 5;
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
