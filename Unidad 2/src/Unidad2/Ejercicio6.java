package Unidad2;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg= 0 , ceros= 0 ;
        for (int i = 1; i<=10; i++){
            System.out.println("Ingrese el numero " + i + ":");
            int num = input.nextInt();
            if (num > 0){
                pos++;
                }else if (num < 0){
                    neg++;
                }else {
                    ceros++;
                }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: "+ pos);
        System.out.println("Negativos: "+ neg);
        System.out.println("Ceros: "+ ceros);
    }
}
