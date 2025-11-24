            // 12. nested if statements

public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.printf("you get a student discount of 10%%\n");
                System.out.printf("you get a senior discount of 20%%\n");

                price *= 0.7;
            }
            else {
                System.out.printf("you get a student discount of 10%%\n");

                price *= 0.9;
            }
        }
        else if(isSenior){
            System.out.printf("you get a senior discount of 20%%\n");

            price *= 0.8;
        }
        else{
            price *= 1;
        }

        System.out.printf("the price of a ticket is: %.2f\n", price);

    }
}