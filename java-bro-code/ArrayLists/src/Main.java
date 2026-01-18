            // 56. arraylists

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of foods you would like: ");
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numberOfFoods; i++){
            System.out.print("Enter the food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
    }

    void arrayLists(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(1);
        fruits.set(0, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
