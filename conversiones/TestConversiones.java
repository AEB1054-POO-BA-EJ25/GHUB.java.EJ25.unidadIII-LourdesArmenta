package conversiones;

public class TestConversiones {
    public static void main(String[] args) {
        int i = 5;
        double y = (double)i;
        System.out.println("valor de variable y:"+y); //coversion de tipos
        double x = 5.1516;
        int z = (int)x;
        System.out.println("valor de variable z:"+z); //coversion de tipos explicita

        int k = 10;
        double g = k; //conversión implicita

        double j = 10.0;
        int m = (int)j; //conversin explícita´

        Barco b1;
        Velero v1 = new Velero();
        DeVapor dp1 = new DeVapor();

        b1 = v1;//conversion automatica implicita
        b1 = dp1; //conversion automatica

        Carguero c1 = new Carguero();
        b1 = c1; //conversion automatica

        Barco barcos[] =  new Barco[3]; //se crea un arreglo de barcos de 3 elementos
        DeVapor deVapor = new DeVapor();
        Velero velero = new Velero();
        Carguero carguero = new Carguero();

        barcos[0]= deVapor;
        barcos[1]= velero;
        barcos[2]= carguero;

        System.out.println();

        for(int l=0;l<3;l++){
            barcos[l].alarma(); //barcos[0]
        }

        






    }
    
}
