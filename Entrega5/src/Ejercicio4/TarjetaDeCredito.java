
package Ejercicio4;
import java.util.Date;

public class TarjetaDeCredito {
    private int numero;
    private Date fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    
public TarjetaDeCredito(int numero, Date fechaVencimiento, Banco banco, Cliente cliente){
    this.numero=numero;
    this.fechaVencimiento=fechaVencimiento;
    this.banco=banco;
    this.cliente=cliente;
    cliente.setTarjeta(this);
}
}


