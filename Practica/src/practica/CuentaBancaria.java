/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;


public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private double saldo;
   private String moneda;
   private String tipo;
   
    // CONSTRUCTOR
   
   public CuentaBancaria(String alias, String moneda, String tipo) {
       this.CBU = generarCBU();
       setAlias(alias);
       setMoneda(moneda);
       setTipo(tipo);
   }
   
   private String generarCBU(){
       return "1234567"; //pendiente datos aleatorios
   }
    void mostrarDatos () {
     System.out.println(CBU + " " + alias + " " + saldo
      + " " + moneda + " " + tipo);
    }

    public String getCBU() {
        return CBU;
    }
   

   public double obtenerSaldo () {
        return saldo;
    }
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String alias){
        if (alias !=null) {
            this.alias = alias;
        }
    }
    
       public void setMoneda(String moneda){
        if (moneda !=null) {
            this.moneda = moneda;
        }
    }
       
          public void setTipo(String tipo){
        if (tipo !=null) {
            this.tipo = tipo;
        }
    }
    public void depositar (double monto){
        if (monto > 0){
        saldo += monto;
        }
    }
    
    public boolean saldoDisponible(double monto){
        return saldo >= monto; // no hace falta hacer if else, ya es booleano esta expreison
        
    }
    
    void extraer (double monto) {
        if (saldoDisponible(monto)){
            saldo =- monto;
        }
    }
}
