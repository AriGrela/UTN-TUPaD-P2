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
public class Ejercicion10 {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
           System.out.println("Ingrese el stock actual del producto: ");
           int stockActual = input.nextInt();
           System.out.println("Ingrese la cantidad vendida: ");
           int cantidadVendida = input.nextInt();
           System.out.println("Ingrese la cantidad recibida: ");
           int cantidadRecibida = input.nextInt();
    
           int nuevoStock = actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
           
           System.out.println("El nuevo stock del producto es: " + nuevoStock);
           
       

       }
       
       
 static int actualizarStock(int stockActual,int cantidadVendida, int cantidadRecibida){
     int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
     return nuevoStock;
 }
 
}
