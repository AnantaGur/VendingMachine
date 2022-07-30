package com.techelevator.application;

import java.util.*;

public class Inventory {
    private String id;
    private String name;
    private double price;
    private int quantity = 6;
    private String type;

    public Inventory(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Inventory() {

    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void removeQuantity() {
           this.quantity --;
    }

    public String getSound(){
        return "";
    }


    @Override
    public String toString() {
        return String.format("%-15s %-20s $%-20.2f %-15d ", id, name, price, quantity);
    }

}
