public class Gorilla extends Mmmal{

    Gorilla()
    {
        
    }

    public void throwSomething()
    {
        energyLevel -= 5;
        System.out.println("El gorila ha lanzado algo. -5p de energia");
        super.desiplayEnergy();
    }
    
    public void eatBananas()
    {
        energyLevel += 10;
        System.out.println("El gorila ha comido Banana. +10p de energia");
        super.desiplayEnergy();
    }
    public void climb()
    {
        energyLevel -= 10;
        System.out.println("El gorila ha escalado. -10p de energia");
        super.desiplayEnergy();
    }

}
