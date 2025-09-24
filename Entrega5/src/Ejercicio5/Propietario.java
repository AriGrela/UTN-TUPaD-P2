
package Ejercicio5;


public class Propietario {
    private String nombre;
    private int DNI;
    private Computadora computadora;
    
 
public Propietario(String nombre, int DNI){
   this.nombre=nombre;
   this.DNI=DNI;
}

public void setComputadora(Computadora computadora){
    this.computadora=computadora;
    
}
}
