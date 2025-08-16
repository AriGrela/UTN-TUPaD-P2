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
public class Ejercicio4 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el precio del producto: ");
            double precio = input.nextDouble();
            System.out.print("Ingrese su categoria (A, B o C):  ");
            char categoria = input.next().charAt(0);
            
            switch(categoria){
                case 'A', 'a':
                    System.out.println("Precio original: " + precio);
                    System.out.println("Descuento: " + "10%");
                    System.out.println("Precio total: " + (precio - (precio * 0.10)));
                    break;
                case 'B', 'b':
                    System.out.println("Precio original: " + precio);
                    System.out.println("Descuento: " + "15%");
                    System.out.println("Precio total: " + (precio - (precio * 0.15)));
                    break;
                case 'C', 'c':
                    System.out.println("Precio original: " + precio);
                    System.out.println("Descuento: " + "20%");
                    System.out.println("Precio total: " + (precio - (precio * 0.20)));
                    break;
                            
                    
            }
            

        }

}
