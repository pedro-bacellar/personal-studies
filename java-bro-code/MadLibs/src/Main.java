//      4. mad libs

//      importar package para input
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.print("enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("enter an noun (an animal): ");
        noun1 = scanner.nextLine();

        System.out.print("enter an adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("enter a verb in the -ing form: ");
        verb1 = scanner.nextLine();

        System.out.print("enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\ntoday I went to a " + adjective1 + " zoo.");
        System.out.println("in a exhibit, I saw a " + noun1 + ".");
        System.out.println("the " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();


    }
}
