            // 30. dice roller

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int dice = 0;
        int total = 0;

        do {
            System.out.print("Enter the number of dice to roll: ");
            dice = scanner.nextInt();

            if (dice <= 0) {
                System.out.println("Number of dice must be greater than zero.\n");

                continue;
            }
            break;
        }while(true);

        for(int i = 0; i < dice; i++){

            int roll = random.nextInt(1, 7);

            System.out.println("You rolled: " + roll);
            printDie(roll);

            total += roll;
        }
        System.out.println("Total = " + total);

        scanner.close();
    }

    static void printDie(int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------

                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------

                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------

                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------

                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------

                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------

                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll.");
        }


    }

}