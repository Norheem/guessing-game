package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        // Creating a scanner class to use the method scanner class
        Scanner scanner = new Scanner(System.in);

        // Creating a random class to be able to generate random numbers
        Random random = new Random();

        //Generate a random number between 1 & 100
        int targetNumber = random.nextInt(100) + 1;

        int guessNumber = 0;

        //Loop until the user guesses the correct number
        while (guessNumber != targetNumber) {
            System.out.println("Guess the number: ");
            guessNumber = scanner.nextInt();

            if (guessNumber < targetNumber) {
                System.out.println("Too low! Guess again.");
            } else if (guessNumber > targetNumber) {
                System.out.println("Too high! Guess again");
            } else {
                System.out.println("Congratulations! You guessed correctly");
            }
        }
        scanner.close();
    }
}
