/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

import java.util.Scanner;

/**
 *
 * @author Kalfito
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y tu edad es: " + edad);
        
        
    }
}
