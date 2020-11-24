public class Bat extends Mmmal{
    Bat()
    {
        super.energyLevel = 300;
    }

    public void fly()
    {
        energyLevel -= 50;
        System.out.println("El murcielago aletea y se eleva en el aire. -50p de energia");
        super.desiplayEnergy();
    } 
    public void eatHumans()
    {
        energyLevel += 25;
        System.out.println("Bueno no importa. +25p de energia");
        super.desiplayEnergy();
    }
    public void attackTown()
    {
        energyLevel -= 100;
        System.out.println("gente gritando, sirenas de policia, la ciudad en llamas. -100p de energia");
        super.desiplayEnergy();
    }
}
