public abstract class PokemonAbstract implements PokemonInterface{
    public Pokemon createPokemon(String name, int health, String type)
    {
        Pokemon nuevo = new Pokemon(name, health, type);
        return nuevo;
    }

    public String pokemonInfo(Pokemon pokemon)
    {
        return "Nombre: "+pokemon.getName()+", Salud: "+pokemon.getHealth()+", tipo: "+pokemon.getType();
    }
}