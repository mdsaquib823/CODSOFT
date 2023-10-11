import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Create an instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their guess
        System.out.print("Enter your guess (between 1 and 100): ");
        int userGuess = scanner.nextInt();

        // Check if the user's guess matches the random number
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, your guess is incorrect. The random number was: " + randomNumber);
        }
    }
}
