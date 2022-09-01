package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
         int SNAKE_OPTION = 1;
         int dieNumber, option;
            int dieCount = 0;
            int position = StART_POSITION;

            while (position < 100){
                dieNumber=rollDie();
                dieCount++;
                System.out.println("Die Number = "+dieNumber);

                option=checkOption();

                {
                System.out.println("current position : "+position);
            }
            System.out.println("Number of times die played = "+dieCount);
            }
        }
    }

