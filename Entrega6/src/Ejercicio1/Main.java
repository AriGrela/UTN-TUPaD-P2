
package Ejercicio1;


public class Main {
   public static void main(String[] args) {
       
      Inventario inv = new Inventario();
      
      inv.agregarProducto(new Producto("ABC123", "Pan", 1000.0, 120, CategoriaProducto.ALIMENTOS));
      inv.agregarProducto(new Producto("EFG456", "Television", 15000.0, 40, CategoriaProducto.ELECTRONICA));
      inv.agregarProducto(new Producto("HJI235", "Remera", 1500.0, 300, CategoriaProducto.ROPA));
      inv.agregarProducto(new Producto("POR012", "Campera", 3000.0, 150, CategoriaProducto.ROPA));
      inv.agregarProducto(new Producto("LUM123", "Mesa", 50000.0, 10, CategoriaProducto.HOGAR));
      
      
     inv.listarProductos();
       
     System.out.println("---------------");
    
     System.out.println("Producto por ID:");
     System.out.println(inv.buscarProductoPorId("ABC123"));
     
     System.out.println("---------------");
     
     System.out.println("Filtrando por categoria:");
     System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ROPA));
     
     System.out.println("---------------");
     
     System.out.println("Eliminando producto: ");
     inv.eliminarProducto("HJI235");
     inv.listarProductos();
     
     System.out.println("---------------");
     System.out.println("Actualizando stock: ");
     inv.actualizarStock("LUM123", 15);
     System.out.println(inv.buscarProductoPorId("LUM123"));
     
     System.out.println("---------------");
     System.out.println("Mayor stock:");
     System.out.println(inv.ProductoconMayorStock());
     
     System.out.println("---------------");
     System.out.println("Entre $1000 y $3000");
     System.out.println(inv.ProductosPorPrecio(1000, 3000));
     
     System.out.println("---------------");
     inv.mostrarCategoriasDisponibles();
   }
    
}
