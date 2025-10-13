
package Ejercicio2;


public class Main {
    public static void main(String[] args) {
        
     Biblioteca b = new Biblioteca("Don Jorge");
     
     Autor marquez = new Autor("AD123", "Garcia Marquez", "Colombiano");
     Autor cortazar = new Autor("EX234", "Julio Cortazar", "Argentino");
     Autor allende = new Autor("AM2453", "Isabel Allende", "Chilena");
     
     b.agregarLibro("GGM01", "Cien anios de soledad", 1967, marquez);
     b.agregarLibro("GGM02", "El amor en los tiempos del colera", 1985, marquez);
     b.agregarLibro("GGM03", "Cronica de una muerte anunciada", 1981, marquez);
     b.agregarLibro("GGM04", "El coronel no tiene quien le escriba", 1961, marquez);
     b.agregarLibro("GGM05", "Del amor y otros demonios", 1994, marquez);
     
     System.out.println("------------");
     System.out.println("Listando libros:");
     b.listarLibros();

     System.out.println("------------");
     System.out.println("Buscando Libro: ");
     System.out.println(b.buscarLibroPorIsbn("GGM04"));
     
     System.out.println("------------");
     System.out.println("Filtrando por año: ");
     System.out.println(b.filtrarLibrosPorAnio(1967));
     
     System.out.println("------------");
     System.out.println("Eliminando por ISBN: ");
     b.eliminarLibro("GGM02");
     b.listarLibros();
     
     System.out.println("------------");
     System.out.println("Cantidad de libros: " + b.obtenerCantidadLibros());
     
     System.out.println("------------");
     b.autoresDisponibles();
    }
}
