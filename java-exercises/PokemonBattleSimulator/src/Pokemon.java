public class Pokemon {

    private final String name;
    private final String type;
    private int level;
    private int currentHp;
    private int hpMax;

    Pokemon(String name, String type, int hpMax){
        this.name = name;
        this.type = type;
        this.hpMax = hpMax;
        this.level = 1;
        this.currentHp = hpMax;

        if(hpMax <= 0){
            hpMax = 50;
        }
    }

    void showStatus(){
        System.out.println("Pokemon: " + name);
        System.out.println("Type: " + type);
        System.out.println("Level: " + level);
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    void takeDamage(int damage){
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
    void train(){
        level++;
        hpMax += 10;
        currentHp += 10;

        if(currentHp > hpMax){
            currentHp = hpMax;
        }
    }

    String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Pokemon: " + name + " | Type: " + type + " | HP: " + currentHp + "/" + hpMax;
    }
}
