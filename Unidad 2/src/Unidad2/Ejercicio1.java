/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author Kalfito
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int año = input.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
            System.out.println("El año " + año + " es bisiesto.");}
        else { 
            System.out.println("El año "+ año + " no es bisiesto.");
            
        }
        
        // TODO code application logic here
    }
    
}
