import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int carsTotal = 3;

        System.out.println("===== CAR RENTAL =====");
        System.out.println();

        System.out.println("----- Cars available -----");
        System.out.println();
        System.out.println("1) Toyota Corolla  - Standard   - $45/day;");
        System.out.println("2) Honda Civic     - Economy    - $40/day;");
        System.out.println("3) Jeep Compass    - SUV        - $70/day;");
        System.out.println();
        System.out.println("--------------------------");

        //          ----- CARS INFORMATION -----

        String car1 = "Toyota Corolla";
        String car2 = "Honda Civic";
        String car3 = "Jeep Compass";

        double priceCar1 = 45.00;
        double priceCar2 = 40.00;
        double priceCar3 = 70.00;

        //          ----- CAR SELECTION -----

        int chosenCar = 0;

        do {
            System.out.print("\nEnter the number of the car: ");
            chosenCar = scanner.nextInt();
            scanner.nextLine();

            if (chosenCar < 1 || chosenCar > carsTotal){
                System.out.println("Invalid car number. Try again!");
            }

        }while (chosenCar < 1 || chosenCar > carsTotal);

        double carDailyPrice = 0;
        String carType = "";

        switch (chosenCar){

            case 1 ->{
                    carDailyPrice = priceCar1;
                    carType = car1;
            }

            case 2 ->{
                    carDailyPrice = priceCar2;
                    carType = car2;
            }

            case 3 ->{
                    carDailyPrice = priceCar3;
                    carType = car3;
            }

        }

        //          ----- DAYS SELECTION -----

        int days = 0;

        do{
            System.out.print("Enter the number of days to rent: ");
            days = scanner.nextInt();
            scanner.nextLine();

            if(days < 1){
                System.out.println("You need to choose 1 day or more. Try again!");
                System.out.println();
            }

        }while(days < 1);

        //          ----- INSURANCE SELECTION -----


        System.out.println();
        System.out.println("----- Insurance Prices ------");
        System.out.println();
        System.out.println("- Basic insurance: $10/day");
        System.out.println("- Full coverage - $20/day");
        System.out.println();
        System.out.println("-----------------------------");

        String insurance = "";

        do {
            System.out.print("Choose a insurance (basic or full): ");
            insurance = scanner.nextLine().trim().toLowerCase();

            if(!insurance.equals("basic") && !insurance.equals("full")){
                System.out.println("Invalid insurance. Try again!");
                System.out.println();
            }

        }while(!insurance.equals("basic") && !insurance.equals("full"));

        double insurancePrice = insurance.equals("basic") ? 10.0 : 20.0;
        String insuranceType = insurance.equals("basic") ? "Basic" : "Full";

        //          ----- TOTAL CALCULATIONS -----

        double rentTotal = days * carDailyPrice;
        double insuranceTotal = days * insurancePrice;
        double finalPrice = rentTotal + insuranceTotal;

        //          ----- SUMMARY -----

        System.out.println();
        System.out.println("===== RENT SUMMARY =====");
        System.out.println();
        System.out.printf("Car: %s%n", carType);
        System.out.printf("Days: %d%n", days);
        System.out.printf("Car daily price: $%.2f%n", carDailyPrice);
        System.out.printf("Insurance type: %s%n", insuranceType);
        System.out.printf("Insurance total: $%.2f%n", insuranceTotal);
        System.out.printf("Total to pay: $%.2f%n", finalPrice);
        System.out.println();
        System.out.println("========================");

        System.out.println("Thank you for using the Car Rental Service!");

        scanner.close();

    }
}
