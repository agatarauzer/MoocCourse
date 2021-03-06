package exercise105_GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        while (lowerLimit != upperLimit){
            int average = average(lowerLimit, upperLimit);
            boolean answer = isGreaterThan(average);
            if (answer) {
                lowerLimit = average + 1;
            }
            else if (!answer) {
                upperLimit = average;
            }
            if (upperLimit == lowerLimit) {
                System.out.println("The number you're thinking is " + lowerLimit);
            }
        }
    }

   private boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + " ? (y/n)");
        String replay = reader.next();
        if (replay.toLowerCase().equals("y")) {
            return true;
        }
        else {
            return false;
        }
   }

   private int average(int firstNumber, int secondNumber) {
       return (firstNumber+secondNumber) / 2;
   }

    private void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println();
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println();
    }

    private static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
