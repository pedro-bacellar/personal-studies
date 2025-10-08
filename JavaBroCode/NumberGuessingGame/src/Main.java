            // 22. number guessing game

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       int guess;
       int min = 1;
       int max = 100;
       int randomNumber = random.nextInt(min, max + 1);
       int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game! \uD83C\uDFAF\n");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do {
            System.out.print("\uD83D\uDC49 Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Your number is a little bit lower ⬇️");
            }
            else if (guess > randomNumber){
                System.out.println("Your number is a little bit higher ⬆️");
            }
        } while (guess != randomNumber);

        System.out.println("You have nailed it! The number was " + randomNumber + " 😸");
        System.out.println("Attempts: " + attempts);

        scanner.close();

    }
}
