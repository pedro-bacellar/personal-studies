            // 50. polymorphism

public class Main {
    public static void main(){

        Vehicle[] vehicles = {new Car(), new Bike(), new Boat()};

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.go());
        }
    }
}
