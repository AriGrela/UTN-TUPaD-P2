
package Ejercicio1;

import java.util.ArrayList;


public class Inventario {
    
    private ArrayList<Producto> productos;
    
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        this.productos.add(p);            
    }
    
    public void listarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto prodEncontrado = null;
        while(i < productos.size() && !this.productos.get(i).getId().equals(id)){
            i++;
        }
        if( i < productos.size()){
            prodEncontrado = this.productos.get(i);
        }
        return prodEncontrado;
    }
    
    public Producto eliminarProducto(String id){
        Producto prodABorrar = buscarProductoPorId(id);
        this.productos.remove(prodABorrar);
        return prodABorrar;
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto prodACambiar = buscarProductoPorId(id);
       if (prodACambiar != null) {                      
        prodACambiar.setCantidad(nuevaCantidad);     
        System.out.println("Stock actualizado para el producto " + id);
    } else {
        System.out.println("Producto con ID " + id + " no encontrado.");
    }   
 }
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria){
                prodEncontrados.add(producto);
            }
        }
        return prodEncontrados;
    }
    
    public int obtenerTotalStock(){
        int stockTotal = 0;
        for (Producto producto : productos) {
           stockTotal += producto.getCantidad();
        }
        return stockTotal;
    }
    
    public ArrayList<Producto> ProductoconMayorStock(){
       ArrayList<Producto> listaMayores= new ArrayList<>();
       int stockMax = -1;
        for (Producto producto : productos) {
            if( producto.getCantidad() == stockMax){
                listaMayores.add(producto);
            }else if(producto.getCantidad() > stockMax){
                stockMax = producto.getCantidad();
                listaMayores.clear();
                listaMayores.add(producto);
            }
            
        }
        return listaMayores;
    }
    
    public ArrayList<Producto> ProductosPorPrecio(double min, double max){
        ArrayList<Producto> listaRango = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getPrecio() >= min && producto.getPrecio()<= max){
                listaRango.add(producto);
            }
        }
        return listaRango;
    }
    
    public void mostrarCategoriasDisponibles() {
    System.out.println("Categorias disponibles:");

    for (CategoriaProducto categoria : CategoriaProducto.values()) {
        System.out.println(categoria + " - " + categoria.getDescripcion());
    }
}
}
