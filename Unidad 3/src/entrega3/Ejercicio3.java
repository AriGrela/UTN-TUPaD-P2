
package entrega3;

public class Ejercicio3 {
    public static void main(String[] args) {
       Libro Jumanji = new Libro();
       
       Jumanji.setAutor("UTN");
       Jumanji.setTitulo("Jumanji");
       Jumanji.setAñoPublicacion(-1500);
       Jumanji.mostrarInfo();
       Jumanji.setAñoPublicacion(1990);
       Jumanji.mostrarInfo();
       
    }
}
