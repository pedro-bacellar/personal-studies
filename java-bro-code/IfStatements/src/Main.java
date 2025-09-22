//      7. if statements

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("enter your name: ");
        name = scanner.nextLine();

        System.out.println("enter your age: ");
        age = scanner.nextInt();

        System.out.println("are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

//      group 1 (if name)

        if (name.isEmpty()){
            System.out.println("you didn't enter your name!");
        }
        else{
            System.out.println("hello " + name + "!");
        }

//      group 2 (if age)

        if (age >= 60){
            System.out.println("you are an senior!");
        }
        else if (age >= 18){
            System.out.println("you are an adult!");
        }
        else if (age >= 13){
            System.out.println("you are an teenager!");
        }
        else if (age >= 1){
            System.out.println("you are an child!");
        }
        else if (age == 0){
            System.out.println("you are an baby!");
        }
        else if (age < 0){
            System.out.println("you haven't born yet!");
        }
        else{
            System.out.println("invalid.");
        }

//      group 3 (if student)

        if (isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are NOT a student!");
        }

        scanner.close();

    }
}
