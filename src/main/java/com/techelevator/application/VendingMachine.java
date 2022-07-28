package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private List<Inventory> item;

    public void run() {
        readFile();
        while(true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if(choice.equals("display")) {
                // display the items


            }
            else if(choice.equals("purchase")) {
                // make a purchase
            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
    public void readFile(){
            item = new ArrayList<>();
            try {
                Scanner userInput = new Scanner(new File("catering.csv"));
                while (userInput.hasNextLine()) {
                    String line = userInput.nextLine();

                    String[] lineArray = line.split(",");
                    if (lineArray[3].equals("Munchy")) {

                        item.add(new Munchy(lineArray[0], lineArray[1], new BigDecimal(lineArray[2])));
                    }
                }

            } catch (FileNotFoundException e){
                System.out.println("File not found");
            }

        }
    }

