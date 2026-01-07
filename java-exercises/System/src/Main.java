import java.util.Random;
import java.util.Scanner;

public class Main {

    static final String[] ROOMS_NAME = {"Simple", "Double", "Suite"};
    static final double[] ROOMS_PRICE = {100, 180, 300};
    static final int[] ROOMS_CAPACITY = {2, 4, 2};


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName = getFullName(scanner);

        int age = getAge(scanner);

        int nights = getNights(scanner);

        int guestsNumber = getGuestsNumber(scanner);

        int chosenRoom = getChosenRoom(scanner, guestsNumber, age);

        double discount = getBenefitDiscount();

        double total = calculateTotal(ROOMS_PRICE[chosenRoom], nights, discount);


        boolean continueLoop = true;

        do {
            System.out.println();
            System.out.printf("Total: %.2f", total);
            System.out.println();
            System.out.println();

            int option = getOptionMenu(scanner);

            switch (option) {
                case 1 -> chosenRoom = getChosenRoom(scanner, guestsNumber, age);
                case 2 -> nights = getNights(scanner);
                case 3 -> guestsNumber = getGuestsNumber(scanner);
                case 4 -> showPartialSummary(fullName, age, ROOMS_NAME[chosenRoom], nights, guestsNumber);
                case 5 -> {
                    System.out.println("Exiting system.");
                    return;
                }
                case 6 -> {
                    System.out.println("Finalizing reservation...");
                    continueLoop = false;
                }
            }
            total = calculateTotal(ROOMS_PRICE[chosenRoom], nights, discount);
        } while (continueLoop);

        int installments = 1;

        if (isInstallment(scanner)) {
            double partialTotal = 0.0;

                System.out.println("Installment options: ");
                System.out.println();

                do{

                installments = 2;
                partialTotal = total * getCompoundFactor(installments);
                System.out.printf("2x - Total: %.2f", partialTotal);
                System.out.println();

                installments = 3;
                partialTotal = total * getCompoundFactor(installments);
                System.out.printf("3x - Total: %.2f", partialTotal);
                System.out.println();

                installments = 6;
                partialTotal = total * getCompoundFactor(installments);
                System.out.printf("6x - Total: %.2f", partialTotal);
                System.out.println();

                installments = 12;
                partialTotal = total * getCompoundFactor(installments);
                System.out.printf("12x - Total: %.2f", partialTotal);
                System.out.println();

                System.out.println();
                System.out.print("How many installments would you like? (only numbers): ");
                installments = scanner.nextInt();
                scanner.nextLine();

                if (installments == 2 || installments == 3 || installments == 6 || installments == 12) {
                    total *= getCompoundFactor(installments);
                    break;
                }
                System.out.println("Invalid option.");
            } while (true);
        }
        showSummary(fullName, age, ROOMS_NAME[chosenRoom], nights, guestsNumber, total, installments);
    }


    static String getFullName(Scanner scanner) {
        String fullName = "";

        do {
            System.out.print("Enter your full name: ");
            fullName = scanner.nextLine().trim();

            if (fullName.isEmpty() || fullName.length() < 3) {
                System.out.println("Invalid name. Please enter a valid name.");
                System.out.println();
                continue;
            }
            return fullName;
        } while (true);
    }


    static int getAge(Scanner scanner) {
        int age = 0;

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            scanner.nextLine();

            if (age < 0) {
                System.out.println("Invalid age. Please enter a valid age.");
                continue;
            } else if (age < 18) {
                System.out.println("Minors cannot make a reservation.");
                continue;
            }
            return age;
        } while (true);
    }


    static int getNights(Scanner scanner) {

        int nights = 0;

        do {
            System.out.print("Enter the number of nights: ");
            nights = scanner.nextInt();
            scanner.nextLine();

            if (nights <= 0) {
                System.out.println("Invalid number of nights.");
                continue;
            }
            return nights;
        } while (true);
    }


    static int getGuestsNumber(Scanner scanner) {
        int guestsNumber = 2;

        do {
            System.out.print("Enter the number of guests: ");
            guestsNumber = scanner.nextInt();
            scanner.nextLine();

            if (guestsNumber <= 0) {
                System.out.println("Invalid number of guests.");
                continue;
            }
            return guestsNumber;
        } while (true);
    }


    static double getBenefitDiscount() {

        Random random = new Random();
        int roll = random.nextInt(1, 101);

        if (roll <= 10) {
            System.out.println("You received a room upgrade.");
        } else if (roll <= 30) {
            System.out.println("You received a 15% discount.");
            return 0.85;
        } else if (roll <= 60) {
            System.out.println("Free breakfast included");
        } else {
            System.out.println("No benefits applied.");
        }
        return 1.0;
    }


    static double calculateTotal(double roomsPrice, int nights, double discount) {
        double extraFee = nights > 7 ? 150.0 : 0.0;
        return ((nights * roomsPrice) * discount) + extraFee;
    }


    static int getChosenRoom(Scanner scanner, int guestsNumber, int age) {

        int chosenRoom = 0;

        System.out.println();
        System.out.println("===== ROOM CATALOG =====");
        System.out.println();

        for (int i = 0; i < ROOMS_NAME.length; i++) {

            System.out.print(i + 1 + " - ");
            System.out.print(ROOMS_NAME[i] + " | ");
            System.out.print(ROOMS_PRICE[i] + " | ");
            System.out.print(ROOMS_CAPACITY[i]);
            System.out.println();
        }
        System.out.println();

        do {
            System.out.print("Enter the room number: ");
            chosenRoom = scanner.nextInt();
            scanner.nextLine();

            if (chosenRoom < 1 || chosenRoom > ROOMS_NAME.length) {
                System.out.println("Invalid room selection.");
                System.out.println();
                continue;
            }
            chosenRoom --;

            if (ROOMS_CAPACITY[chosenRoom] < guestsNumber) {
                System.out.println("This room doesn't have enough capacity for all guests. Please select another one.");
                System.out.println();
                continue;
            }
            if (chosenRoom == 2 && age < 21) {
                System.out.println("You must be 21 or older to reserve this room.");
                System.out.println();
                continue;
            }
            return chosenRoom;
        } while (true);
    }


    static int getOptionMenu(Scanner scanner) {
        int option = 0;

        do {
            System.out.println("===== MENU OPTIONS =====");
            System.out.println();
            System.out.println("1 - Change room");
            System.out.println("2 - Change number of nights");
            System.out.println("3 - Change number of guests");
            System.out.println("4 - View partial summary");
            System.out.println("5 - Cancel reservation");
            System.out.println("6 - Finalize reservation");
            System.out.println();

            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option >= 1 && option <= 6) {
                return option;
            }
            System.out.println("Invalid option.");

        } while (true);
    }


    static void showPartialSummary(String fullName, int age, String room, int nights, int guests) {
        System.out.println("===== PARTIAL SUMMARY =====");
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println();
        System.out.println("Room: " + room);
        System.out.println("Nights: " + nights);
        System.out.println("Guests: " + guests);
    }


    static double getCompoundFactor(int installments) {

        return Math.pow(1.02, installments);

    }


    static boolean isInstallment(Scanner scanner) {
        String option = "";

        do {
            System.out.print("Do you want to pay in installments? (yes or no): ");
            option = scanner.nextLine().trim().toLowerCase();

            if (option.equals("yes") || option.equals("y")) return true;
            if (option.equals("no") || option.equals("n")) return false;

            System.out.println("Invalid option.");
            System.out.println();
        } while (true);
    }


    static void showSummary(String fullName, int age, String room, int nights, int guests, double total, int installments){

        System.out.println("===== SUMMARY =====");
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println();
        System.out.println("Room: " + room);
        System.out.println("Nights: " + nights);
        System.out.println("Guests: " + guests);
        System.out.println();
        System.out.printf("Installments: %dx", installments);
        System.out.println();
        System.out.printf("Total: %.2f", total);

    }
}