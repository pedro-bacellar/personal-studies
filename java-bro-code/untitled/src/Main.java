            // 33. search arrays

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int numberTarget = 7;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(numberTarget == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }



        String[] fruits = {"apple", "orange", "banana"};

        System.out.print("Enter a fruit to search for: ");
        String fruitTarget = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(fruitTarget)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }
    }
}
