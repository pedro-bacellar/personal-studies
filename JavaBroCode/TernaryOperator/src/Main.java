            // 16. ternary operator

public class Main {
    public static void main(String[] args) {

            // variable = (condition) ? "ifTrue" : "ifFalse";

            // example: pass or fail

        int score = 40;
        String PassOrFail = (score >= 50) ? "PASS" : "FAIL";

        System.out.println(PassOrFail);


            // example: even or odd

        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);


            // example: time of day

        int time = 10;
        String timeOfDay = (time >= 12) ? "P.M." : "A.M.";

        System.out.println(timeOfDay);

    }
}
