            // 15. weight conversion

import java.util.Scanner;

public class Main{
    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to Weight Conversion Program!");
        System.out.println("1 - convert lbs to kgs");
        System.out.println("2 - convert kgs to lbs");

        System.out.print("enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.45359237;

            System.out.printf("the weight in kgs = %.3f", newWeight);

        }
        else if(choice == 2) {
            System.out.print("enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight / 0.45359237;

            System.out.printf("the weight in lbs = %.3f", newWeight);

        }
        else{
            System.out.println("invalid option!");

        }

        scanner.close();
    }
}