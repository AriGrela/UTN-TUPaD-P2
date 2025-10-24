
package Parte02;

import java.io.*;

public class LecturaArchivo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
