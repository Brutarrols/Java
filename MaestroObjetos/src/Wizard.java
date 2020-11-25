
public class Wizard extends Human {
	
	Wizard()
	{
		super.health = 50;
		super.intelligence = 8;
	}
	
	public void heal(Human human)
	{
		human.health *= 3;
	}
	
	public void fireBall(Human human)
	{
		human.health -= (intelligence * 3); 
	}
}
