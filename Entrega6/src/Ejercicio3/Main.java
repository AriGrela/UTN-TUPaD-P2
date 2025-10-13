package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
 
        Universidad u = new Universidad("UTN");


        Profesor cortazar = new Profesor("P01", "Julio Cortázar", "Literatura");
        Profesor allende = new Profesor("P02", "Isabel Allende", "Narrativa");
        Profesor marquez = new Profesor("P03", "Gabriel García Márquez", "Realismo mágico");


        Curso c1 = new Curso("C01", "Rayuela", null);
        Curso c2 = new Curso("C02", "Cuentos de Cortázar", null);
        Curso c3 = new Curso("C03", "La casa de los espíritus", null);
        Curso c4 = new Curso("C04", "Cien años de soledad", null);
        Curso c5 = new Curso("C05", "Narrativa Latinoamericana", null);


        u.agregarProfesor(cortazar);
        u.agregarProfesor(allende);
        u.agregarProfesor(marquez);

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        System.out.println("------------");
        System.out.println("Profesores y cursos agregados correctamente.");

        
        u.asignarProfesorACurso("C01", "P01");
        u.asignarProfesorACurso("C02", "P01");
        u.asignarProfesorACurso("C03", "P02");
        u.asignarProfesorACurso("C04", "P03");
        u.asignarProfesorACurso("C05", "P03");

        System.out.println("------------");
        System.out.println("Profesores asignados a cursos correctamente.");


        System.out.println("------------");
        System.out.println("Listado de profesores:");
        u.listarProfesores();

        System.out.println("------------");
        System.out.println("Listado de cursos:");
        u.listarCursos();


        System.out.println("------------");
        System.out.println("Cambiando el profesor del curso 'Rayuela' (C01)...");
        u.asignarProfesorACurso("C01", "P02");

        System.out.println("------------");
        System.out.println("Verificando sincronización tras el cambio:");
        u.listarProfesores();
        u.listarCursos();


        System.out.println("------------");
        System.out.println("Eliminando el curso 'La casa de los espíritus' (C03)...");
        u.eliminarCurso("C03");
        System.out.println("Verificando cambios:");
        u.listarProfesores();
        u.listarCursos();


        System.out.println("------------");
        System.out.println("Eliminando al profesor 'Gabriel García Márquez' (P03)...");
        u.eliminarProfesor("P03");
        System.out.println("Verificando que sus cursos quedaron sin profesor:");
        u.listarCursos();


        System.out.println("------------");
        System.out.println("Reporte: cantidad de cursos por profesor");
        for (Profesor p : u.getProfesores()) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }

        System.out.println("------------");
        System.out.println("Fin del reporte de la Universidad " + u.getNombre());
    }
}
