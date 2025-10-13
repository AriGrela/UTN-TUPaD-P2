
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
public void agregarProfesor(Profesor p) {
    if (!profesores.contains(p)) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    } else {
        System.out.println("El profesor " + p.getNombre() + " ya está en la universidad.");
    }
}

public void agregarCurso(Curso C){
    if (!cursos.contains(C)){
        cursos.add(C);
        System.out.println("Curso agregado: " + C.getNombre());
    } else {
        System.out.println("El curso " + C.getNombre() + " ya esta en la universidad.");
    }
}

public void asignarProfesorACurso(String codigoCurso, String idProfesor){
    for (Curso curso : cursos) {
        if(curso.getCodigo().equals(codigoCurso)){
            for (Profesor profesor : profesores) {
                if(profesor.getId().equals(idProfesor)){
                    curso.setProfesor(profesor);
                    System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
                    return;
                }
            }
            System.out.println("No se encontro profesor con ID: " + idProfesor);
            return;
        }
    }
    System.out.println("No se encontro un curso con código: " + codigoCurso);
}
 
public void listarProfesores() {
    if (profesores.isEmpty()) {
        System.out.println("No hay profesores registrados en la universidad.");
        return;
    }

    System.out.println("Profesores de la Universidad:");
    for (Profesor profesor : profesores) {
        System.out.println(profesor);
    }
}

public void listarCursos() {
    if (cursos.isEmpty()) {
        System.out.println("No hay cursos registrados en la universidad.");
        return;
    }

    System.out.println("Cursos de la Universidad:");
    for (Curso curso : cursos) {
        System.out.println(curso);
    }
}


public Profesor buscarProfesorPorId(String id){
    int i = 0;
    Profesor profesorEncontrado = null;
    while(i < profesores.size() && !this.profesores.get(i).getId().equals(id)){
        i++;
    }
    if(i < profesores.size()){
        profesorEncontrado = this.profesores.get(i);
    }
    return profesorEncontrado;
}

public Curso buscarCursoPorCodigo(String codigo){
    int i = 0;
    Curso cursoEncontrado = null;
    while(i < cursos.size() && !this.cursos.get(i).getCodigo().equals(codigo)){
        i++;
    }
    if(i < cursos.size()){
        cursoEncontrado = this.cursos.get(i);
    }
    return cursoEncontrado;
}

public void eliminarCurso(String codigo) {
    Curso cursoABorrar = buscarCursoPorCodigo(codigo);
     if (cursoABorrar != null){
         
         cursoABorrar.setProfesor(null);
         this.cursos.remove(cursoABorrar);
         System.out.println("Curso eliminado: " + cursoABorrar.getNombre());
     } else {
         System.out.println("No se encontró ningún curso con el código: " + codigo);
     }
    
}

public void eliminarProfesor(String id){
    Profesor profesorABorrar = buscarProfesorPorId(id);
    if (profesorABorrar != null){
        profesores.remove(profesorABorrar);
        for (Curso curso : cursos) {
            if(curso.getProfesor() != null && curso.getProfesor().equals(profesorABorrar)){
                curso.setProfesor(null);       
            }
        }
           System.out.println("Profesor eliminado: " + profesorABorrar.getNombre());
    }
    System.out.println("No se encontró ningún profesor con el ID: " + id);

}

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}




