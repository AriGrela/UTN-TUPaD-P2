
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
    Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
    libros.add(nuevoLibro);
    System.out.println("Libro agregado: " + titulo + " (" + isbn + ")");
    }
    
    public void listarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
    int i = 0;
        Libro prodEncontrado = null;
        while(i < libros.size() && !this.libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        if( i < libros.size()){
            prodEncontrado = this.libros.get(i);
        }
        return prodEncontrado;
    }
    
public void eliminarLibro(String isbn) {
    Libro libroABorrar = buscarLibroPorIsbn(isbn);
    if (libroABorrar != null) {
        libros.remove(libroABorrar);
        System.out.println("Libro eliminado: " + libroABorrar.getTitulo());
    } else {
        System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
    }
}

public int obtenerCantidadLibros(){
    return libros.size();
}

public List<Libro> filtrarLibrosPorAnio(int Anio){
  List<Libro> librosEnRango = new ArrayList<>();
    for (Libro libro : libros) {
        if(libro.getAnio() == Anio){
            librosEnRango.add(libro);
        }
    }
    return librosEnRango;
}

public void autoresDisponibles(){
    if (libros.isEmpty()) {
        
        System.out.println("No hay libros registrados en la biblioteca.");
        return;
    }
    
    System.out.println("Autores disponibles en la biblioteca:");

    ArrayList<Autor> autoresMostrados = new ArrayList<>();

    for (Libro libro : libros) {
        Autor autorActual = libro.getAutor();

        if (!autoresMostrados.contains(autorActual)) {
            System.out.println(autorActual);
            autoresMostrados.add(autorActual);
        }
    }
}
}
