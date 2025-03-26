package miPrincipal;
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
    public Revista(String editorial, String fecha, String periodicidad, int ejemplares){
        super(editorial, fecha);
        this.periodicidad = periodicidad;
        this.ejemplares = ejemplares;

    }
    //getter y setter
    


}
