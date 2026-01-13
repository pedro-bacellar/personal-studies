            // 44. inheritance

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.lives);
        dog.speak();

        System.out.println(cat.lives);
        cat.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}
