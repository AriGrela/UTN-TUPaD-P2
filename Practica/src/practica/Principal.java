
package practica;

public class Principal {
    
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();
        cb.CBU = "02139018409211232141";
        cb.alias = "miCuenta";
        cb.mostrarDatos();
       
        System.out.println(cb.obtenerSaldo());
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo());
        cb.depositar(-50);
        System.out.println(cb.obtenerSaldo());
        
        System.out.println(cb.saldoDisponible(100));
        System.out.println(cb.saldoDisponible(300));
        
        cb.extraer(50);
        System.out.println(cb.obtenerSaldo());
        
    }
    
}
