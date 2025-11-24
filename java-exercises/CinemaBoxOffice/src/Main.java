import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== WELCOME TO THE BOX OFFICE =====\n");
        System.out.println("- Movies available: \n");
        System.out.println("1) Whiplash;");
        System.out.println("2) Jurassic Park;");
        System.out.println("3) Elite Squad.");

        int movieNumber = 0;
        String movieName = "";

        do {
            System.out.print("\nEnter the number of the chosen movie: ");

            movieNumber = scanner.nextInt();
            scanner.nextLine();

            switch (movieNumber) {

                case 1 -> {
                    System.out.println("\nMovie showtimes: ");
                    System.out.println("13:00");
                    System.out.println("14:30");
                    System.out.println("16:00");
                    movieName = "Whiplash";

                }
                case 2 -> {
                    System.out.println("\nMovie showtimes: ");
                    System.out.println("11:00");
                    System.out.println("12:30");
                    System.out.println("14:00");
                    movieName = "Jurassic Park";

                }
                case 3 -> {
                    System.out.println("\nMovie showtimes: ");
                    System.out.println("15:00");
                    System.out.println("17:30");
                    System.out.println("19:00");
                    movieName = "Elite Squad";

                }
                default -> {
                    System.out.println("\nInvalid Movie.");
                }
            }
        }while (movieNumber < 1 || movieNumber > 3);

        System.out.println("\nEnter the chosen showtime: ");
        String showtime = scanner.nextLine();

        System.out.println("----- Ticket Prices -----");

        double ticketFullPrice = 20.00;
        double ticketHalfPrice = ticketFullPrice / 2;

        System.out.printf("\nFull ticket: %.2f", ticketFullPrice);
        System.out.printf("\nHalf ticket: %.2f", ticketHalfPrice);

        System.out.println();
        System.out.println("-------------------------");

        String ticketType = "";

        do{
            System.out.print("\nChoose your ticket type (Full or Half): ");
            ticketType = scanner.nextLine().trim().toLowerCase();

            if(!ticketType.equals("full") && !ticketType.equals("half")){
                System.out.println("Invalid ticket type.");
            }

        }while(!ticketType.equals("full") && !ticketType.equals("half"));

        String ticketTypeFormatted = ticketType.equals("full") ? "Full" : "Half";

        System.out.print("\nEnter the number of tickets to buy: ");
        int ticketAmount = scanner.nextInt();
        scanner.nextLine();

        double ticketTotalPrice = 0.0;

        switch(ticketType) {

            case "full" ->
                ticketTotalPrice = ticketFullPrice * ticketAmount;

            case "half" ->
                ticketTotalPrice = ticketHalfPrice * ticketAmount;
        }

        System.out.println();
        System.out.println("----- Purchase Summary -----");

        System.out.printf("\nMovie: %s", movieName);
        System.out.printf("\nShowtime: %s", showtime);
        System.out.printf("\nTicket type: %s", ticketTypeFormatted);
        System.out.printf("\nTicket amount: %d", ticketAmount);
        System.out.printf("\nTotal to pay: %.2f", ticketTotalPrice);

        System.out.println();
        System.out.println("----------------------------");

    }
}
