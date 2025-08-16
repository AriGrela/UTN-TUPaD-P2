

package Unidad2;


import java.util.Scanner;

/**
 *
 * @author Kalfito
 */
public class Ejercicion11 {

static double entradaSalida = 0.10;


    
public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Ingrese el precio del producto: ");
       double precioProducto = input.nextDouble();
       double descuentillo = calcularDescuentoEspecial(precioProducto);
       System.out.println("El descuento especial aplicado es: " + descuentillo);
       System.out.println("El precio final con decuento es: " + (precioProducto - descuentillo));
       
       
       
}


static double calcularDescuentoEspecial(double precio){
return (precio * entradaSalida);
}

}