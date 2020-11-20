public class Proyect {

    private String nombre;
    private String descripcion;
    private double initialcost;

    public Proyect(){

    }
    
    public Proyect(String nombre){
        this.nombre = nombre;
    }

    public Proyect(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Proyect(String nombre, String descipcion, float initialcost)
    {
        this.nombre = nombre;
        this.descripcion = descipcion;
        this.initialcost = initialcost;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getInitialcost() {
        return initialcost;
    }
    public void setInitialcost(double initialcost) {
        this.initialcost = initialcost;
    }

    public String elevatorPitch()
    {
        return nombre +" ("+initialcost+") : "+ descripcion;
    }
}
