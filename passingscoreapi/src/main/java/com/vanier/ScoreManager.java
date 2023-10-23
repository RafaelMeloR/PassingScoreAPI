package com.vanier;

public class ScoreManager {

    public static boolean checkScore(String args[]) {

        int score = Integer.parseInt(args[0]);

        //Assuming scores go from 0 to 1o
        if (score >= 6 && score <= 10) {
            return true;
        }
        return false;
    }
}
