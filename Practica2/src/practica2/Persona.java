
package practica2;


public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    public Persona(String DNI, String nombre, String Apellido, String telefono, String mail){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
