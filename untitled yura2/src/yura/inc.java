package yura;

/**
 * Created by Þðà on 28.09.2015.
 */
import java.util.Random;
import java.util.Scanner;

public class 'GuessingGame' {

    public static void main (String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "- I guessed number between 1 and 1000" );

        while (win == false) {

            System.out.println( "Type number:" );
            guess = input.nextInt();

            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess < numberToGuess) {
                System.out.println("- Your guess is too low\n");
            }
            else if (guess > numberToGuess) {
                System.out.println("- Your guess is too high\n");
            }
        }
        System.out.println("\nYes! You are winner!");
        System.out.println("The number was: " + numberToGuess);
        System.out.println("Number of tries: " + numberOfTries);
    }
}