package com.techelevator.ui;

import com.techelevator.application.Inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UserOutput {
    public UserOutput(String displayItems) {
    }

    public static void displayMessage(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayPurchaseScreen(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Purchase");
        System.out.println("***************************************************");
        System.out.println();
    }
    public static void displayItems(List<Inventory> item){
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i));
        }
    }

/*    public static String displayItems() {
        File vendingItems = new File("catering.csv");

        try (Scanner fileInput = new Scanner(vendingItems)) {
            while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return "";
    }*/
}
