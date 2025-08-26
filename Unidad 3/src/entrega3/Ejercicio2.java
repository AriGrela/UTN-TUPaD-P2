
package entrega3;

public class Ejercicio2 {
    public static void main(String[] args) {
        Mascotas Firulais = new Mascotas();
        
        Firulais.setEdad(4);
        Firulais.setEspecie("Labrador");
        Firulais.setNombre("Firulais");
        Firulais.mostrarInfo();
        Firulais.cumplirAnios();
        System.out.println("La nueva edad de Firu es: " + Firulais.getEdad());
        
        
    }
}
