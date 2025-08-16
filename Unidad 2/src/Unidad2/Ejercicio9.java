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
public class Ejercicio9 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.println("Ingrese el peso del paquete en KG: ");
        double pesoDelPaquete = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zonaEnvio = input.nextLine();
        double envio = calcularCostoEnvio(pesoDelPaquete,zonaEnvio);
        double precio = calcularTotalCompra(precioProducto, envio );  
       
        System.out.println("El costo del envio es: " + envio );
        System.out.println("El total a pagar es: " + precio);
   
        

    }

    
    static double calcularCostoEnvio(double peso, String zona){
        double pesoTotal = 0 ;
        if (zona.equalsIgnoreCase("Nacional")){
            pesoTotal = peso * 5;
         }else if (zona.equalsIgnoreCase("Internacional")){
            pesoTotal = peso * 10;
             }else {
             System.out.println("Zona inválida. Usando costo por defecto de 0.");
             pesoTotal = 0;
         }
     return pesoTotal;   
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalcompra = precioProducto + costoEnvio;
        return totalcompra;
    }
}
