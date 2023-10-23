package com.vanier;

public class Score {

    public boolean checkScore(String args[]) {

        int score = Integer.parseInt(args[0]);
        if (score >= 6 && score <= 10) {
            return true;
        }
        return false;
    }
}
