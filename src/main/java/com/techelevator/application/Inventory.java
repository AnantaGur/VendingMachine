package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private String id;
    private String name;
    private BigDecimal price;
    private int quantity;
    private String type;

    public Inventory(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 6;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-20.2f %-15d ", id, name, price, quantity);
    }

}
