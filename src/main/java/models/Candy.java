package models;

import com.techelevator.application.Inventory;

import java.math.BigDecimal;

public class Candy extends Inventory {
    public Candy(String id, String name, BigDecimal price) {
        super(id, name, price);
    }
}
