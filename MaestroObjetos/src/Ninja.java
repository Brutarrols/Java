
public class Ninja extends Human{

	Ninja()
	{
		super.stealth = 10;
	}
	
	public void steal(Human human)
	{
		human.health -= stealth;
		health += stealth;
	}
	public void runAway()
	{
		health -= 10;
	}
}
