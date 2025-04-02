package fecha;

public class Fecha {
    //atributos
    private int dia;
    private int mes;
    private int anio;
    //constructores
    public Fecha(){
        this.dia=1;
        this.mes =1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //getter y setter
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    @Override
    public String toString(){
        return this.dia+"/"+mes+"/"+anio;
    }
    //sobrecarcarga el metodo equals que hereda de object
    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha)o; //convierte el argumento o que es tipo Object a tipo Fecha a traves de una operacion de cast
        return (this.dia ==otra.dia) && (this.mes ==otra.mes) && (this.anio==otra.anio) ;


    }
    
}
