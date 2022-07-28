package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money extends UserInput {


    private final BigDecimal ONE_DOLLAR = BigDecimal.valueOf(1.00);
    private final BigDecimal FIVE_DOLLAR = BigDecimal.valueOf(5.00);
    private final BigDecimal TEN_DOLLAR = BigDecimal.valueOf(10.00);
    private final BigDecimal TWENTY_DOLLAR = BigDecimal.valueOf(20.00);
    private BigDecimal totalBalance = BigDecimal.valueOf(0.00);
    private double balance = 0.00;

public BigDecimal feedMoney(){
    Scanner moneyIn = new Scanner(System.in);
    String selectedOption = String.valueOf(moneyIn);
    if (selectedOption == "m"){
        System.out.println("Deposit amount: ");
        Double amount = moneyIn.nextDouble();
        balance += amount;
        totalBalance = BigDecimal.valueOf(balance);
        return totalBalance;

    }
    return totalBalance;
}


}
