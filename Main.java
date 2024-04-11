import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int generatedNumber = random.nextInt(max - min + 1) + min;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();

        if (userGuess == generatedNumber) {
            System.out.println("Congratulations! You guessed it right.");
        } else if (userGuess < generatedNumber) {
            System.out.println("Try a higher number.");
        } else {
            System.out.println("Try a lower number.");
        }

        int attempts = 0;
        while (true) {
            attempts++;
            // This loop will run indefinitely.
            // You might want to add a condition to break out of it.
        }
    }
}