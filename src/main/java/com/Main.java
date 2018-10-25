package com;

        import java.util.Arrays;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        readInput(in);

    }

    public static void readInput(Scanner in) {


        // write your code here
        Scanner character = new Scanner(System.in);
        Scanner phrase = new Scanner(System.in);
        Scanner selection = new Scanner(System.in);

        System.out.println("Select " + 1 + " to create character or " + 2 + " to view phrases: ");
        int select = selection.nextInt();

        if (select == 1) {

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

                    //System.out.println(Arrays.toString(s));
                    //System.out.println(Arrays.toString(p));
                    System.out.println("Very good, lets return to the beginning \n");
                    System.out.println(s[i]);
                    System.out.println(p[x]);
                    //readInput(in);
                }
            }

        } else if (select == 2) {
            int a;
            int b;

            System.out.println("You have to add characters first. How many would you like to add? ");
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
                }

                System.out.println(Arrays.toString(s));
                System.out.println(Arrays.toString(p));
                System.out.println("Very good, lets return to the beginning \n");

                readInput(in);
            }

        } else {

            System.out.println("Keep working");
            readInput(in);
        }
    }
}