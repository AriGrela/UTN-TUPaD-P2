
package Ejercicio2;

public class Usuario {
    private String nombre;
    private int DNI;
    private Celular celular;
    
public Usuario(String nombre, int DNI){
    this.nombre=nombre;
    this.DNI=DNI;
}
    
    
public void setCelular(Celular celular){
    this.celular=celular;
}
}
