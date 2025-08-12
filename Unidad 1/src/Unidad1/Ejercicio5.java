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
public class Ejercicio5 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int suma, resta, multiplicacion, num1, num2;
         double division;
         System.out.println("Ingrese un numero ");
         num1 = input.nextInt();
         System.out.println("Ingrese otro numero ");
         num2 = input.nextInt();
         suma = num1 + num2;
         resta = num1 - num2;
         multiplicacion = num1 * num2;
         division = num1 /  num2;
         
         System.out.println("La suma de sus numeros es: " + suma + "\nLa resta de sus numeros es: " + resta + "\nLa multiplicacion de sus numeros es: "
         + multiplicacion + "\nLa division de sus numeros es: " + division);            
         
     }
}
