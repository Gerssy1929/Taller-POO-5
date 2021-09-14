
package Punto6;


public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        
        this.dia=19;
        this.mes=03;
        this.año=2002;
    }
    
    public Fecha(int año) {
        
        this.dia=15;
        this.mes=12;
        this.año=año;
    }
    
    
    public Fecha(int mes, int dia) {
        
        this.dia=dia;
        this.mes=mes;
        this.año=1996;
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
