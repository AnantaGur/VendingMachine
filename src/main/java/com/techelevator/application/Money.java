package com.techelevator.application;

import com.techelevator.ui.Logger;
import com.techelevator.ui.UserInput;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Money {


    private final double ONE_DOLLAR = 1.00;
    private final double FIVE_DOLLAR = 5.00;
    private final double TEN_DOLLAR = 10.00;
    private final double TWENTY_DOLLAR = 20.00;
    private double balance;


    public void feedMoney() {
        Logger logger = new Logger("AuditFile.txt");
        System.out.println("1) $1.00 ");
        System.out.println("2) $5.00 ");
        System.out.println("3) $10.00 ");
        System.out.println("4) $20.00 ");
        System.out.println("'E' to exit");
        System.out.print("Choose a Dollar amount: ");
        Scanner moneyIn = new Scanner(System.in);
        String amountString = moneyIn.nextLine().toLowerCase();
        double amount = Double.parseDouble(amountString);

        if (amount != 1 || amount != 2 || amount != 3 || amount != 4) {
            System.out.println("Returning back to purchase screen");
        }
        if (amount == 1) {
            System.out.println("$1.00 added to balance");
            amount = ONE_DOLLAR;
            balance += amount;
            // THe next line will work once the Money is declared in the right spot.
            setTotalBalance(balance);
            logger.writeFeedMoney(logger.localDateTime(), "MONEY FED:",amount, balance);
        } else if (amount == 2) {
            System.out.println("$5.00 added to balance");
            amount = FIVE_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
            logger.writeFeedMoney(logger.localDateTime(), "MONEY FED:",amount, balance);
        } else if (amount == 3) {
            System.out.println("$10.00 added to balance");//put in user output
            amount = TEN_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
            logger.writeFeedMoney(logger.localDateTime(), "MONEY FED:",amount, balance);
        } else if (amount == 4) {
            System.out.println("$20.00 added to balance");
            amount = TWENTY_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
            logger.writeFeedMoney(logger.localDateTime(), "MONEY FED:",amount, balance);
        }
//        logger.writeFeedMoney(timestamp.toString(), "MONEY FED:",amount, balance);
    }

    public double purchaseAmount(double price) {

        if (balance - price < 0.00) {
            System.out.println();
            System.out.println("Insufficient balance");
        } else {
            balance -= price;
        }
        return balance;
    }


    public void setTotalBalance(double balance) {
        if (balance <= 0) {
            System.out.println("Insufficient Balance");
            balance = 0.00;
        }
        this.balance = balance;
    }

    public double getTotalBalance() {
        return balance;
    }

    public void calculateChange() {
        Logger logger = new Logger("AuditFile.txt");
        double dollarCounter = 0;
        double quarterCounter = 0;
        double dimeCounter = 0;
        double nickleCounter = 0;
        double quarter = 0.25;
        double dime = 0.10;
        double nickle = 0.05;
        double firstBalance = balance;
       logger.writeChangeGiven(logger.localDateTime(),
               "CHANGE GIVEN:", firstBalance,"$0.00");

        while (balance > 0) {
            if (balance >= ONE_DOLLAR) {
                balance -= ONE_DOLLAR;
                dollarCounter++;
            } else if (balance >= quarter) {
                balance -= quarter;
                quarterCounter++;
            } else if (balance >= dime) {
                balance -= dime;
                dimeCounter++;
            } else if (balance >= 0.0499) {
                balance -= nickle;
                nickleCounter++;
            } else {
                balance = 0.00;

            }
        }
        System.out.println("Dollar bills: " + dollarCounter + "\nQuarters: " + quarterCounter +
                "\nDimes: " + dimeCounter + "\nNickles: " + nickleCounter + "\nBalance left over: " + "$0.00");
    }

}
