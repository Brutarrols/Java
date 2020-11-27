import java.util.ArrayList;

public class Pokedex extends PokemonAbstract {
    
    ArrayList<Pokemon> mispokemones = new ArrayList<>();
    private int mypokemons;

    Pokedex()
    {
        this.mypokemons = Pokemon.getCount();
    }
    public void listPokemon()
    {
        

        for (Pokemon pokemon : mispokemones) {
            System.out.println(pokemon.getName());
        }
    }
}
