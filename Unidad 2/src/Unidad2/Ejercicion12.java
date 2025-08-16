/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2;

/**
 *
 * @author Kalfito
 */
public class Ejercicion12 {
public static void main(String[] args) {
double[] precios = {199.99,299.5,149.75,399.0,89.99};

System.out.println("Precios Originales:");
mostrarPrecios(precios);

precios[2] = 129.99;

System.out.println("Precios Modificados:");
mostrarPrecios(precios);


    
  }

static void mostrarPrecios(double[] array) {
    for (double precio : array) {
        System.out.println("Precio: $" + precio);
    }
}

}

