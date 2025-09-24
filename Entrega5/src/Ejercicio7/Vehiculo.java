
package Ejercicio7;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente=patente;
        this.modelo=modelo;
        this.motor=motor;
    }
    
    public void asignarConductor(Conductor conductor){
        this.conductor=conductor;
        conductor.setVehiculo(this);
    }
}
