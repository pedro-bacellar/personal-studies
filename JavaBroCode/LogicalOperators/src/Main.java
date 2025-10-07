            // 20. logical operators

public class Main {
    public static void main(String[] args) {

        int temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){             // && returns true when all conditions are true
            System.out.println("The weather is GOOD 😸");
            System.out.println("It is sunny outside ☀️");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny){      // ! returns the opposite value
            System.out.println("The weather is GOOD 😸");
            System.out.println("It is cloudy outside ☁️");
        }
        else if(temp < 0 || temp > 30){
            System.out.println("The weathers is BAD 😿");    // || returns true when at least one condition is true
        }

    }

}
