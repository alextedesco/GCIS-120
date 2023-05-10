import java.util.Comparator;

public class PokemonNameComparator implements Comparator<Pokemon> {

    public int compare (Pokemon pokemon_a, Pokemon pokemon_b) {
        String name_a = pokemon_a.getName ();
        String name_b = pokemon_b.getName();

        return name_a.compareTo(name_b);
    }
}
