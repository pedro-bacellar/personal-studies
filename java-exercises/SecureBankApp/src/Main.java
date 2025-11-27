import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //          ----- LOGIN -----

        String correctPassword = "abc123";
        String triedPassword = "";
        int tries = 3;

        for(int i = 0; i < 3; i++){

            System.out.printf("Enter your password (%d tries left): ", tries);
            triedPassword = scanner.nextLine();

            if(!triedPassword.equals(correctPassword)){
                tries--;
                System.out.println("Wrong password.");

                if(tries == 0){
                    System.out.println("No more tries left. Exiting system.");
                    return;
                }
                continue;
            }
            else {
                System.out.println("Correct password.");
                break;
            }
        }

        //          ----- MENU -----

        double withdraw = 0.0;
        double deposit = 0.0;
        double balance = 1000.0;
        int choice = 0;

        do{

            System.out.println();
            System.out.println();
            System.out.println("===== BANK MENU =====");
            System.out.println();
            System.out.printf("Current balance = $ %.1f%n", balance);
            System.out.println();
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Balance");
            System.out.println("4 - Exit");
            System.out.println();

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (choice) {

                case 1 -> {

                        System.out.print("Withdraw value: $ ");
                        withdraw = scanner.nextFloat();
                        scanner.nextLine();

                        if (withdraw <= 0 || withdraw > balance) {
                            System.out.println("Invalid value.");
                            break;
                        }

                        if (withdraw > 500) {
                            System.out.println("A $5 fee will be charged.");
                            balance -= (withdraw + 5);
                        }

                        else{
                            balance -= withdraw;
                        }
                    System.out.printf("Withdraw successfully completed. New balance: $ %.1f\n", balance);

                        break;
                }

                case 2 ->{

                        System.out.print("Deposit value: $ ");
                        deposit = scanner.nextFloat();
                        scanner.nextLine();

                        if (deposit <= 0) {
                            System.out.println("Invalid value.");
                            break;
                        }
                        if (deposit > 1000) {
                            balance += (deposit + 10);
                            System.out.println("A $10 bonus will be add.");
                        }

                        else {
                            balance += deposit;
                        }
                    System.out.printf("Deposit successfully completed. New balance: $ %.1f\n", balance);

                    break;
                }

                case 3 ->{
                    System.out.printf("Balance = $ %.2f%n", balance);

                    break;
                }

                case 4 ->{
                    System.out.println("Exiting system.");

                    return;
                }

                default -> {
                    System.out.println("Invalid option. Try again.");

                }

            }

        }while(true);
    }
}