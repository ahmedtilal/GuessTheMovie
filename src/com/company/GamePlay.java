package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GamePlay {
    public static void guess(GameData gameData) {
        System.out.println("The movie is " + Arrays.toString(gameData.underScoredName) + " guess a letter.");
        System.out.println("You have " + gameData.remainingTrials + " wrong guesses left.");
        Scanner scanner = new Scanner(System.in);

        while (gameData.remainingTrials>0) {
            String userInput = scanner.next();
            if (userInput.length() == 1) {
letterCheck(gameData, userInput);
            } else {
                if (userInput.equals(gameData.movieName)) {
System.out.println("YOU WON!!!!");
                    System.out.println("The movie is " + gameData.movieName + "!!!");
                    break;
                } else {
                    gameData.remainingTrials--;
                    System.out.println("The movie is " + Arrays.toString(gameData.underScoredName) + " guess a letter.");
                    System.out.println("Wrong guess, you have " + gameData.remainingTrials + " guesses left.");
                }
            }
        }
        if (gameData.remainingTrials == 0) {
            System.out.println("You lose :( the movie is " + gameData.movieName);
        }
    }

    public static void letterCheck(GameData gameData, String letter) {
        if (gameData.movieName.contains(letter)) {
            int index = gameData.movieName.indexOf(letter);
            gameData.underScoredName[index] = letter;
            System.out.println(Arrays.toString(gameData.underScoredName));
        } else {
            gameData.remainingTrials--;
            System.out.println("The movie is " + Arrays.toString(gameData.underScoredName) + " guess a letter.");
            System.out.println("Wrong guess, you have " + gameData.remainingTrials + " guesses left.");
        }
    }
}
//TODO: Finish implementing functionalities for the game.