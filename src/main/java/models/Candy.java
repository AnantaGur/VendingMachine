package models;


import com.techelevator.application.Inventory;

import java.math.BigDecimal;

public class Candy extends Inventory {
    public Candy(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getSound() {
        return "Sugar, Sugar, so Sweet!";
    }
}
