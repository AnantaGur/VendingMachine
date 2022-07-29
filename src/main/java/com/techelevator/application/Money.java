package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Money extends UserInput {


    private final double ONE_DOLLAR = 1.00;
    private final double FIVE_DOLLAR = 5.00;
    private final double TEN_DOLLAR = 10.00;
    private final double TWENTY_DOLLAR = 20.00;

    private BigDecimal totalBalance;

    private double balance = 0.00;
    public String feedMoney() {
        Scanner moneyIn = new Scanner(System.in);
        List<Double> moneyValues = new ArrayList<>();
        moneyValues.add(ONE_DOLLAR);
        moneyValues.add(FIVE_DOLLAR);
        moneyValues.add(TEN_DOLLAR);
        moneyValues.add(TWENTY_DOLLAR);

        System.out.println("1) $1.00 ");
        System.out.println("2) $5.00 ");
        System.out.println("3) $10.00 ");
        System.out.println("4) $20.00 ");
        System.out.print("Choose a Dollar amount: ");

        double amount = moneyIn.nextDouble();
        if (amount == 1){
            System.out.println("$1.00 added to balance");
            amount = ONE_DOLLAR;
            balance += amount;
            totalBalance = BigDecimal.valueOf(balance);
        } else if (amount == 2){
            System.out.println("$5.00 added to balance");
            amount = FIVE_DOLLAR;
            balance += amount;
            totalBalance = BigDecimal.valueOf(balance);
        } else if (amount == 3){
            System.out.println("$10.00 added to balance");
            amount = TEN_DOLLAR;
            balance += amount;
            totalBalance = BigDecimal.valueOf(balance);
        } else if (amount == 4){
            System.out.println("$20.00 added to balance");
            amount = TWENTY_DOLLAR;
            balance += amount;
            totalBalance = BigDecimal.valueOf(balance);
            String totalBalanceString = totalBalance.toString();
            return totalBalanceString;
        } else {
            System.out.println("Returning back to purchase screen");
            getPurchaseScreenOption();
        }
        System.out.println(totalBalance);
        return totalBalance.toString();

    }

    public BigDecimal getTotalBalance() {
        System.out.println(totalBalance);
        return totalBalance;
    }


}
