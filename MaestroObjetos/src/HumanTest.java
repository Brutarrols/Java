
public class HumanTest {

	public static void main(String[] args) {
		Human Wizard = new Human();
		Human Ninja = new Human();
		Human Samurai = new Human();
		
		Wizard.attack(Ninja);
		System.out.println("Wizar atacó a Ninja. Salud de Ninja:" +Ninja.health);
		

	}

}
