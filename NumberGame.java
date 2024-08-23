import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        // Game introduction
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 attempts to guess a number between 1 and 100.");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int numberOfTries = 0;
            int guess = 0;
            boolean won = false;
            int maxAttempts = 5;

            // Game loop
            while (numberOfTries < maxAttempts && !won) {
                System.out.print("Guess a number: ");
                guess = scanner.nextInt();
                numberOfTries++;

                // Check if the guess is correct
                if (guess < numberToGuess) {

                    System.out.println("Too low, Please try again:");

                } else if (guess > numberToGuess) {
                    
                    System.out.println("Too high, Please try again:");
                } else {
                    won = true;
                }
            }

            // Game result
            if (won) {

                System.out.println("Congratulations, You guessed the number in " + numberOfTries + " tries.");
                score += (maxAttempts - numberOfTries) + 1; // Calculate score
            } else {

                System.out.println("Sorry, you have used all your attempts. The number was: " + numberToGuess);
            }

            // Display score and ask to play again
            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            playAgain = response.equals("yes");

          
        }

        // Game over
        System.out.println("Thank you for playing, Your final score is: " + score);
        scanner.close();
    }
}



