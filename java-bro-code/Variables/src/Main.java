//      2. variables

public class Main {
    public static void main(String[] args) {

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 59999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "pedro som";
        String food = "estrogonofe";
        String email = "pedrofrancabacellar@gmail.com";
        String car = "civic";
        String color = "blue";

        /*

        System.out.println("hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("your gpa is " + gpa);
        System.out.println("your average letter grade is: " + grade);

        */

        System.out.println("your choice is a " + color + " " + year + " " +car);
        System.out.println("the price is " + currency + price);

        if(forSale){
            System.out.println("there is a " + car + " for sale");
        }else{
            System.out.println("the " + car + " is not for sale");
        }


    }

}