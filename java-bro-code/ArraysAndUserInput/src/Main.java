            // 32. arrays and user input

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number of food do you want?: ");
        int numberFood = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[numberFood];

//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "hamburger";

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }



        scanner.close();
    }
}
