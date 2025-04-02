package fecha;
import java.util.Scanner;

public class TestFecha3 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingresa Fecha 1 (dia,mes,anio):");
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int anio = entrada.nextInt();

        //crea un objeto Fecha
        Fecha f1 = new Fecha(dia,mes,anio);

        System.out.println("Ingresa Fecha 2 (dia,mes,anio):");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        anio = entrada.nextInt();
        
        //creamos otro objeto fecga
        Fecha f2;
        f2 = new Fecha(dia,mes,anio);

        //imprimimos las fechas
        System.out.println("Fecha 1:"+f1);
        System.out.println("Fecha 2:"+f2.toString());

        if(f1.equals(f2)){
            System.out.println("Las Fechas son iguales");
        }else{
            System.out.println("Las fechas son diferentes");
        }

       



        
    }
    
}
