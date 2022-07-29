package com.techelevator.ui;

import com.techelevator.application.Money;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);



    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("d")) {
            return "display";
        }
        else if (option.equals("p")) {
            return "purchase";

        }
        else if (option.equals("e")) {
            return "exit";
        }
        else {
            return "";
        }

    }
    public static String getPurchaseScreenOption(){
        Money money = new Money();
        System.out.println();

        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Item");
        System.out.println("(F) Finish Transaction");

        System.out.print("Current Money provided: $");
        System.out.println(money.getTotalBalance());
        System.out.println();
        System.out.print("What would you like to do? ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("m")) {
            System.out.println();
            return "Feed Money";
        }
        else if (option.equals("s")) {
            System.out.println();
            return "select item";

        }
        else if (option.equals("f")) {
            System.out.println();
            return "finish transaction";
        }
        else {
            return "";
        }
    }


}

