public class Pokemon {

    String name;
    String type;
    int level;
    int currentHp;
    int hpMax;

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
        System.out.println("Pokemon: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    void damage(int damage){
        if(damage <= 0){
            System.out.println("It didn't affect...");
        }
        else if(damage > this.currentHp){
            this.currentHp = 0;
            System.out.println(this.name + " fainted!");
        }
        else{
            currentHp -= damage;
        }
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    void healing(int heal){
        currentHp += heal;
        if(this.currentHp > this.hpMax){
            this.currentHp = this.hpMax;
        }
        System.out.println(this.name + " had its HP restored by " + heal + " points!");
        System.out.println("HP: " + currentHp + "/" + hpMax);
    }
    boolean isAlive(){
        return currentHp > 0;
    }
    void training(){
        this.level++;
        this.hpMax += 10;
        this.currentHp += 10;

        if(this.currentHp > this.hpMax){
            this.currentHp = this.hpMax;
        }
    }
}
