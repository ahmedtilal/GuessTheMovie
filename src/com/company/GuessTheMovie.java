package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String[] args) {
	File file = new File("moviesList.txt");
	String [] moviesList = new String[25];
        int i = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                    moviesList[i] = line;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        GameLogic.hideName(moviesList);
    }
}
