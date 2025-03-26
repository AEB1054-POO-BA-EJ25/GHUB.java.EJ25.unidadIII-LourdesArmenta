package miPrincipal;
public class Publicacion {
    //atributos
    private String editorial;
    private String fecha;
    //constructores
    public Publicacion(){

    }
    public Publicacion(String editorial, String fecha){
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
    public String getFecha(){
        return this.fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        return "Editorial:"+this.editorial+" Fecha:"+this.fecha;
    }


}
