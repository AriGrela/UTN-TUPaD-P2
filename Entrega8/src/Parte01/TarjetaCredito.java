
package Parte01;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Tarjeta de Crédito.");
    }

    @Override
    public double aplicarDescuento(double monto) {
        double total = monto * 0.90; // 10% descuento
        System.out.println("Descuento tarjeta aplicado. Total: $" + total);
        return total;
    }
}