package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameLogic {

    public static void hideName(String @NotNull [] movies) {
        int random = (int) (Math.random() * 25);
        String movieName = movies[random];
var lettersArray = movieName.split("");
String[] underScoredName = new String[0];

        for (String s : lettersArray) {
            if (s.equals(" ")) {
                underScoredName = addX(underScoredName, " ");
            } else {
                underScoredName = addX(underScoredName, "_");
            }
        }
        GameData gameData = new GameData(movieName, underScoredName);
GamePlay.guess(gameData);
    }

    private static String[] addX(String[] arr, String x)
    {
        List<String> arraylist
                = new ArrayList<>(
                Arrays.asList(arr));

        arraylist.add(x);
        arr = arraylist.toArray(arr);

        return arr;
    }
}
