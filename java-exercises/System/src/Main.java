import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String roomsName[] = {"Simple", "Double", "Suite"};
        int roomsPrice[] = {100, 180, 300};
        int roomsCapacity[] = {2, 4, 2};

        String fullName = getFullName(scanner);

        int age = getAge(scanner);

        int nights = getNights(scanner);

        int guestsNumber = getGuestsNumber(scanner);

        int chosenRoom = getChosenRoom(scanner, guestsNumber, age);

        do {
            int option = actionMenu(scanner);

            switch (option) {
                case 1 -> chosenRoom = getChosenRoom(scanner, guestsNumber, age);
                case 2 -> nights = getNights(scanner);
                case 3 -> guestsNumber = getGuestsNumber(scanner);
                case 4 -> showPartialSummary(fullName, age, roomsName[chosenRoom], nights, guestsNumber);
                case 5 -> {
                    System.out.println("Exiting System.");
                    return;
                }
            }
        }while (true);

    }

    //          ----- SIGN UP

    static String getFullName(Scanner scanner) {
        String fullName = "";

        do {
            System.out.print("Enter your full name: ");
            fullName = scanner.nextLine().trim();

            if (fullName.isEmpty() || fullName.length() < 3) {
                System.out.println("Invalid name.");
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
                System.out.println("Invalid age.");
                continue;
            } else if (age < 18) {
                System.out.println("Minors cant do a reservation.");
                continue;
            }
            return age;
        } while (true);
    }

    //          ----- NIGHTS OF STAY

    static int getNights(Scanner scanner) {

        int nights = 0;

        do {
            System.out.print("Enter the number of nights: ");
            nights = scanner.nextInt();
            scanner.nextLine();

            if (nights < 0) {
                System.out.println("Invalid number.");
                continue;
            }
            return nights;
        } while (true);
    }

    //          ----- NUMBER OF GUESTS

    static int getGuestsNumber(Scanner scanner) {
        int guestsNumber = 2;

        do {
            System.out.print("Enter the number of guests: ");
            guestsNumber = scanner.nextInt();
            scanner.nextLine();

            if (guestsNumber < 0) {
                System.out.println("Invalid number.");
                continue;
            }
            return guestsNumber;
        }while(true);
    }

    //          ----- BENEFIT DRAW

    static double benefit(int nights, double roomPrice){

        Random random = new Random();
        int roll = random.nextInt(1, 101);
        double total = nights * roomPrice;

        if(roll <= 10){
            System.out.println("Room upgrade.");
        }
        else if(roll <= 30){
            System.out.println("15% discount.");
            total *= 0.85;
        }
        else if(roll <= 60){
            System.out.println("Free breakfast");
        }
        else{
            System.out.println("Nothing.");
        }

        return total;

    }

    //          ----- ROOM CATALOG

    static int getChosenRoom(Scanner scanner, int guestsNumber, int age) {

        int roomsAvailable = 3;
        String roomsName[] = {"Simple", "Double", "Suite"};
        int roomsPrice[] = {100, 180, 300};
        int roomsCapacity[] = {2, 4, 2};
        int chosenRoom = 0;

        System.out.println("===== ROOM CATALOG =====");
        System.out.println();

        for (int i = 0; i < roomsName.length; i++) {

            System.out.print(i + 1 + " - ");
            System.out.print(roomsName[i] + " | ");
            System.out.print(roomsPrice[i] + " | ");
            System.out.print(roomsCapacity[i]);
            System.out.println();
        }
        System.out.println();

        do {
            System.out.print("Enter the room number: ");
            chosenRoom = scanner.nextInt();
            scanner.nextLine();

            if (chosenRoom < 1) {
                System.out.println("Invalid room.");
                System.out.println();
                continue;
            } else if (chosenRoom > roomsAvailable) {
                System.out.println("Invalid room");
                System.out.println();
                continue;
            }
            chosenRoom -= 1;

            if (roomsCapacity[chosenRoom] < guestsNumber) {
                System.out.println("This room doesn't have capacity for all guests. Please select another one.");
                System.out.println();
                continue;
            }
            if (chosenRoom == 2) {
                if (age < 21) {
                    System.out.println("You have to be 21+ to reserve this room.");
                    System.out.println();
                    continue;
                }
            }
            return chosenRoom;
        } while (true);
    }

    //          ----- ACTION MENU

    static int actionMenu(Scanner scanner){
        int option = 0;

        do {
            System.out.println("===== ACTION MENU =====");
            System.out.println();
            System.out.println("1 - Change room");
            System.out.println("2 - Change nights");
            System.out.println("3 - Change number of guests");
            System.out.println("4 - View partial summary");
            System.out.println("5 - Cancel reservation");
            System.out.println("6 - Finalize reservation");
            System.out.println();

            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option >= 1 && option <= 6){
                return option;
            }
            System.out.println("Invalid option.");

        }while(true);
    }

    //          ----- VALUE CALCULATION

    //          ----- SUMMARY

    static void showPartialSummary(String fullName, int age, String room, int nights, int guests){
        System.out.println("===== PARTIAL SUMMARY =====");
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Room: " + room);
        System.out.println("Nights: " + nights);
        System.out.println("Guests: " + guests);
        System.out.println();
    }

}