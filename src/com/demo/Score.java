package com.demo;

public class Score {
    private int chineseScore;
    private int mathScore;

    @Override
    public String toString() {
        return "Score{" +
                "chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public Score() {
    }

    public Score(int chineseScore, int mathScore) {
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}
