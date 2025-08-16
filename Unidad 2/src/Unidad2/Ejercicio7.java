
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author Kalfito
 */
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    do {
        System.out.println("Ingrese una nota (0:10): ");
        num = input.nextInt();
        if (num < 0 || num > 10 ){
        System.out.println("Error: Nota Invàlida. Ingrese una nota entre 0 y 10");
        }
    }while (num < 0 || num > 10 );

    
        System.out.println("Nota guardada correctamente");

}
}

