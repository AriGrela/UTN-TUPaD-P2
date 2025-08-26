package entrega3;
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public void mostrarInfo() {
        System.out.println("Titulo: "+ titulo + "\nAutor: " + autor + "\nAño de publicacion:: " + anioPublicacion ); 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return anioPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025){
            this.anioPublicacion = añoPublicacion;
        }
    }
    
    
}
