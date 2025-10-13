
package Practica2;

public class Principal {
    
 public static void main(String[] args){
     Concesionaria c = new Concesionaria("FakeCar");
     
 
     c.agregarAuto(new Auto("ABC123","Rojo", 1003));
     c.agregarAuto(new Auto("BCD267","Verde", 2000));
     c.agregarAuto(new Auto("EFG245","Azul", 3000));
     c.agregarAuto(new Auto("HIJ2656","Morado", 4000));
     c.agregarAuto(new Auto("DS123","Anaranjado", 1003));
     c.agregarAuto(new Auto("GSG467","Celeste", 2000));
     c.agregarAuto(new Auto("CSD2656","Gris", 4000));
     
     Auto a = c.buscarAuto("EFG245");
     if (a == null){
         System.out.println("No se encontró");
     } else {
          System.out.println("Se encontró: " + a);  
     }
     
    //  System.out.println("Kms totales recorridos: " + c.sumatoriaKmsRecorridos() );
    //  System.out.println("Cantidad de autos: " + c.cantAutos());
    //  System.out.println("Promedio de kms recorridos: " + c.promedioKmsRecorridos());
     
    //  System.out.println("Auto con mayor cant de kms recorridos: " + c.autoMasKmsRecorridos());
     //System.out.println("Auto con menor cant de kms recorridos: " + c.autoMenosKmsRecorridos());
   
 }
}
 