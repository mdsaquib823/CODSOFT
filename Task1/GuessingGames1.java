import java.util.Random;
import java.util.Scanner;

public class GuessingGames1 {
    public static void main(String[] args) {
        // Create an instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a boolean variable to control the game loop
        boolean playAgain;

        // Initialize the user's score
        int score = 0;

        do {
            int roundScore = playGame1(scanner); // Call the method to play the game and get the round score
            score += roundScore; // Update the user's total score

            // Display the user's score after each round
            System.out.println("Round Score: " + roundScore);
            System.out.println("Total Score: " + score);

            // Prompt the user to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();

            // Check user input to determine if they want to play again
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        } while (playAgain);

        // Display the final score
        System.out.println("Final Score: " + score);
        System.out.println("Thank you for playing!");
    }

    public static int playGame1(Scanner scanner) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Initialize a boolean variable to control the loop
        boolean guessedCorrectly = false;

        // Initialize the number of attempts
        int attempts = 0;
        final int maxAttempts = 5; // Specify the maximum number of attempts

        // Repeat steps 2 and 3 until the user guesses the correct number or reaches the
        // maximum number of attempts
        while (!guessedCorrectly && attempts < maxAttempts) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess (between 1 and 100): ");
            int userGuess = scanner.nextInt();

            // Compare the user's guess with the random number and provide feedback
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                guessedCorrectly = true; // Set the boolean variable to true to exit the loop
            } else if (userGuess < randomNumber) {
                System.out.println("Sorry, your guess is too low.");
            } else {
                System.out.println("Sorry, your guess is too high.");
            }

            attempts++; // Increment the number of attempts
        }

        // Check if the user has guessed the correct number
        if (guessedCorrectly) {
            int roundScore = maxAttempts - attempts + 1; // Calculate the round score based on the number of attempts
            System.out.println("Round Score: " + roundScore);
            return roundScore;
        } else {
            System.out.println("Sorry, you have used all your attempts. The correct number was: " + randomNumber);
            return 0; // Return 0 as the round score if the user did not guess the correct number
        }
    }
}
