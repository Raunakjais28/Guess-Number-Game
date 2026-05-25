import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int random = rand.nextInt(100) + 1; // Random number between 1-100
        int noOfGuess = 0;
        int guess;

        System.out.println("Welcome to the world of Guessing Numbers");

        do {

            System.out.println("Enter a number between 1-100");

            guess = sc.nextInt();
            noOfGuess++;

            if (guess == random) {

                System.out.println("\nCongratulations !!! You have successfully guessed the Number in "
                        + noOfGuess + " attempts");

            } else if (guess < random) {

                System.out.println("Guess a larger number");

            } else {

                System.out.println("Guess a smaller number");
            }

        } while (random != guess);

        System.out.println("\nBye Bye, Thanks for Playing.");
        System.out.println("Developed by: Raunak Jaiswal");

        sc.close();
    }
}