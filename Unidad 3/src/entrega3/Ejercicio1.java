
package entrega3;

public class Ejercicio1 {

    public static void main(String[] args) {
        Estudiante Ariel = new Estudiante();
        
        Ariel.setNombre("Ariel");
        Ariel.setApellido("Grela");
        Ariel.setCurso("Primero");
        Ariel.setCalificacion(7.0);
        
        Ariel.mostrarInfo();
        
        Ariel.subirCalificacion(1.5);
        System.out.println(Ariel.getCalificacion());
        Ariel.bajarCalificacion(5.0);
        System.out.println(Ariel.getCalificacion());
         }
    
}
