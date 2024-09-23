package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "A single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }
    @Test
    public void singleBracketsBeforeOtherCharacters(){
        String message ="Balanced brackets in front of other characters return true";
        String testData="[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAroundOtherChharacters(){
        String message = "Balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void singleBracketsAmongOtherCharacters(){
        String message = "Balanced brackets among other characters returns true";
        String testData = "L[aunchC]ode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void tripleBalancedBrackets(){
        String message = "3 consecutive pairs of Balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void tripleNestBalancedBrackets(){
        String message = "3 nested pairs of Balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    //
    @Test
    public void singleOpeningBracket(){
        String message = "A single bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void singleClosingBracket(){
        String message = "A single bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void reveredBrackets(){
        String message = "reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void singleBracketWithOtherCharacters(){
        String message = "A single bracket with other characters returns false";
        String testData = "L]aunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void unbalancedBracketsAmongOtherCharacters(){
        String message = "Unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void unbalancedSeries(){
        String message = "series Unbalanced brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void stringOfCharactersWithoutBrackets(){
        String message = "a string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void emptyString(){
        String message = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void nuMber(){
        String message = "an empty string returns true";
        Integer testData = 8;
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

}