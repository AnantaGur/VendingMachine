package models;

import com.techelevator.application.Inventory;

import java.math.BigDecimal;

public class Munchy extends Inventory {

    public Munchy(String id, String name, double price) {
        super(id, name, price);
    }

    public Munchy() {
    }

    @Override
    public String getSound() {
        return "\nMunchy, Munchy, so Good!";
    }

}
