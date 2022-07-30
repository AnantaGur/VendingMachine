package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {

    @Test
    public void getSound_pass_in_B2_return_Drinky_Drinky_Slurp_Slurp(){
        Drink drink = new Drink("B2", "Papsi", 3.45);
        String expected = "\nDrinky, Drinky, Slurp Slurp!";
        String actual = drink.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void getSound_pass_in_C2_return_Drinky_Drinky_Slurp_Slurp(){
        Drink drink = new Drink("C2", "7Down", 3.25);
        String expected = "\nDrinky, Drinky, Slurp Slurp!";
        String actual = drink.getSound();
        assertEquals(expected, actual);
    }

}