/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author Kalfito
 */
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("Ingrese el precio base del producto: ");
   double PrecioBase = input.nextDouble();
   System.out.println("Ingrese el impuesto en porcentaje (Ejemplo 10 para 10%): ");
   double impuesto = input.nextDouble();
   System.out.println("Ingrese el descuento en porcentaje (Ejemplo 5 para 5%): ");
   double descuento = input.nextDouble();
  
   double Precio = calcularPrecioFinal(PrecioBase, impuesto, descuento);
   
        System.out.println("El precio final del producto es: "+ Precio);
   
   
    
 } 
    
    
static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
    double PrecioFinal = precio + (precio * (impuesto / 100)) - (precio * (descuento / 100));
    return PrecioFinal;
    
    
    
}
}