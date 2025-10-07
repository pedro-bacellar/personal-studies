import java.util.Scanner;

public class UsernameExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // username must be between 4 - 12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine().trim();

        if (username.length() > 12 || username.length() < 4){
            System.out.println("Invalid username: must be between 4 - 12 characters! 😿");
        }
        else if (username.contains(" ") || username.contains("_")){
            System.out.println("Invalid username: must not contain spaces or underscores! 😿");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
