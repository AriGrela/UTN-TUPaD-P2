
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

public void agregarCurso(Curso c) {
    if (!cursos.contains(c)) {
        cursos.add(c);
    }
    
    if (c.getProfesor() != this) {
        c.setProfesor(this);
    }
}

public void eliminarCurso(Curso c){
    if (cursos.contains(c)) {
        cursos.remove(c) ;
    }
    
    if (c.getProfesor() == this){
        c.setProfesor(null);
    }
}

public void listarCursos() {
    if (cursos.isEmpty()) {
        System.out.println("El profesor " + nombre + " no tiene cursos asignados.");
        return;
    }

    System.out.println("Cursos dictados por " + nombre + ":");
    for (Curso curso : cursos) {
        System.out.println(curso);
    }
}


public void mostrarInfo(){
    System.out.println(this);
    System.out.println("El profesor tiene estos cursos:");
    for (Curso curso : cursos) {
        System.out.println(curso.getNombre());
        
    }
}

    public List<Curso> getCursos() {
        return cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    
    
    
@Override
public String toString() {
    StringBuilder cursosStr = new StringBuilder();
    for (Curso c : cursos) {
        cursosStr.append(c.getNombre()).append(", ");
    }
    if (!cursos.isEmpty()) {
        cursosStr.setLength(cursosStr.length() - 2); 
    }

    return "Profesor{" +
           "id=" + id +
           ", nombre='" + nombre + '\'' +
           ", especialidad='" + especialidad + '\'' +
           ", cursos=[" + cursosStr + "]}";
}

    
    
}
