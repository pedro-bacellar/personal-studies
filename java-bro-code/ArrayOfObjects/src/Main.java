public class Main {
    public static void main(String[] args){

        Car[] cars = {new Car("Mustang", "Red"), new Car("Corvette", "Blue"), new Car("Charger", "Yellow")};    // anonymous objects

        for(Car car : cars){
            car.drive();
        }
    }
}
