import java.util.Random;
import java.util.Scanner;

public class Main {

    static PokemonManager pokeManager = new PokemonManager();

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Pokemon pokeAlly;
        Pokemon pokeEnemy = pokeManager.getPokemonByIndex(2);

        boolean isRunning = true;

        System.out.println("--- POKEMON BATTLE SIMULATOR ---");
        int choicePoke = getChoicePoke(scanner);

        pokeAlly = pokeManager.getPokemonByIndex(choicePoke);

        while(isRunning) {

            System.out.println();
            int choiceMenu = getChoiceMenu(scanner);

            switch (choiceMenu) {
                case 1 -> {
                    pokeAlly.showStatus();
                    continue;
                }
                case 2 -> {
                    pokeAlly.attack(pokeEnemy);
                }
                case 3 -> pokeAlly.heal(random.nextInt(7, 10));
            }
            System.out.println();

            System.out.println(pokeEnemy.getName() + " attacked!");
            pokeAlly.takeDamage(random.nextInt(10, 20));

            if (!pokeAlly.isAlive()){
                System.out.println("Game over!");
                isRunning = false;
            }
            else if(!pokeEnemy.isAlive()){
                System.out.println("You win!");
                isRunning = false;
            }
        }
    }

    static int getChoicePoke(Scanner scanner){
        pokeManager.listPokemon();
        System.out.println();
        System.out.print("Choose your pokemon: ");
        return scanner.nextInt();
    }

    static int getChoiceMenu(Scanner scanner){
        System.out.println("--- MENU ---");
        System.out.println("1 - Status");
        System.out.println("2 - Attack");
        System.out.println("3 - Heal");
        System.out.print("Action: ");
        return scanner.nextInt();
    }
}
