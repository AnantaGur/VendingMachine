package com.techelevator.application;

import java.util.List;
import java.util.Scanner;

public class Money {


    private final double ONE_DOLLAR = 1.00;
    private final double FIVE_DOLLAR = 5.00;
    private final double TEN_DOLLAR = 10.00;
    private final double TWENTY_DOLLAR = 20.00;
    private double balance;

    private List<Inventory> item;
    VendingMachine vendingMachine = new VendingMachine();

    public void feedMoney() {

        System.out.println("1) $1.00 ");
        System.out.println("2) $5.00 ");
        System.out.println("3) $10.00 ");
        System.out.println("4) $20.00 ");
        System.out.print("Choose a Dollar amount: ");

        Scanner moneyIn = new Scanner(System.in);
        double amount = moneyIn.nextDouble();
        if (amount == 1){
            System.out.println("$1.00 added to balance");
            amount = ONE_DOLLAR;
            balance += amount;
            // THe next line will work once the Money is declared in the right spot.
            setTotalBalance(balance);
        } else if (amount == 2){
            System.out.println("$5.00 added to balance");
            amount = FIVE_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
        } else if (amount == 3){
            System.out.println("$10.00 added to balance");//put in user output
            amount = TEN_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
        } else if (amount == 4){
            System.out.println("$20.00 added to balance");
            amount = TWENTY_DOLLAR;
            balance += amount;
            setTotalBalance(balance);
        } else {
            System.out.println("Returning back to purchase screen");

        }
    }

    public double purchaseAmount(double price) {
        if (balance <= 0) {
            System.out.println();
            System.out.println("Insufficient balance");
        } else {
            balance -= price;
            return balance;
        }
        return balance;
    }


    public void setTotalBalance(double balance) {
        this.balance = balance;
    }

    public double getTotalBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Money{" +
                "ONE_DOLLAR=" + ONE_DOLLAR +
                ", FIVE_DOLLAR=" + FIVE_DOLLAR +
                ", TEN_DOLLAR=" + TEN_DOLLAR +
                ", TWENTY_DOLLAR=" + TWENTY_DOLLAR +
                ", balance=" + balance +
                '}';
    }

}
