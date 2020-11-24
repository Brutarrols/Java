
public class Human {

	public int strength = 3, stealth = 3, intelligence = 3, health = 100;
	
	Human()
	{
		
	}
	
	public void attack(Human human)
	{
		human.health -= strength;
	}
}
