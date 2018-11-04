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

                while (appIsRunning) {

                    System.out.println("Enter a character name: ");
                    characters.add(inputScanner.next());
                    System.out.println(characters);
                    System.out.println("Would you like to create another character? ");
                    if (userResponseToMenuPrompt.contentEquals("yes"))
                        appIsRunning = true;
                    else

                        appIsRunning = false;
                }
                // Create character and add to list
                // Accept user input for character name (string)
                // Scanner input
                // Accept user input for catch phrases and add to hash map for character (Map<CharacterName, CatchPhrase>)
                break;
            case ("2"):
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

