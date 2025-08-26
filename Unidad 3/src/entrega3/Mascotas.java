
package entrega3;

public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    
     public void mostrarInfo() {
        System.out.println("Nombre: "+ nombre + "\nEspecie: " + especie + "\nEdad: " + edad );
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
        }
    }
     
     public int cumplirAnios(){
         edad = edad + 1;
         return edad;
     }

}
