package conversiones;

public class Barco {
    //constructor
    public Barco(){
        System.out.println("\tSe crea una parte de un Barco");
    }
    //metodo personalizado
    public void alarma(){
        System.out.println("\tSOS desde un Barco");

    }
    public void alarma(String msg){
        System.out.println("\tMensaje:"+msg+"  enviado desde un Barco");

    }

    
}
