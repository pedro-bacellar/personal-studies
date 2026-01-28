import java.util.Random;

public class Pokemon {

    private final String name;
    private final String type;
    private int level;
    private double currentHp;
    private double hpMax;

    Pokemon(String name, String type, double hpMax){
        this.name = name;
        this.type = type;
        this.hpMax = hpMax;
        this.level = 1;
        this.currentHp = hpMax;

        if(hpMax <= 0){
            hpMax = 50;
        }
    }

    Random random = new Random();

    void takeDamage(double damage){
        if(damage <= 0){
            System.out.println("It didn't affect...");
        }
        else if(damage > currentHp){
            currentHp = 0;
            System.out.println(name + " fainted!");
        }
        else{
            currentHp -= damage;
            System.out.println(name + " lost " + damage + " points of its health!");
        }
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    void attack(Pokemon pokeDefender){
        System.out.println(getName() + " attacked!");
        pokeDefender.takeDamage(random.nextDouble(10, 20) * calculateDamageMultiplier(pokeDefender));
    }
    void heal(int heal){
        currentHp += heal;
        if(currentHp > hpMax){
            currentHp = hpMax;
        }
        System.out.println(name + " had its HP restored by " + heal + " points!");
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    boolean isAlive(){
        return currentHp > 0;
    }

    double calculateDamageMultiplier(Pokemon pokeDefender){
        if(getType().equalsIgnoreCase("Fire")){
            if(pokeDefender.getType().equalsIgnoreCase("Grass")){
                System.out.println("It's super effective!");
                return 2.0;
            }
            else if (pokeDefender.getType().equalsIgnoreCase("Water")){
                System.out.println("It's not very effective...");
                return 0.5;
            }
            else {
                return 1.0;
            }
        }
        else if(getType().equalsIgnoreCase("Water")){
            if(pokeDefender.getType().equalsIgnoreCase("Grass")){
                System.out.println("It's not very effective...");
                return 0.5;
            }
            else if (pokeDefender.getType().equalsIgnoreCase("Fire")){
                System.out.println("It's super effective!");
                return 2.0;
            }
            else {
                return 1.0;
            }
        }
        else if(getType().equalsIgnoreCase("Grass")){
            if (pokeDefender.getType().equalsIgnoreCase("Fire")){
                System.out.println("It's not very effective...");
                return 0.5;
            }
            else if (pokeDefender.getType().equalsIgnoreCase("Water")){
                System.out.println("It's super effective!");
                return 2.0;
            }
            else {
                return 1.0;
            }
        }
        return 1.0;
    }

    void showStatus(){
        System.out.println("Pokemon: " + name);
        System.out.println("Type: " + type);
        System.out.println("Level: " + level);
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    String getType(){
        return type;
    }
    String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Pokemon: " + name + " | Type: " + type + " | HP: " + currentHp + "/" + hpMax;
    }
}
