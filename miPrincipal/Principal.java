package miPrincipal;
import java.time.*;

import ventana.Ventana;

public class Principal {
    public static void main(String[] args) {
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGrawnHill");
        publicacion.setFecha(LocalDate.parse("1989-01-01"));

       

        Libro libro = new Libro();
        Libro libro1 = new Libro("ISBN","Juan Collado");
        Libro libro2 = new Libro("AlfaOmega",LocalDate.parse("2020-05-12"),"21122","Aurora Diaz");

        Revista revista = new Revista();
        revista.setEditorial("Porrua");
        revista.setFecha(LocalDate.parse("2021-11-08"));
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