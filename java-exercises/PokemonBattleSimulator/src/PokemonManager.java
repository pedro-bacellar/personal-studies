import java.util.ArrayList;

public class PokemonManager {

    ArrayList<Pokemon> pokemons = new ArrayList<>();

    PokemonManager() {
        pokemons.add(new Pokemon("Bulbasaur", "Grass", 45));
        pokemons.add(new Pokemon("Charmander", "Fire", 39));
        pokemons.add(new Pokemon("Squirtle", "Water", 44));
    }

    void listPokemon() {
        int i = 1;
        for (Pokemon pokemon : pokemons) {
            System.out.println(i + " - " + pokemon);
            i++;
        }
    }

    Pokemon getPokemonByIndex(int choicePokemon) {
        choicePokemon--;
        if (choicePokemon < 0) {
            System.out.println("Invalid pokemon option");
        }
        else {
            return pokemons.get(choicePokemon);
        }
        return null;
    }
}
