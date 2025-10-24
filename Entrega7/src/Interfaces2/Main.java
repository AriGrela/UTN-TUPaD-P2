
package Interfaces2;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("1234");
        Reserva r = new Reserva();
        Automovil a = new Automovil();
        
        p.mostrarIdentificacion();
        r.mostrarIdentificacion();
        a.mostrarIdentificacion();
        
    }
}
