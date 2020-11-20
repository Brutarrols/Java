import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Proyect> proyects = new ArrayList<>();

    public Portfolio()
    {
     
    }
    
    public ArrayList<Proyect> getProyects() {
        return proyects;
    }
    public void setProyects(Proyect proyecto) {
        this.proyects.add(proyecto);
    }

    public double getPortfolioCost()
    {
        double total = 0;
        for (Proyect proyect : proyects) {
            total += proyect.getInitialcost();
        }     
        return total;
    }

    public void showPortfolio()
    {
        for (Proyect proyect : proyects) {
            System.out.println(proyect.elevatorPitch());
        }
    }
}
