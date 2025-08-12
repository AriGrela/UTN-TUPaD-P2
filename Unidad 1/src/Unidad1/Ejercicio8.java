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
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = input.nextInt();
        int divisionEnteros = num1 / num2;
        System.out.println("Resultado con enteros: " + divisionEnteros);
        double divisiondouble = ((double)num1 / num2);
        System.out.println("Su numero en decimales es: "+ divisiondouble);

        
    
    }
            }
    

            