public class TestPokemon {
    public static void main(String[] args) {
     
        Pokedex pdx = new Pokedex();
        Pokemon p1 = new Pokemon("Bulbasaur", 100, "Hierba");
        Pokemon p2 = new Pokemon("Charmander", 100, "Fuego");

        pdx.mispokemones.add(p1);
        pdx.mispokemones.add(p2);

        pdx.listPokemon();

        p2.attackPkokemon(p1);
        System.out.println("Charmander usó lanzallamas contra Bulbasaur. vida de Bulbasaur: "+ p1.getHealth());

    }
}
