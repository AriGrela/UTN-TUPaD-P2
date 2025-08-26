/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;


public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private  double saldo;
    
    void mostrarDatos () {
     System.out.println(CBU + " " + alias + " " + saldo);
    }
    
   public double getSaldo () {
        return saldo;
    }
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String nuevoAlias){
        if (nuevoAlias !=null) {
            alias = nuevoAlias;
        }
    }
    public void depositar (double monto){
        if (monto > 0){
        saldo += monto;
        }
    }
    
    private boolean saldoDisponible(double monto){
        return saldo >= monto; // no hace falta hacer if else, ya es booleano esta expreison
        
    }
    
    void extraer (double monto) {
        if (saldoDisponible(monto)){
            saldo =- monto;
        }
    }
}
