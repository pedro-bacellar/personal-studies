            // 52. getters and setters

public class Main {
    public static void main(String[] args){

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(-100);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
