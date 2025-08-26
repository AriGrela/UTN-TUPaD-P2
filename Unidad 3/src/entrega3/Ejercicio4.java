package entrega3;

public class Ejercicio4 {
    public static void main(String[] args) {
    Gallina P = new Gallina();
    Gallina J = new Gallina();
    
    J.setIdGallina(1);
    J.setEdad(4);
    J.setHuevosPuestos(42);
    
    P.setIdGallina(2);
    P.setEdad(3);
    P.setHuevosPuestos(21);
    
    P.mostrarEstado();
    J.mostrarEstado();
    
    P.envejecer();
    P.ponerHuevo();
    J.envejecer();
    J.ponerHuevo();
    
    P.mostrarEstado();
    J.mostrarEstado();
        
    }
}
