package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money extends UserInput {


    private final double ONE_DOLLAR = 1.00;
    private final double FIVE_DOLLAR = 5.00;
    private final double TEN_DOLLAR = 10.00;
    private final double TWENTY_DOLLAR = 20.00;
    private BigDecimal totalBalance = BigDecimal.valueOf(0.00);
    private double balance = 0.00;

    public String feedMoney() {
        Scanner moneyIn = new Scanner(System.in);

        System.out.print("Enter a whole dollar amount $1, $5, $10, or $20: ");
        Double amount = moneyIn.nextDouble();

        balance += amount;
        totalBalance = BigDecimal.valueOf(balance);

        return "Current Money Provided: " + totalBalance;

    }


}
