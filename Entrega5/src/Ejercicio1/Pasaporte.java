
package Ejercicio1;

import java.util.Date;

public class Pasaporte {

    private int numero;
    private Date fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(int numero, Date fechaEmision,String imagen, String formato, Foto foto, Titular titular){
        this.numero=numero;
        this.fechaEmision= fechaEmision;
        this.foto= new Foto(imagen, formato);
        this.titular= titular;
        titular.setPasaporte(this);
    }
    
}
