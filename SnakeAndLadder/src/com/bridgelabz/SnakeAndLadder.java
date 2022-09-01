package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int rollDice = 0;
        int dice = 0;
        int playOption = 0;
        int POSITION = 0;

        for (dice = 1; POSITION < 100; dice++) {
            int rollDice = 0;
            int dice = 0;
            int playOption = 0;
            int POSITION = 0;


            System.out.println("Welcome to Snake & Ladder Simulator!");
            System.out.println("This problem simulates a Snake and Ladder Game.");
            System.out.println("The Player starts from 0 rolls the die to get a number between 1 to 6, finds a safe place, ladder or a snake keeps doing till the winning spot 100 is achieved.");

            System.out.println("Let's begin the game...");
            System.out.println("Initial position is Square Zero");
            System.out.println("Position : Square " + POSITION);

            for (dice = 1; POSITION < 100; dice++) {

                System.out.println();
                rollDice = (int) ((Math.random() * 6) + 1);
                rollDice = (int) ((Math.random() * 6) + 1);
                System.out.println("Rolled Dice Value : " + rollDice);

                playOption = (int) Math.floor(Math.random() * 10) % 3;
            }
        }
    }
}
