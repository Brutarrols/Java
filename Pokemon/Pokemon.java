public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count;

    Pokemon(String name, int health, String type)
    {
       setHealth(health);
       setName(name);
       setType(type);
       this.count++;
    }
    public void attackPkokemon(Pokemon pokemon)
    {
        pokemon.health -= 10;
    }

    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    private void setHealth(int health) {
        this.health = health;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setType(String type) {
        this.type = type;
    }
    public static int getCount() {
        return count;
    }
    
}
