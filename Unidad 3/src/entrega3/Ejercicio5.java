package entrega3;

public class Ejercicio5 {
 
    public static void main(String[] args) {
    NaveEspacial Tope = new NaveEspacial();
    
    Tope.setNombre("Tope");
    Tope.setCombustible(50);
    
    Tope.despegar();
    Tope.avanzar(60);
    Tope.recargarCombustible(30);
    Tope.avanzar(60);
    
    Tope.mostrarEstado();
 }
}
