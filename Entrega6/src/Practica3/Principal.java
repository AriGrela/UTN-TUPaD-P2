
package Practica3;

import java.util.ArrayList;


public class Principal {
    
    public static void main(String[] args) {
      
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
//        f.listarInstrumentos();
//        ArrayList <Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.VIENTO);
//       for (Instrumento instrumento: lista) {
//           System.out.println(instrumento);
//       }
        
   Instrumento borrado = f.borrarInstrumento("ABC123");
        System.out.println("Se borro: " + borrado);
        f.listarInstrumentos();
        
        double[] porcs = f.porcInstrumentosPorTipo("Sucursal A");
        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
            
        }
   }


    
    private static void cargarFabrica(Fabrica f){
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        
        s1.agregarInstrumento(new Instrumento("ABC123", 12321, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BDE2121", 123251, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("CADSA131", 123321, TipoInstrumento.PERCUSION));
       
        s2.agregarInstrumento(new Instrumento("EFSA1321", 3215, TipoInstrumento.PERCUSION));
        s2.agregarInstrumento(new Instrumento("CADSA421", 1212321, TipoInstrumento.VIENTO));
        
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);   
    }
}
