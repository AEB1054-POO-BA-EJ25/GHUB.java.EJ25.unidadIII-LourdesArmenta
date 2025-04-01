package miPrincipal;
import java.time.*;
public class Revista extends Publicacion{
    //atributos
    private String periodicidad;
    private int ejemplares;
    //constructors
    public Revista(){
        super();
    }
    public Revista(String periodicidad, int ejemplares){
        super("sin editorial",null);
        this.periodicidad = periodicidad;
        this.ejemplares = ejemplares;

    }
    public Revista(String editorial, LocalDate fecha, String periodicidad, int ejemplares){
        super(editorial, fecha);
        this.periodicidad = periodicidad;
        this.ejemplares = ejemplares;

    }
    //getter y setter
    public String getPeriodicidad(){
        return this.periodicidad;
    }
    public void setPeriodicidad( String periodicidad){
        this.periodicidad = periodicidad;
    }
    public int getEjemplares(){
        return this.ejemplares;
    }
    public void setEjemplares( int ejemplares){
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString(){
        return super.toString()+" Periodicidad: "+this.periodicidad+" Ejemplares: "+ejemplares;
    }


    


}
