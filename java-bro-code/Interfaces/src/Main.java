            // 49. interfaces

public class Main {
    public static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        System.out.println();
        fish.flee();
        fish.hunt();
    }
}
