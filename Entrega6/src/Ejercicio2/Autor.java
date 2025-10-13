
package Ejercicio2;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String autor, String nombre, String nacionalidad) {
        this.id = autor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Autor{" + "ID=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
