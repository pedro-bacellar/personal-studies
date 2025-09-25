// 10. printf

public class FlagsAndPrecision {
    public static void main(String[] args) {

        // flags and precision

        double price1 = 9.9900;
        double price2 = 900000000.990;
        double price3 = -9.990;
        double price4 = 9.990;
        double price5 = -9.990;

        System.out.printf("%+.2f\n", price1);       // output plus for positive
        System.out.printf("%,.2f\n", price2);       // commom for each thousands
        System.out.printf("%(.2f\n", price3);       // parentheses for negative numbers
        System.out.printf("% .2f\n", price4);       // space for positive numbers (good to organize numbers)
        System.out.printf("% .2f\n\n", price5);     // nothing changes for negative numbers

    }
}