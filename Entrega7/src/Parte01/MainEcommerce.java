
package Parte01;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ariel");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 12000));
        pedido.agregarProducto(new Producto("Teclado", 25000));
        System.out.println("Total sin descuento: $" + pedido.calcularTotal());

        // Elegimos un medio de pago
        PagoConDescuento medioPago = new TarjetaCredito(); // o new PayPal();
        double totalConDescuento = medioPago.aplicarDescuento(pedido.calcularTotal());
        medioPago.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");
        pedido.cambiarEstado("Enviado");
    }
}