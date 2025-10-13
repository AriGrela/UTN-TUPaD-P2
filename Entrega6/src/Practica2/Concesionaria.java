
package Practica2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Concesionaria {
    
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre= nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a){
        this.autos.add(a);
    }
    
       public int cantAutos(){
        return autos.size();
    }
  
  public Auto buscarAuto (String patente) {
      Auto autoEncontrado = null;
      Iterator<Auto> it = this.autos.iterator();
      while (it.hasNext() && autoEncontrado == null){
          Auto a = it.next();
          if (a.getPatente().equalsIgnoreCase(patente)){
              autoEncontrado = a;
          }
          
      }
      return autoEncontrado;
  }
}
      
     // MANERA CON WHILE 
      /* 
       public Auto buscarAuto (String patente) {
      Auto autoEncontrado = null;
     int i = 0;
      while (i < cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)) { 
          i++;
      }
      if (i <cantAutos()){
          autoEncontrado = this.autos.get(i);
   //  }
    //  return autoEncontrado;
  }

}*/
    
  /*   public Auto autoMasKmsRecorridos(){ 
        Auto autoMax = null;
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos()> kmsMax){
                kmsMax = auto.getKmsRecorridos();
                autoMax = auto;
            }
           }
        return autoMax;
          }
    
   private int maxKmsRecorridos() {
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos()> kmsMax){
                kmsMax = auto.getKmsRecorridos();
            }
            
        }
        return kmsMax;
    }
    
    public ArrayList<Auto> autosMasKmsRecorridos(){
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = maxKmsRecorridos();
        for (Auto auto : autos){
            if (auto.getKmsRecorridos() == kmsMax ){
            listaDeMaximos.add(auto);
        }
      }
            return listaDeMaximos;
    }


    
        public ArrayList<Auto> autosMasKmsRecorridos(){
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = -1;
        for (Auto auto : autos){
            if (auto.getKmsRecorridos() == kmsMax ){
            listaDeMaximos.add(auto);
        } else if(auto.getKmsRecorridos()> kmsMax) { 
            kmsMax = auto.getKmsRecorridos();
            listaDeMaximos.clear();
            listaDeMaximos.add(auto);
        }
      }
            return listaDeMaximos;
    }

        
    public Auto autoMenosKmsRecorridos(){ 
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos()< kmsMin){
                kmsMin = auto.getKmsRecorridos();
                autoMin = auto;
            }
            
        }
        return autoMin;
    }     
    
    public int sumatoriaKmsRecorridos(){
        int acu = 0;
        for (Auto auto : autos){
            acu = acu + auto.getKmsRecorridos();
        }
        return acu;
    }
    
    public double promedioKmsRecorridos() {
        /* double promedio = 0;
        if (cantAutos() > 0){
          return (double) sumatoriaKmsRecorridos() / cantAutos();  
        }
       return promedio; //
       return (cantAutos() > 0 ? (double) sumatoriaKmsRecorridos() / cantAutos() : 0) ; 

    }
}
 */