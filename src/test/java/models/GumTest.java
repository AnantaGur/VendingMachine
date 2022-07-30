package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class GumTest {

    @Test
    public void getSound_pass_in_A1_return_Chewy_Chewy_Lots_O_Bubbles(){
        Gum gum = new Gum("A1", "U-Chews", 1.65);
        String expected = "\nChewy, Chewy, Lots O Bubbles!";
        String actual = gum.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void getSound_pass_in_D1_return_Chewy_Chewy_Lots_O_Bubbles(){
        Gum gum = new Gum("D1", "Teaberry", 1.65);
        String expected = "\nChewy, Chewy, Lots O Bubbles!";
        String actual = gum.getSound();
        assertEquals(expected, actual);
    }

}