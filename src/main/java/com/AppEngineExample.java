package com;

import java.util.Scanner;

public class AppEngineExample {

    private static boolean appIsRunning;

    public static void main(String[] args) {
        appIsRunning = true;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the main menu! Please select a choice from the following list.\n");

        while (appIsRunning) {
            System.out.println("Pick a choice!\n");
            System.out.println("1) Choice A");
            System.out.println("2) Choice B");
            System.out.println("3) Exit");

            String userResponseToMenuPrompt = inputScanner.nextLine();

            switch (userResponseToMenuPrompt) {
                case ("1"):
                    System.out.println("You picked one!\n");
                    break;
                case ("2"):
                    System.out.println("You picked two!\n");
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

}
