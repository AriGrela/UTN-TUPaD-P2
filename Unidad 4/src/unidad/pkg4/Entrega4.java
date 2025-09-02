package unidad.pkg4;

public class Entrega4 {

    public static void main(String[] args) {
    Empleado a = new Empleado(2045, "Ariel", "Emision", 1500000);
    Empleado b = new Empleado(202456, "Benito", "Programacion", 1400000);
    Empleado c = new Empleado("Carla", "Transmision");
    Empleado d = new Empleado("Daniela", "Coordinacion");
    
    a.actualizarSalario(0.15);
    c.actualizarSalario(100000);
    
    System.out.println(a);
    System.out.println(b.toString());
    System.out.println(c);
    System.out.println(d.toString());
    
    System.out.println("La cantidad de empleados es: "+  Empleado.mostrarTotalEmpleados());
    }
    
    
    
}
