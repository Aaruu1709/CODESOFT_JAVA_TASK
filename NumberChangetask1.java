import java.util.Scanner;
import java.util.Random;

public class NumberChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;

            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have 10 attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game over! Your score is: " + score);
        scanner.close();
    }
}


//  Here's how you can play the simplified number guessing game:

// 1. **Start the Game:** Run the Java program. You'll see the welcome message and instructions.

// 2. **Guess the Number:** The program will randomly select a number between 1 and 100. Your task is to guess this number.

// 3. **Enter Your Guess:** The program will prompt you to enter your guess. Type in a number and press Enter.

// 4. **Receive Feedback:** After each guess, the program will provide feedback:
//    - If your guess is correct, it will congratulate you and display the number of attempts it took.
//    - If your guess is too low, it will tell you to try a higher number.
//    - If your guess is too high, it will tell you to try a lower number.

// 5. **Attempts Remaining:** You have a maximum of 10 attempts to guess the correct number. The program will inform you of how many attempts you have left.

// 6. **Play Again:** After each round, the program will ask if you want to play again. If you type "yes" (case-insensitive), it will generate a new random number, and you can play another round. If you type anything else, the game will end.

// 7. **Score:** The program keeps track of your score, which is the number of times you guessed the correct number. It will display your final score when you choose not to play again.

// 8. **Game Over:** The game ends when you decide not to play another round. The program will display your final score, and you can close the program.

// Remember one point only , the main goal is to guess the correct number with as few attempts as possible to improve your score. thats so nice game ..i like so much and its too much interesting game. my experince was so good at first time i develop this type of application using java and all credits go to CodeSoft.Thank you so much. I Improve my lots of knowledge by using this. A'm so thankful. This is greatful Opportunity to everyone, Everyone has to do this intership so nice undersatndable experience is happening to me.okay bye.have a nice fun ahead. 