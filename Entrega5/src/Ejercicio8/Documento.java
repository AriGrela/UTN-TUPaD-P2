
package Ejercicio8;


import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; 

    public Documento(String titulo, String contenido, String hash, Date fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(hash, fecha, usuario);
    }
}

