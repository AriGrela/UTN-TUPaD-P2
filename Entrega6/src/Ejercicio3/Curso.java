
package Ejercicio3;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
        this.setProfesor(profesor);
    }

    public void setProfesor(Profesor p){
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        
       if (p != null && !p.getCursos().contains(this))
       this.profesor.agregarCurso(this);
    }
    
    public void mostrarInfo(){
        System.out.println(this);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    
}
