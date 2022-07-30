package models;


import com.techelevator.application.Inventory;

public class Candy extends Inventory {
    public Candy(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getSound() {
        return "\nSugar, Sugar, so Sweet!";
    }
}
