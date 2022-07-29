package models;

import com.techelevator.application.GetMessage;
import com.techelevator.application.Inventory;

import java.math.BigDecimal;

public class Candy extends Inventory implements GetMessage {
    public Candy(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getMessage() {
        if (getType().equals("Candy")) {
            return "Sugar, Sugar, so Sweet!";
        }
        return "";
    }
}
