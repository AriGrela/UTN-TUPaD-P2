
package Ejercicio02;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("Círculo", 3),
            new Rectangulo("Rectángulo", 4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Área: " + f.calcularArea());
        }
    }
}