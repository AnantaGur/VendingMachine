package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class MunchyTest {
    @Test
    public void getSound_pass_in_C4_return_Munchy_Munchy_So_Good(){
        Munchy munchy = new Munchy("C4", "Popcorn", 1.75);
        String expected = "\nMunchy, Munchy, so Good!";
        String actual = munchy.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void getSound_pass_in_B1_return_Munchy_Munchy_So_Good(){
        Munchy munchy = new Munchy("B1", "Stackers", 2.65);
        String expected = "\nMunchy, Munchy, so Good!";
        String actual = munchy.getSound();
        assertEquals(expected, actual);
    }

}