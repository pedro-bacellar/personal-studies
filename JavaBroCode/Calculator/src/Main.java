            // 19. calculator

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = 0, num1, num2;
        char operator;
        boolean validOperation = true;

        System.out.println("Welcome to the Calculator!");

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("(+) Addition");
        System.out.println("(-) Subtraction");
        System.out.println("(*) Multiplication");
        System.out.println("(/) Division");
        System.out.println("(^) Power");
        System.out.print("Choose an operator: ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
            }

        if (validOperation){
            System.out.printf("%.2f %c %.2f = %.2f\n\n", num1, operator, num2, result);
            System.out.println("Thanks for using the Calculator! \uD83E\uDDEE");
        }

        scanner.close();

    }
}

