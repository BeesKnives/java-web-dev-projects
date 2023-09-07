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
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testOrderOfBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testHasPairOfBracketsEnd(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testHasPairOfBracketsStart(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void testNothingIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testMixedUpBracketsAfterCorrectOnes(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void testNoBracketsWithWordsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("It's Halloween!"));
    }

    @Test
    public void testBracketsWithWordsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[It's Halloween!]"));
    }
    @Test
    public void testBracketsWithWordsOOOIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]It's Halloween!["));
    }
    @Test
    public void testBracketsInMiddleOfWordsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("It's ]Halloween[!"));
    }

    @Test
    public void testBracketsInMiddleOfWordsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("It's [Halloween]!"));
    }

    @Test
    public void UnevenBracketsWithWordsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("It'[s [Halloween]!"));
    }


}