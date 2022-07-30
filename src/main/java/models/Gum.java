package models;

import com.techelevator.application.Inventory;

import java.math.BigDecimal;

public class Gum extends Inventory{

    public Gum(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getSound() {
        return "\nChewy, Chewy, Lots O Bubbles!";
    }
}
