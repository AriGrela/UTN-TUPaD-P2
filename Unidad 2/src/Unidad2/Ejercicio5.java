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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 9, i = 0;
        while (num != 0 ){
            System.out.println("Ingrese un numero (0 para terminar):");
            num = input.nextInt();
            if ((num % 2) == 0){
            i += num;
            }
            
       
       }
        System.out.println("La suma de los numeros pares es: " + i);

    }
}
