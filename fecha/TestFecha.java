package fecha;

public class TestFecha {
    public static void main(String[] args) {
        //Fecha f = new Fecha();
        Fecha f; //defino el tipo
        f = new Fecha(); //inicializo la variable utilizando un constructor por default

        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        //imprimimos el dia
        System.out.println("Dia="+f.getDia());
        //mes
        System.out.println("Mes="+f.getMes());
        //Anio
        System.out.println("Anio="+f.getAnio());
        //impromimos la fecha
        System.out.println(f);

        Fecha f2;
        f2 = new Fecha();
         //imprimimos el dia
         System.out.println("Dia="+f2.getDia());
         //mes
         System.out.println("Mes="+f2.getMes());
         //Anio
         System.out.println("Anio="+f2.getAnio());
         //impromimos la fecha
         System.out.println(f2);



        


        
    }
    
}
