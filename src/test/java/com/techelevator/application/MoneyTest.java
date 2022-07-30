package com.techelevator.application;

import org.junit.Test;

import static org.junit.Assert.*;


public class MoneyTest {

    @Test
    public void purchaseAmount_pass_in_Price_return_Balance_Minus_Item(){
        Money money = new Money();
        money.setTotalBalance(5.00);
        double expected = 3.65;
        double actual = money.purchaseAmount(1.35);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void purchaseAmount_pass_in_0_return_Insufficient_Balance(){
        Money money = new Money();
        money.setTotalBalance(0);
        String expected = "Insufficient balance";
        double expectedAmount = 0.00;
        double actual = money.purchaseAmount(1.35);
        assertEquals(expected, expectedAmount, actual, 0);
    }
    @Test
    public void setTotalBalance_pass_in_1_return_1(){
        Money money = new Money();
        money.setTotalBalance(1);
        double expected = 1.00;
        double actual = money.getTotalBalance();
        assertEquals(expected, actual, 0);
    }
    @Test
    public void setTotalBalance_pass_in_0_return_Insufficient_Balance_0(){
        Money money = new Money();
        money.setTotalBalance(0);
        String expectedString = "Insufficient Balance";
        double expected = 0;
        double actual = money.getTotalBalance();
        assertEquals(expectedString, expected, actual, 0);
    }

}