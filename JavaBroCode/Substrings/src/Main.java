            // 14. substrings

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("enter the email: ");

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));  // substring from 0 char to email.IndexOf("@")
            domain = email.substring(email.indexOf("@") + 1);   // substring from email.indexOf("@") + 1 (1 char ahead)

            System.out.println("username: " + username);
            System.out.println("domain: " + domain);
        }
        else{
            System.out.println("emails must contain @");
        }

        scanner.close();
    }
}