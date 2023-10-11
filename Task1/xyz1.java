import java.util.Random;
import java.util.Scanner;

public class xyz1 {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Create an instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a boolean variable to control the loop
        boolean guessedCorrectly = false;

        // Repeat steps 2 and 3 until the user guesses the correct number
        while (!guessedCorrectly) {
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
        }
    }
}
