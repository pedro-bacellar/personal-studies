import java.util.Scanner;

public class Circle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.println("enter the radius:");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("the circumference is: %.2fcm", circumference);
        System.out.printf("\narea is: %.2fcm²", area);
        System.out.printf("\nthe volume is: %.2fcm³", volume);

    }
}