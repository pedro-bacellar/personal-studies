            // 25. nested loops

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);
        scanner.nextLine();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("%c", symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}