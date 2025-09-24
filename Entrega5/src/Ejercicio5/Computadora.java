
package Ejercicio5;


public class Computadora {
   private String marca;
   private String numeroSerie;
   private PlacaMadre placaMadre;
   private Propietario propietario;
   

public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre){
   this.marca=marca;
   this.numeroSerie=numeroSerie;
   this.placaMadre=placaMadre;
   this.propietario=propietario;
}

public void asignarPropietario(Propietario propietario){
       this.propietario = propietario;
       propietario.setComputadora(this);
}
}
