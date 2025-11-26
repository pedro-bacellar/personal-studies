import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //          ----- NAME VALIDATION -----

        String name = "";

        do {

            System.out.printf("Enter your full name: ");
            name = scanner.nextLine().trim();

            if (name.isEmpty() || name.length() < 3) {
                System.out.println("Invalid name.\n");
                continue;
            }
            break;

        }while(true);

        //          ----- EMAIL VALIDATION -----

        String email = "";
        String username = "";
        String domain = "";

        do {

            System.out.print("Enter your email: ");
            email = scanner.nextLine().trim().toLowerCase();

            //          First Validation (email)

            if (email.isEmpty() || !email.contains("@") || email.contains(" ")) {
                System.out.println("Invalid email.\n");
                continue;
            }

            //          Second Validation (username and email)

            int atIndex = email.lastIndexOf("@");
            username = email.substring(0, atIndex);
            domain = email.substring(atIndex + 1);

            if (username.isEmpty() || !(domain.equals("gmail.com") || domain.equals("outlook.com"))) {
                System.out.println("Invalid email.\n");
                continue;
            }
            break;

        }while(true);

        //          ----- PASSWORD VALIDATION -----

        String password = "";
        boolean isDigit = false;
        boolean isUpperCase = false;

        System.out.println();
        System.out.println("- Your password must have at least 8 characters;");
        System.out.println("- Your password must have at least 1 number;");
        System.out.println("- Your password must have at least 1 upper case character.");
        System.out.println();

        do {

            System.out.print("Enter your password: ");
            password = scanner.nextLine().trim();

            isDigit = false;
            isUpperCase = false;

            for(int i = 0; i < password.length(); i++){
                char c = password.charAt(i);

                if(Character.isDigit(c)){
                    isDigit = true;
                }
                if(Character.isUpperCase(c)){
                    isUpperCase = true;
                }
            }

            if(password.length() < 8 || !isDigit || !isUpperCase){
                System.out.println("Invalid password.\n");
                continue;
            }
            break;

        }while(true);

        //          ----- AGE VALIDATION -----

        String age = "";
        int ageInt = 0;
        boolean onlyDigit = false;

        System.out.println();
        System.out.println("You must have 18+ years old to register.");
        System.out.println();

        do {

            System.out.print("Enter your age: ");
            age = scanner.nextLine();

            onlyDigit = true;

            for (int i = 0; i < age.length(); i++) {

                char c = age.charAt(i);

                if (!Character.isDigit(c)) {
                    onlyDigit = false;
                    System.out.println("Invalid age.");
                    break;
                }
            }

            if(onlyDigit && !age.isEmpty()){
                ageInt = Integer.parseInt(age);

                if(ageInt < 18){
                    System.out.println("Minors cannot register.");
                    continue;
                }
                break;
            }

        }while(true);

        //          ----- SUMMARY SCREEN -----

        System.out.println();
        System.out.println("===== USER REGISTERED =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + ageInt);
        System.out.println("Password length: " + password.length());
        System.out.println();
        System.out.println("Registration successfully completed!");

        scanner.close();
    }
}