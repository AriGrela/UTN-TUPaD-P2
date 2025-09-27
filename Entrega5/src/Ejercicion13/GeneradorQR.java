
package Ejercicion13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        // acá podrías imprimir, guardar o usar el QR
    }
}

