package com.techelevator.application;

import com.techelevator.ui.Logger;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import models.Candy;
import models.Drink;
import models.Gum;
import models.Munchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine extends Inventory {
    private List<Inventory> item;
    Logger logger;

    public void run() {
        logger = new Logger("AuditFile.txt");
        readFile();

        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if (choice.equals("display")) {
                // display the items
                UserOutput.displayItems(item);

            } else if (choice.equals("purchase")) {
                Money money = new Money();
                while (true) {
                    UserOutput.displayPurchaseScreen();
                    choice = UserInput.getPurchaseScreenOption(money);
                    System.out.println(choice);
                    if (choice.equals("Feed Money")) {
                        money.feedMoney();
                    } else if (choice.equals("Select Item")) {
                        UserOutput.displayItems(item);
                        selectItem(money);
                    } else if (choice.equals("finish transaction")){
                        money.calculateChange();
                        run();
                    }
                }
                // make a purchase
            } else if (choice.equals("exit")) {
                System.exit(1);
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
                    item.add(new Munchy(lineArray[0], lineArray[1], new Double(lineArray[2])));
                } else if (lineArray[3].equals("Gum")) {
                    item.add(new Gum(lineArray[0], lineArray[1], new Double(lineArray[2])));
                } else if (lineArray[3].equals("Drink")) {
                    item.add(new Drink(lineArray[0], lineArray[1], new Double(lineArray[2])));
                } else if (lineArray[3].equals("Candy")) {
                    item.add(new Candy(lineArray[0], lineArray[1], new Double(lineArray[2])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public void selectItem(Money money) {
        Scanner selectItem = new Scanner(System.in);
        System.out.print("Enter slot code: ");
        String itemSelected = selectItem.nextLine();
        for (int i = 0; i < item.size(); i++) {

            if (itemSelected.equalsIgnoreCase(item.get(i).getId())) {
                if (item.get(i).getQuantity() <= 0){
                    System.out.println("Product no longer available");
                    break;
                } else if (money.getTotalBalance() < item.get(i).getPrice()){
                    System.out.println();
                    System.out.println("Insufficient balance");
                    break;
                } else {
                    item.get(i).removeQuantity();
                    money.purchaseAmount(item.get(i).getPrice());
                    System.out.println(item.get(i));
                    System.out.println(item.get(i).getSound());
                    logger.write(LocalDateTime.now() + item.get(i).getName() +
                            item.get(i).getId() + money.getTotalBalance() +  money.purchaseAmount(item.get(i).getPrice()));
                    break;
                }
            }

        }
    }
}

