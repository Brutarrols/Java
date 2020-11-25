
public class HumanTest {

	public static void main(String[] args) {
		
		Wizard mago = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		
		mago.fireBall(ninja);
		System.out.println("mago atacó a ninja. salud ninja: "+ ninja.health);
		ninja.runAway();
		System.out.println("ninja corre lejos. salud ninja: "+ ninja.health);
		
		samurai.deathBlow(mago);
		System.out.println("samurai asesina a mago. Salud mago:  "+ mago.health);
		
		ninja.steal(samurai);
		System.out.println("ninja ataca a samurai. salud ninja: "+ ninja.health);
		
		samurai.meditate();
		System.out.println("samurai medita . salud de samurai "+ samurai.health);
	}

}
