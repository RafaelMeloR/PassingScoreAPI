package com.vanier;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScoreTest {

    @Test
    public void CheckScoreToFalseTest(){

        String argsTest[] = new String[1];
        argsTest[0] = "5";       
        boolean result = ScoreManager.checkScore(argsTest);
        assertTrue("Test if is valid 5 less than 6", result==false);
    }
    
    @Test
    public void CheckScoreToTrueTest(){

        String argsTest[] = new String[1];
        argsTest[0] = "8";       
        boolean result = ScoreManager.checkScore(argsTest);
        assertTrue("Test if is valid 8 greater than 6", result==true);
    }
}
