
package Ejercicio03;

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, int diasTrabajados, double pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return diasTrabajados * pagoPorDia;
    }

    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Lucía", 200000),
            new EmpleadoTemporal("Ariel", 20, 8000)
        };

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoTemporal) {
                System.out.println("→ Tipo: Temporal");
            } else {
                System.out.println("→ Tipo: Planta Permanente");
            }
        }
    }
}