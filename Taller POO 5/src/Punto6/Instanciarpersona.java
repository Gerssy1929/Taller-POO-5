
package Punto6;


public class Instanciarpersona {
    
    public static void main(String[] args) {
        
        //persona1
        Persona a1 = new Persona ();
        
        Fecha fecha1=new Fecha();
        Dirección dirdomi1=new Dirección();
        Dirección dirtra1=new Dirección();
        a1.setFechanaci(fecha1);
        a1.setDirecdomicilio(dirdomi1);
        a1.setDirectrabajo(dirtra1);
        a1.imprimirdatos();
        
        //persona2
        Persona a2 = new Persona ("Nicole", "Sanchez");
        
        Fecha fecha2=new Fecha(2003);
        Dirección dirdomi2=new Dirección("Centro");
        Dirección dirtra2=new Dirección("Centro");
        a2.setFechanaci(fecha2);
        a2.setDirecdomicilio(dirdomi2);
        a2.setDirectrabajo(dirtra2);
        a2.imprimirdatos();
        
        //persona3
        Persona a3 = new Persona ("F");
        Fecha fecha3=new Fecha(8,20);
        Dirección dirdomi3=new Dirección("Don Carmelo", "La Garita");
        Dirección dirtra3=new Dirección("Don Carmelo", "La Garita");
        a3.setFechanaci(fecha3);
        a3.setDirecdomicilio(dirdomi3);
        a3.setDirectrabajo(dirtra3);
        a3.imprimirdatos();
        
    } 
}
