import java.util.ArrayList;
import java.util.Collections;

public class Pokemon implements Comparable<Pokemon> {
    private String name;
    private int number;

    public Pokemon (int number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

@Override
    public int compareTo (Pokemon pokemon) {
        return this.number - pokemon.number; // Orders least to greatest
        // return pokemon.number - this.number; // Orders greatest to least
    }

    @Override
    public String toString() {
        return number + ": " + name;
    }

    public static void main(String[] args) {
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(new Pokemon(9, "Blastoise"));
        pokedex.add(new Pokemon(4, "Charmander"));
        pokedex.add(new Pokemon(6, "Charizard"));
        pokedex.add(new Pokemon(1, "Bulbasaur"));

        Collections.sort(pokedex);
        System.out.println(pokedex);
        Collections.sort(pokedex, new PokemonNameComparator());
        System.out.println(pokedex);

    }
    
}
