//      3. user input

//      importar package
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      calcular area do retangulo

        double width = 0, area = 0, height = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the width: ");
        width = scanner.nextDouble();

        System.out.print("enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("the area is " + area + "cm²");

/*        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();


        System.out.println("hello " + name + " !");
        System.out.println("you are " + age + " years old");
        System.out.println("your gpa is " + gpa);
 */

        scanner.close();



    }
}
