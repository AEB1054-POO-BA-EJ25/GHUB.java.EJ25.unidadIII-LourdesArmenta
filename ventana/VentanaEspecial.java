package ventana;

public class VentanaEspecial extends Ventana{
    public void copiar(char c, int veces, int x, int y){
        System.out.println("Este es el metodo copiar de la clase derivada");
    }
    @Override
    public void copiar(Ventana x){
        System.out.println("estoy en el metodo copiar de la clase derivada: con un argumeto tipo Ventana");

    }
    public void metodos2(){
        System.out.println(super.marco2);
        System.out.println(super.marco3);
        System.out.println(super.marco4);

    }
   

    
}
