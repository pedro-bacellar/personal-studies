            // 31. arrays

import java.util.Arrays;

public class Main {
    static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        Arrays.sort(fruits);                // sort the elements of the array alphabetically
        Arrays.fill(fruits, "pineapple");   // fill the array with a value

        for(int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

    }
}