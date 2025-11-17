import java.util.Scanner;

public class ain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("enter the email: ");
        email = scanner.nextLine();

        email = email.trim();

        if(email.contains(" ")){
            System.out.println("invalid email: email cannot contain spaces");
        }

        else if(email.contains("@")){
            String username = email.substring(0, email.lastIndexOf("@"));
            String domain = email.substring(email.lastIndexOf("@") + 1);

            if(username.contains("@")){
                System.out.println("invalid email: username cannot contain @");
            }

            else if(username.isEmpty()){
                System.out.println("invalid email: username cannot be empty");
            }

            else if(domain.contains("@")){
                System.out.println("invalid email: domain cannot contain @");
            }

            else if(domain.isEmpty()){
                System.out.println("invalid email: domain cannot be empty");
            }

            else{
                System.out.println("valid email!");
                System.out.println("- username: " + username);
                System.out.println("- domain: " + domain);
            }
        }

        else{
            System.out.println("invalid email: email must contain @");
        }

        scanner.close();
    }

}