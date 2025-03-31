package ventana;

public class Ventana {
    //atributos
    private String marco;
    public String marco2;
    String marco3;
    protected String marco4;
    
    //constructores
    //metodos personalizados
    public void copiar(Ventana w){
        System.out.println("estoy en el metodo copiar de la clase base: con un argumeto tipo Ventana");

    }
    public final void copiar(String p, int x, int y){
        System.out.println("estoy en el metodo copiar de la clase base: con 3 argumetos tipo String,int,int");

    }
    public void copiar(String p, double x, double y){
        System.out.println("estoy en el metodo copiar de la clase base: con 3 argumetos tipo String,double,double");
    }


   
    //getter y setEditorial
    //sobreescritos

}
