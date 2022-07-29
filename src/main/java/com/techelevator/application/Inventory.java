package com.techelevator.application;

import java.util.*;

public class Inventory {
    private String id;
    private String name;
    private double price;
    private int quantity = 6;
    private String type;
    private Map<String, Integer> slotQuantity = new TreeMap<>();

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

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void removeQuantity() {
       if (quantity <= 0){
           System.out.println("Product no longer available");
           quantity = 0;
        } else if (getPrice() > 0) {
           this.quantity --;
       }

    }


    @Override
    public String toString() {
        return String.format("%-15s %-20s $%-20.2f %-15d ", id, name, price, quantity);
    }

}
