
package Ejercicio4;

public class Cliente {
    private String nombre;
    private int DNI;
    private TarjetaDeCredito tarjetaDeCredito;

public Cliente(String nombre, int DNI){
    this.nombre=nombre;
    this.DNI=DNI;
    
}   

public void setTarjeta(TarjetaDeCredito tarjetaDeCredito){
    this.tarjetaDeCredito=tarjetaDeCredito;
    }
}

