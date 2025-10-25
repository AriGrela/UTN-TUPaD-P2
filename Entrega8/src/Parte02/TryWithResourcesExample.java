
package Parte02;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String ruta = "archivo.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}