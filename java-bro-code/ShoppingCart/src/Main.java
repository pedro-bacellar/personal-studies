//      6. shopping cart

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("what is the price for each: ");
        price = scanner.nextDouble();

        System.out.print("how many would you like to buy: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("you have bought " + quantity + " " + item + "/s");
        System.out.println("it will be a total of " + currency + total);




        scanner.close();

    }
}