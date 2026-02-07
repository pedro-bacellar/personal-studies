import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GymManager {

    Scanner scanner = new Scanner(System.in);

    HashMap<Integer, Member> members = new HashMap<>();
    String filePath = "gym_members.txt";

    void addMember(){

        String name = getValidName();
        String email = getValidEmail();
        PlanType type = getPlanType();

        Member member = new Member(name, email, type);
        members.put(member.getId(), member);

        System.out.println(member);
    }

    private PlanType getPlanType(){
        while (true) {
            try {
                System.out.println("--- Plan Type ---");
                System.out.println("1. Monthly (1 month)");
                System.out.println("2. Quarterly (3 months");
                System.out.println("3. Annual (12 months)");
                System.out.println();
                System.out.print("Enter: ");
                int choiceType = scanner.nextInt();
                scanner.nextLine();

                switch (choiceType) {
                    case 1 -> {
                        return PlanType.MONTHLY;
                    }
                    case 2 -> {
                        return PlanType.QUARTERLY;
                    }
                    case 3 -> {
                        return PlanType.ANNUAL;
                    }
                }
            }
            catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Invalid character type");
            }
        }
    }
    private String getValidName(){
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty");
            }
            else {
                return name;
            }
        }
    }
    private String getValidEmail(){
        while (true) {
            System.out.print("Email: ");
            String email = scanner.nextLine().toLowerCase().trim();
            String username;
            String domain;

            if (email.contains("@")) {
                username = email.substring(0, email.lastIndexOf("@"));
                domain = email.substring(email.lastIndexOf("@") + 1);

                if (username.isEmpty()) {
                    System.out.println("Username cannot be empty");
                }
                else if (username.contains(" ")) {
                    System.out.println("Username cannot have space characters");
                }
                else if (!(domain.equals("gmail.com") || domain.equals("outlook.com"))) {
                    System.out.println("Invalid domain");
                }
                else {
                    return email;
                }
            }
            else if (email.isEmpty()) {
                System.out.println("Email is empty.");
            }
            else {
                System.out.println("Invalid email");
            }
        }
    }
}
