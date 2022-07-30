package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void getSound_pass_in_B4_return_Sugar_Sugar_So_Sweet(){
        Candy candy = new Candy("B4", "Wonka Bar", 2.35);
        String expected = "\nSugar, Sugar, so Sweet!";
        String actual = candy.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void getSound_pass_in_C3_return_Sugar_Sugar_So_Sweet(){
        Candy candy = new Candy("C3", "Moonpie", 2.95);
        String expected = "\nSugar, Sugar, so Sweet!";
        String actual = candy.getSound();
        assertEquals(expected, actual);
    }

}