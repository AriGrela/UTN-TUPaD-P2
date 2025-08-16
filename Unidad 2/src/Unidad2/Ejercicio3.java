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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        if (edad < 12){
            System.out.println("Eres un niño");
        }else if (edad >= 12 && edad <= 17 ){
            System.out.println("Eres un Adolescente");
        }else if (edad >=18 && edad <= 59){
            System.out.println("Eres un Adulto");
        }else {
            System.out.println("Eres un Adulto Mayor");
        }

    }
}
