
package Ejercicion13;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
}
