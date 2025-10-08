            // 21. while loops

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        String response = "";

        while(!response.contains("Q")){
            System.out.println("\nYou are playing a game!");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.printf("You have quit the game\n\n");

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old\n");

        int number = 0;

        do {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
