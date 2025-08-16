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
public class Ejercicio2 {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int num1 = input.nextInt();
    System.out.println("Ingrese otro numero: ");
    int num2 = input.nextInt();
    System.out.println("Ingrese un tercer numero: ");
    int num3 = input.nextInt();
    
    if (num1 > num2 && num1 > num3){
        System.out.println("El numero mayor es: " + num1);}
    else if (num2 > num1 && num2 > num3){
        System.out.println("El numero mayor es: " + num2);}
    else 
             System.out.println("El numero mayor es: " + num3);
     
        
    }
    
    
    

}
     

