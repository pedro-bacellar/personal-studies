            // 26. methods

public class Main {
    static void main(String[] args) {

        double num = 2;
        String firstName = "Pedro";
        String lastName = "Bacellar";
        int age = 21;

        System.out.println(square(num));
        System.out.println(cube(num));
        System.out.println(getFullName(firstName, lastName));

        if(ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up");
        }

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static Boolean ageCheck(int age){
        return age >= 18;
        }
    }

