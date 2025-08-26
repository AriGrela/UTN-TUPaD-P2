
package entrega3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+ nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10){
        this.calificacion = calificacion;
      }
    }
    
    public double subirCalificacion (double puntos){
        if (puntos >= 0){
            calificacion = calificacion + puntos;
        }
        return calificacion;
    }
    public double bajarCalificacion (double puntos){
        if (puntos >= 0){
            calificacion = calificacion - puntos;
        }
        return calificacion;
    }
    
}