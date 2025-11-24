import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double a, b, c, delta, x1, x2;

        System.out.printf("enter the value of a: ");
        a = scanner.nextDouble();

        System.out.printf("enter the value of b: ");
        b = scanner.nextDouble();

        System.out.printf("enter the value of c: ");
        c = scanner.nextDouble();

        if(a == 0){
            System.out.printf("this is not a quadratic equation.");
        }
        else if(b == 0){

            double div;
            double sqrtDiv;

            div = -c / a;

            if(div < 0){
                System.out.printf("complex square root not supported.");
            }
            else {
                sqrtDiv = Math.sqrt(div);
                x1 = sqrtDiv;
                x2 = - sqrtDiv;

                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            }
        }
        else if(c == 0){

            x1 = - b / a;
            x2 = 0;

            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
        else {

            delta = Math.pow(b, 2) - 4 * a * c;

            if(delta < 0){
                System.out.printf("complex square root not supported (delta is negative).\n");
            }
            else{

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);


            }
        }

        scanner.close();

    }
}
