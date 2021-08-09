package com.company;

public class GameData {
    int remainingTrials = 10;
    String movieName;
    String[] underScoredName;
    public GameData(String movieName, String[] underScoredName) {
        this.movieName = movieName;
        this.underScoredName = underScoredName;
    }
}
