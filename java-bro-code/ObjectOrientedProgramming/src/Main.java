                // 39. object oriented programming

public class Main {
    public static void main(String[] args){

        Car car = new Car();

//      car.isRunning = true;

        car.start();
        car.drive();
        System.out.println();

        car.stop();
        car.brake();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println();



    }
}
