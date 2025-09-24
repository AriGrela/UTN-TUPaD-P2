
package Ejercicio2;


public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
public Celular(int imei, String marca, String modelo, Bateria bateria){
    this.imei= imei;
    this.marca= marca;
    this.modelo=modelo;
    this.bateria=bateria;
    
}

public void asignarUsuario(Usuario usuario){
    this.usuario=usuario;
    usuario.setCelular(this);
}
}
