package miPrincipal;
import java.time.*;

public class Publicacion {
    //atributos
    private String editorial;
    private LocalDate fecha;
    String nacionalidad; //por omision
    protected String version; //protegida
    //constructores
    public Publicacion(){

    }
    public Publicacion(String editorial, LocalDate fecha){
        this.editorial = editorial;
        this.fecha = fecha;
    }
    public Publicacion(String nacionalidad, String version, String editorial, LocalDate fecha){
        this.nacionalidad = nacionalidad;
        this.version = version;
        this.editorial = editorial;
        this.fecha = fecha;
    }
    //getter y setter
    public String getEditorial(){
        return this.editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        return "Editorial:"+this.editorial+" Fecha:"+this.fecha;
    }


}
