
package Parte01;

public class Paypal implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con PayPal.");
    }

    @Override
    public double aplicarDescuento(double monto) {
        double total = monto * 0.85; // 15% descuento
        System.out.println("Descuento PayPal aplicado. Total: $" + total);
        return total;
    }
}