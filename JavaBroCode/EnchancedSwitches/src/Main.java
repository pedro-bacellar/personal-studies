            // 18. enhanced switches

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine().trim().toLowerCase();

        switch (day){
            case "moonday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println(day + " is a day of the week 😿");

            case "saturday", "sunday" ->
                    System.out.println(day + " is a weekend day 😸");

            default -> System.out.println(day + " is not a day of the week!");

        }

    }

}