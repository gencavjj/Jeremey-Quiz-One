package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppEngineExample {

    private static boolean appIsRunning;
    private static ArrayList<String> characters;
    private static Map<String, String> catchPhrases;


    public static void main(String[] args) {

        appIsRunning = true;

        while (appIsRunning) {
            runApp();
        }

    }

    private static void runApp() {

        characters = new ArrayList<>();
        catchPhrases = new HashMap<>();

        System.out.println("Welcome to the main menu! Please select a choice from the following list.\n");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Pick a choice!\n");
        System.out.println("1) Choice A");
        System.out.println("2) Choice B");
        System.out.println("3) Exit");

        String userResponseToMenuPrompt = inputScanner.nextLine();
        switch (userResponseToMenuPrompt) {
            case ("1"):

                int numberOfCharacters;
                int numberOfPhrases;

                System.out.println("How many characters would you like to add? ");
                numberOfCharacters = inputScanner.nextInt();
                inputScanner.nextLine();

                for (int i = 0; i < numberOfCharacters; i++) {
                    System.out.println("Enter a character name: ");
                    characters.add(i, inputScanner.nextLine());

                    System.out.println("How many phrases would you like to add? ");
                    numberOfPhrases = inputScanner.nextInt();
                    inputScanner.nextLine();

                    for (int x = 0; x < numberOfPhrases; x++) {
                        System.out.println("Enter phrases for individual: ");
                        catchPhrases.put("Phrase 1 ", inputScanner.nextLine());

                    }

                }
                System.out.println(characters);
                System.out.println(catchPhrases);

                // Create character and add to list
                // Accept user input for character name (string)
                // Scanner input
                // Accept user input for catch phrases and add to hash map for character (Map<CharacterName, CatchPhrase>)
                break;
            case ("2"):

                System.out.println("Here are the list of Characters " + characters + "Please select one to play with. ");

                // Display list of characters and allow user to select from list to play catch phrases
                // Loop through hash map of catch phrases and print each one for selected character
                break;
            case ("3"):
                System.out.println("Goodbye!");
                appIsRunning = false;
                break;
            default:
                System.out.println("Didn't quite understand that. Please enter a number.");
                break;
        }
    }
}

