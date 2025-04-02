package fecha;
import java.util.Scanner;

public class TestFecha4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una Fecha (dd/mm/aaaa):");
        String sFecha = entrada.nextLine();

        //creamos el objeto
        Fecha f = new Fecha(sFecha);

        //mostra por pantala
        System.out.println("La Fecha ingresada es:"+f);

        
    }
    
}
