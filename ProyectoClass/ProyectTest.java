public class ProyectTest {
    public static void main(String[] args) {

        Proyect pro1,pro2,pro3;
        Portfolio proyecto = new Portfolio();

        pro1 = new Proyect("testeo1", "descripcion de test1");
        pro1.setInitialcost(11.1);

        pro2 = new Proyect("testeo2", "descripcion de test2");
        pro2.setInitialcost(22.2);

        pro3 = new Proyect("testeo3", "descripcion de test3");
        pro3.setInitialcost(33.3);

        proyecto.setProyects(pro1);
        proyecto.setProyects(pro2);
        proyecto.setProyects(pro3);

        System.out.println("El costo total es: "+ proyecto.getPortfolioCost());

        proyecto.showPortfolio();
    }
}
