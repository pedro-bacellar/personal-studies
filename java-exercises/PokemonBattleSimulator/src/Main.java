import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        PokemonManager pokeManager = new PokemonManager();

        Pokemon pokeAlly;
        Pokemon pokeEnemy = pokeManager.getPokemonByIndex(2);

        int choicePokemon;
        int choiceMenu;
        boolean isRunning = true;

        System.out.println("--- POKEMON BATTLE SIMULATOR ---");
        pokeManager.listPokemon();
        System.out.println();
        System.out.print("Choose your pokemon: ");
        choicePokemon = scanner.nextInt();

        pokeAlly = pokeManager.getPokemonByIndex(choicePokemon);

        while(isRunning) {
            System.out.println();
            System.out.println("--- MENU ---");
            System.out.println("1 - Status");
            System.out.println("2 - Attack");
            System.out.println("3 - Heal");
            System.out.println("4 - Train");
            System.out.println("5 - Leave");
            System.out.print("Action: ");
            choiceMenu = scanner.nextInt();

            switch (choiceMenu) {
                case 1 -> {
                    pokeAlly.showStatus();
                    continue;
                }
                case 2 -> {
                    pokeAlly.attack(pokeEnemy);
                }
                case 3 -> pokeAlly.heal(random.nextInt(7, 10));
                case 4 -> pokeAlly.train();
                case 5 -> {
                    isRunning = false;
                    return;
                }
            }
            System.out.println();

            System.out.println(pokeEnemy.getName() + " attacked!");
            pokeAlly.takeDamage(random.nextInt(10, 20));
        }
    }
}
