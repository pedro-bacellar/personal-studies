//      8. random numbers

import java.util.Random;

public class Main {
    public static void main(String[] args){

    Random random = new Random();

    int number;
    boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads){
            System.out.println("heads");
        }
        else {
            System.out.println("tails");
        }

    number = random.nextInt(1, 11);

        System.out.println(number);


    }
}
