
package Ejercicio1;


public class Titular {
    private String nombre;
    private int DNI;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, int DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
    }
}
