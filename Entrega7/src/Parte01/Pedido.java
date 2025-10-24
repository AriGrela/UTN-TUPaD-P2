
package Parte01;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private final List<Producto> productos = new ArrayList<>();
    private String estado = "Pendiente";
    private final Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        cliente.notificarCambio("Se agregó el producto: " + p.getNombre());
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambio("El pedido cambió de estado a: " + estado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public String getEstado() { return estado; }
    public List<Producto> getProductos() { return new ArrayList<>(productos); }
}