            // 57. exceptions

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong");     // catch any exception
        }
        try{
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
    }
}
