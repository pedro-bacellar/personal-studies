//      5. arithmetic

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double gradeV1, gradeV2, gradeV3, score;

        System.out.print("enter your v1 grade: ");
        gradeV1 = scanner.nextDouble();

        System.out.print("enter your v2 grade: ");
        gradeV2 = scanner.nextDouble();

        System.out.print("enter your v3 grade: ");
        gradeV3 = scanner.nextDouble();

        score = (gradeV1 + gradeV2 + gradeV3) / 3;

        System.out.println("your gpa is " + score + ".");

        scanner.close();


    }

}