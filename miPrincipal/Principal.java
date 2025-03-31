package miPrincipal;
import java.util.Date;

import ventana.Ventana;

public class Principal {
    public static void main(String[] args) {
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGrawnHill");
        publicacion.setFecha(new Date("01/01/1989"));

       

        Libro libro = new Libro();
        Libro libro1 = new Libro("ISBN","Juan Collado");
        Libro libro2 = new Libro("AlfaOmega",new Date("12/05/2020"),"21122","Aurora Diaz");

        Revista revista = new Revista();
        revista.setEditorial("Porrua");
        revista.setFecha(new Date("8/11/2021"));
        revista.setPeriodicidad("mensual");
        revista.setEjemplares(200);

        System.out.println(publicacion);

        System.out.println(libro);
        System.out.println(libro1.toString());
        System.out.println(libro2);

        System.out.println(revista);

        System.out.println();
        //crear objetos tipo VentanaEspecial

        ventana.VentanaEspecial ventanaEspecial = new ventana.VentanaEspecial();
        Ventana ventana = new Ventana();
        ventanaEspecial.copiar(ventana);
        ventanaEspecial.copiar("******",5,10);
        ventanaEspecial.copiar('*',100,5,10);
        ventanaEspecial.copiar("XXXXXXXX",10.5F,9.3F);


        





        
    }
}