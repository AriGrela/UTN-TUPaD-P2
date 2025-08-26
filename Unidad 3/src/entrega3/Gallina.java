package entrega3;
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        if (edad >= 0 ){
          this.edad = edad;
        }
      }
    
    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0){
        this.huevosPuestos = huevosPuestos;
        }
    }
    
    public void ponerHuevo(){
       huevosPuestos = huevosPuestos + 1;
    }
    public void envejecer(){
       edad= edad + 1;
    }
    public void mostrarEstado(){
    System.out.println("idGallina: "+ idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos );
}
}
