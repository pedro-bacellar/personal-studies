import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("enter the length of side A:");
        a = scanner.nextDouble();

        System.out.println("enter the length of side B:");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("\nthe hypotenuse (side C) is:\n" + c);



        scanner.close();

    }
}