
public class Samurai extends Human{
	
	Samurai()
	{
		super.health = 200;
	}
	
	public void deathBlow(Human human)
	{
		human.health = 0;
		health -= (health /2);
	}
	
	public void meditate()
	{
		health += (health /2);
	}
	
	public int howMany()
	{
		return health;
	}
}
