
package Ejercicio6;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
public Reserva(Date fecha, String hora, Cliente cliente, Mesa mesa){
    this.fecha=fecha;
    this.hora=hora;
    this.cliente=cliente;
    this.mesa=mesa;
}
}
