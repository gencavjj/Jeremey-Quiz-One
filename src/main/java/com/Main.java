package com;

import java.util.Scanner;

public class Main {

    private static final int CREATE_CHARACTER = 1;
    private static final int VIEW_PHRASES = 2;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        readInput(in);

    }

    /**
     * This won't route back to the menu again because it's separated into an if - else; you need a loop somewhere.
     * <p>
     * I would recommend a variable, appIsRunning. Put the whole thing into a while loop (with appIsRunning as the condition).
     * At the end of each if else, print a message asking the user if they want to continue, yes / no. If yes, the loop will
     * repeat, and they will be taken back to the menu. If no, then set appIsRunning to false and the loop will break.
     */
    public static void readInput(Scanner in) {

        /**
         * you only need one scanner here (which you don't even have to declare, since you're passing it in from the caller)
         * */

        Scanner character = new Scanner(System.in);
        Scanner phrase = new Scanner(System.in);
        Scanner selection = new Scanner(System.in);

        /**
         * To somebody reading the code, the numbers 1 and 2 are difficult to decipher out of context. In addition,
         * if you ever needed to change one of these numbers (say, 3 becomes phrases), you'll have to go through
         * and change it in several places.
         *
         * I would recommend a class level constant. That way, the code is more flexible and easier to read.
         *
         * I recommend a little research on constants in Java (purpose, syntax, etc)
         *
         * I took care of 1 for you to show you how to do it
         * */
        System.out.println("Select " + CREATE_CHARACTER + " to create character or " + VIEW_PHRASES + " to view phrases: ");
        int select = selection.nextInt();
        boolean appIsRunning = true;
        String answer = selection.nextLine();
        while (appIsRunning) {
            if (select == CREATE_CHARACTER) {

                int a;
                int b;


                System.out.println("How many characters would you like to add? ");
                a = character.nextInt();
                character.nextLine();
                String[] s = new String[a];

                for (int i = 0; i < a; i++) {
                    System.out.println("Enter a character name: ");
                    s[i] = character.nextLine();

                    System.out.println("How many phrases for this character? ");
                    b = phrase.nextInt();
                    phrase.nextLine();
                    String[] p = new String[b];

                    for (int x = 0; x < b; x++) {
                        System.out.println("Enter phrases for individual: ");
                        p[x] = phrase.nextLine();

                        System.out.println(s[i]);
                        System.out.println(p[x]);

                    }
                }

            } else {

                System.out.println("Would you like to continue? Enter yes or no. ");
                if (answer != "yes") {

                    appIsRunning = false;
                }

            }

        }
    }
}
