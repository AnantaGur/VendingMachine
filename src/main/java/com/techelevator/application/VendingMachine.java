package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import models.Candy;
import models.Drink;
import models.Gum;
import models.Munchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine extends Inventory{
    private List<Inventory> item;
    Money money = new Money();

    Inventory inventory = new Inventory();
    public void run() {
        readFile();

        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if (choice.equals("display")) {
                // display the items
                for (int i = 0; i < item.size(); i++) {
                    System.out.println(item.get(i));
                }

            } else if (choice.equals("purchase")) {
            while (true){
                UserOutput.displayPurchaseScreen();
                choice = UserInput.getPurchaseScreenOption();
                System.out.println(choice);
                if (choice.equals("Feed Money")) {
                    money.feedMoney();
//                    money.getTotalBalance();
                }
            }
                // make a purchase
            } else if (choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }

    public void readFile() {
        item = new ArrayList<>();
        try {
            Scanner fileInput = new Scanner(new File("vending.csv"));
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();

                String[] lineArray = line.split(",");
                if (lineArray[3].equals("Munchy")) {
                    item.add(new Munchy(lineArray[0], lineArray[1], new BigDecimal(lineArray[2])));
                } else if (lineArray[3].equals("Gum")) {
                    item.add(new Gum(lineArray[0], lineArray[1], new BigDecimal(lineArray[2])));
                } else if (lineArray[3].equals("Drink")) {
                    item.add(new Drink(lineArray[0], lineArray[1], new BigDecimal(lineArray[2])));
                } else if (lineArray[3].equals("Candy")) {
                    item.add(new Candy(lineArray[0], lineArray[1], new BigDecimal(lineArray[2])));
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "item=" + item +
                '}';
    }
}
